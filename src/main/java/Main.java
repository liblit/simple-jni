class Main {
    static private native void nativeCall();

    static public void main(String[] args) {
	System.out.println("before native call");
	nativeCall();
	System.out.println("after native call");
    }
}
