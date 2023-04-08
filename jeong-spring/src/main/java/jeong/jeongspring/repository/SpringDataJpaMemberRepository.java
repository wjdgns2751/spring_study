package jeong.jeongspring.repository;

import jeong.jeongspring.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

//인터페이스를 참조 할때는 상속(extends)를 사용한다. 자동으로 등록
public interface SpringDataJpaMemberRepository extends JpaRepository<Member,Long> , MemberRepository  {

    @Override
    Optional<Member> findByName(String name);

    @Override
    Optional<Member> findById(Long id);

    @Override
    List<Member> findAll();

    @Override
    Member save(Member member);


}
