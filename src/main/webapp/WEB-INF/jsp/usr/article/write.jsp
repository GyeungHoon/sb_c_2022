<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:set var="pageTitle" value="게시물 수정" />
<%@ include file="../common/head.jspf"%>

<section class="mt-5">
  <div class="container mx-auto px-3">
    <form class="table-box-type-1" method="POST" action="../article/doWrite">
      <table>
        <colgroup>
          <col width="200" />
          <col />
        </colgroup>
        <tbody>
          <tr>
            <th>작성자</th>
            <td>${rq.loginedMember.nickname }</td>
          </tr>
          <tr>
            <th>게시판</th>
            <td>
              <select name="boardId">
                <option required="required" selected>게시판을 선택해주세요</option>
                <option value="1" >공지게시판</option>
                <option value="2" >자유게시판</option>
              </select>
            </td>
          </tr>
          <tr>
            <th>제목</th>
            <td>
              <input  class="w-96 input input-bordered" name="title" type="text" required="required" placeholder="제목" " />
            </td>
          </tr>

          <tr>
            <th>내용</th>
            <td>
              <textarea class="w-full textarea textarea-bordered" name="body" rows="10" required="required" placeholder="내용"></textarea>
            </td>
          </tr>
          <tr>
            <th>작성</th>
            <td>
              <button type="submit" class="btn btn-primary">작성</button>
              <button type="button" class="btn btn-secondary btn-outline" onclick="history.back();">뒤로가기</button>
            </td>
          </tr>
        </tbody>
      </table>
    </form>
    <div class="btns"></div>
  </div>
</section>

<%@ include file="../common/foot.jspf"%>