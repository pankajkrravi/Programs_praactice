
public class HPLaserJet implements ISPDemoTask {

	@Override
	public boolean PrintContent(String content) {
		System.out.println("Print Done");
		return true;
	}

	@Override
	public boolean ScanContent(String content) {
		System.out.println("Scan Done");
		return true;
	}

	@Override
	public boolean FaxContent(String content) {
		System.out.println("Fax Done");
		return true;
	}

	@Override
	public boolean PhotoCopyContent(String content) {
		System.out.println("PhotoCopy Done");
		return true;
	}

}
