public class DepartmentParm {

    private String name = "我是测试1部门";
    private String name_en;
    private Integer parentid = 1;
    private Integer order;
    private Integer id;

    DepartmentParm(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName_en() {
        return name_en;
    }

    public void setName_en(String name_en) {
        this.name_en = name_en;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "DepartmentParm{" +
                "name='" + name + '\'' +
                ", name_en='" + name_en + '\'' +
                ", parentid=" + parentid +
                ", order=" + order +
                ", id=" + id +
                '}';
    }
}
