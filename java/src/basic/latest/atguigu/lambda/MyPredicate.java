package basic.latest.atguigu.lambda;

@FunctionalInterface
public interface MyPredicate<T> {

	 boolean test(T t);
	
}
