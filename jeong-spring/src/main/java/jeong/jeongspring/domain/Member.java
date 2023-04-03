package jeong.jeongspring.domain;

public class Member {

    /**
     *    optional + ↑ = 전체 선택
     *    Command + N = 으로 Getter , Setter 생성
     *    Command + enter =
     * */
    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
