package top.sea521.design.builder;

/**
 * the class is create by @Author:oweson
 *
 * @Date：2019/6/4 0004 16:32
 */
public class Square {
    private int color;
    private int borderSize;

    // private，让外面无法直接创建
    private Square(Builder builder) {
        this.color = builder.color;
        this.borderSize = builder.borderSize;

    }

    public static class Builder {
        private int color;
        private int borderSize;


        public Builder setColor(int color) {
            return this;
        }

        public Builder setBorderSize(int size) {
            return this;
        }    //边框大小
        public Builder setSize(int size) {
            return this;
        }    //边框大小

        public Builder setBorderColor(int color) {
            return this;
        }    //边框颜色

        public Builder setPadding(int left, int top, int right, int bottom) {
            return this;
        }


        public Square build() {
            // ...检查参数之间的关系是否设置正确...
            return new Square(this);
        }
    }

    @Override
    public String toString() {
        return "Square{" +
                "color=" + color +
                ", borderSize=" + borderSize +
                '}';
    }

    public static void main(String[] args) {
        Square square = new Square.Builder().setSize(50).setColor(210).setBorderSize(5)
                .setBorderColor(100).build();
        System.out.println(square);
    }
}
