class MyAutoCloseableResource implements AutoCloseable {
	@Override
	public void close() throws Exception {
		System.out.println("close method called");
	}

	public void doSomething() throws MyException1, MyException2 {
		System.out.println("doing something ...");
	}
}