package models;

public class HockeyStick {

        private Integer id;
        private String name;
        private String brand;
        private Integer size;
        private Integer qty;
        private Double price;

        public HockeyStick(){
        }

        public HockeyStick(Integer id, String name, String brand, Integer size, Integer qty, Double price) {
                this.id = id;
                this.name = name;
                this.brand = brand;
                this.size = size;
                this.qty = qty;
                this.price = price;
        }

        public Integer getId() {
                return id;
        }

        public void setId(Integer id) {
                this.id = id;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getBrand() {
                return brand;
        }

        public void setBrand(String brand) {
                this.brand = brand;
        }

        public Integer getSize() {
                return size;
        }

        public void setSize(Integer size) {
                this.size = size;
        }

        public Integer getQty() {
                return qty;
        }

        public void setQty(Integer qty) {
                this.qty = qty;
        }

        public Double getPrice() {
                return price;
        }

        public void setPrice(Double price) {
                this.price = price;
        }

}
