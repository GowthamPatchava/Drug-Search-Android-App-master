package in.tvac.akshayejh.firebasesearch;


public class Users {

    public String name, image, status, price;

    public Users(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice(){
        return price;
    }

    public void setPrice(String price){
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Users(String name, String image, String status, String price) {
        this.name = name;
        this.image = image;
        this.status = status;
        this.price = price;
    }
}
