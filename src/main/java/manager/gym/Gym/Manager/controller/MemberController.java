package manager.gym.Gym.Manager.controller;

import manager.gym.Gym.Manager.entity.Member;
import manager.gym.Gym.Manager.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/members")
@CrossOrigin(origins = "http://localhost:3000")
public class MemberController {
    @Autowired
    private MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping
    public ResponseEntity<List<Member>> getAllMembers() {
        return memberService.getAllMembers();
    }

    @GetMapping("/{memberId}")
    public Member getMemberById(@PathVariable Integer memberId) {
        return memberService.getMemberById(memberId);
    }

    @PostMapping("/add")
    public Member createMember(@RequestBody Member member) {
        return memberService.createMember(member);
    }

    @PutMapping("/{memberId}")
    public Member updateMember(@PathVariable Integer memberId, @RequestBody Member member) {
        return memberService.updateMember(memberId, member);
    }

    @DeleteMapping("/{memberId}")
    public void deleteMember(@PathVariable Integer memberId) {
        memberService.deleteMember(memberId);
    }
}
