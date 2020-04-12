
public interface ISPDemoConsole {
	boolean PrintContent(String content);

	boolean ScanContent(String content);

	boolean PhotoCopyContent(String content);
}

public interface IFaxContent {
	boolean FaxContent(String content);
}

public interface IPrintDuplex {
	boolean PrintDuplexContent(String content);
}
