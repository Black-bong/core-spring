package hello.core.service;

import hello.core.member.Member;

public interface MemberService {

    void joinMember(Member member);

    Member fineMember(Long memberId);
}
