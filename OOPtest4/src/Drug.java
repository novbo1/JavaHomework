
public class Drug {
	private String size;
	private int addLife;
	private int addMagic;
	
	public Drug() {}
	
	public Drug(String size) {
		this.size = size;
		
		switch (size) {
        case "Large":
            this.addLife = 120;
            this.addMagic = 100;
            break;
        case "Medium":
            this.addLife = 80;
            this.addMagic = 60;
            break;
        case "Small":
            this.addLife = 50;
            this.addMagic = 30;
            break;
        default:
            this.addLife = 0; // Default case if invalid size
            this.addMagic = 0;
            break;
		}
	}
	
	public String getSize() {
        return size;
    }
	
	public void setSize(String size) {
		this.size = size;
	}

    public int getAddLife() {
        return addLife;
    }

    public int getAddMagic() {
        return addMagic;
    }
    
    
}