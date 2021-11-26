package net.lihui.app.plugin.thoughtworkscodereviewtools.mapper;

import com.julienvey.trello.domain.Member;
import net.lihui.app.plugin.thoughtworkscodereviewtools.idea.store.TrelloBoardMember;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface MemberMapper {
    MemberMapper MEMBER_MAPPER = Mappers.getMapper(MemberMapper.class);

    TrelloBoardMember toState(Member member);

    List<TrelloBoardMember> toStateList(List<Member> members);
}
