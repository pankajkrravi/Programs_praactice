
public interface ISPDemoTask {
	boolean PrintContent(String content);

	boolean ScanContent(String content);

	boolean FaxContent(String content);
	boolean PhotoCopyContent(String content);
	boolean PrintDuplexContent(String content);
}
