# Springboot-shoppingmall 💽
> 2023.02.13 ~ 2023.03.13까지 진행한 관리자모드 기반 쇼핑몰 프로젝트입니다.

## ❕ Description ❕
<table>
  <tr>
    <td>
Mixtape Seoul 이라는 음악 제작을 위한 디지털 믹스테이프를 판매, 제공하는 아티스트 타겟 쇼핑몰 벤치마킹 사이트
    </td>
  </tr>
</table>

![MainIndex_1](https://user-images.githubusercontent.com/116870668/233907592-9cd7342d-1dc8-458b-91e1-6e19ff09a73d.jpg)

<br>

## ➰기획 배경 및 해결하고자 하는 문제
<table>
  <tr>
    <td>
여러 상품(음악 트랙) 목록이 한 눈에 들어오는 장점이 있고, 타 쇼핑몰과 달리 항목이 많지 않고 상품 이미지가 난잡하지 않아 차분한 느낌이 들었습니다.
또, 기존의 Mixtape Seoul에는 없는 아티스트들이 서로 소통을 할 수 있는 커뮤니티 게시판을 추가하여 구현해보았습니다.
    </td>
  </tr>
</table>

<br>

## ➰개발 관련 문서
### ERD

![DB design](https://user-images.githubusercontent.com/116870668/233907352-f40ad61f-f589-41a4-add1-5ad99126ac35.jpg)


<br>

## ➰사용한 기술 및 배포 환경
<table>
  <tr>
    <th>OS</th>
    <th>Database</th>
    <th>IDE</th>
    <th>Framework</th>
    <th>Language</th>
  </tr>
  <tr>
    <td>Windows 10</td>
    <td>MySqL</td>
    <td>IntelliJ, Visual Studio Code</td>
    <td>Spring Boot</td>
    <td>Java, HTML, CSS, Javascript</td>
  </tr>
</table>

<br>

## ➰Team (담당한 업무)
<details>
<summary> 이지창 </summary>

1. DB설계
2. 장바구니 서비스(CRD)
3. 마이페이지
4. AWS EC2 배포
</details>
<details>
<summary> 강창신 </summary>

1. 페이지 Header&Footer layout
2. main&Admin 페이지
3. 게시판 댓글 기능
</details>
<details>
<summary> 김득주 </summary>

1. 회원서비스(CRUD)
2. Spring Security
</details>
<details>
<summary> 장효선 </summary>

1. 상품서비스(CRUD) 
2. 메인페이지, 로그인, 회원가입페이지 디자인(Html,CSS) 제작
3. Chat-bot
</details>
<details>
  
<summary> 허인경 </summary>
  
1. 게시판서비스(CRUD)
2. PPT제작
</details>

***

## 📋 상품페이지 기능

<table>
  <tr>
    <td>
상품페이지는 관리자 권한이 있는 사용자만 등록, 수정, 삭제 권한을 부여하여 처리 하였습니다.
    </td>
  </tr>
</table>

## ➰상품페이지 View 영상
### 관리자 로그인

![project1_admin](https://github.com/wkdgytjs/Groupware-pj/assets/116870668/edb835a5-fb3c-406c-89ab-fb651fbf04c4)

### 사용자 로그인

![project1_member](https://github.com/wkdgytjs/Groupware-pj/assets/116870668/94022dd6-6a95-4ee7-82dd-75e7b015234f)

### 디렉토리 구성 및 ERD
<details>
<summary>디렉토리 구성</summary>
  
![track](https://github.com/wkdgytjs/Groupware-pj/assets/116870668/8901fbcd-2c85-4abe-8ba4-1ed121feaa6d)

</details>
<details>
  
<summary>ERD</summary>
  
![mixtape_erd](https://github.com/wkdgytjs/Groupware-pj/assets/116870668/5be5cf36-a328-40aa-b5ca-a30aff4e410c)
  
> 사용자 한명이 여러 상품을 담을 수 있고 장바구니에 여러 상품들이 담길 수 있어 member테이블은 item테이블과 1:N  item테이블은 cart_item테이블과 1:N 관계 설정
</details>

🔗Project(team) github Link : [MixtapeBM_SoppingMall](https://github.com/jichang-lee/Academy_first_project/tree/master)

