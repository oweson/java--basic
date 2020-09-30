package top.sea521.design.creational.builder;

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
        private int size;

        private int borderSize;
        private int borderColor;

        // 颜色
        public Builder setColor(int color) {
            this.color = color;
            return this;
        }

        //大小
        public Builder setSize(int size) {
            this.size = size;
            return this;
        }

        //边框大小
        public Builder setBorderSize(int borderSize) {
            this.borderSize = borderSize;
            return this;
        }


        //边框颜色


        public Builder setBorderColor(int borderColor) {
            this.borderColor = borderColor;
            return this;
        }

        public Builder setPadding(int left, int top, int right, int bottom) {
            return this;
        }


        public Square build() {
            // ...检查参数之间的关系是否设置正确...
            Square square = new Square(this);
            return square;
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
        Square square = new Builder().setSize(50).setColor(210).setBorderSize(5).setBorderSize(210)
                .setBorderColor(100).setPadding(1, 2, 3, 4).build();
        System.out.println(square);
    }
}
