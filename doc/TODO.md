# [은비] 과제 Setup

Web Page를 한번 만들어보자. 

Web Page를 만들려면 어떤 일을 해야할 지 먼저 정의해보면, 

- [ ] 농수산물 판매 사이트
    - [ ] 로그인
    - [ ] 고구마, 감자 판매 리스트
    - [ ] 장바구니
    - [ ] 결제
- Spring : Controller → Service → Mapper (mybatis) → Data (VO)
    - Login 처럼 oauth

1. 어떤 목적의 사이트를 만들 것인가?
    1. Spring의 기본 API 만드는 법 ( API - DB ) 
    2. Spring의 기타 잡 annotation들의 의미 
        1. autowired 
        2. lombok.data
        3. repository
        4. restcontroller 
        5. GET, POST, DELETE, PUT 
2. 어떤 기능등을 제공할 것인가?
    1. [https://freshmarket-farmmorning.co.kr/](https://freshmarket-farmmorning.co.kr/) 
    2. 로그인 (id, pw), 간편비밀번호 
    3. 상품 리스트 (전체, 카테고리)
    4. 상세페이지 
    5. 구매
    6. 장바구니
3. 어떤 뷰로 보여줄 것 인가? 
    1. 다음시간까지 대충 그려서 와주세요 
    2. vue를 최소한이지만, 조금이라도 써서 구현 
4. 이 뷰를 보여주기 위해서는 어떤 로직들이 필요할까? 
5. DB 설계, 만들기 
    1. user
    2. product
    
    
---

# TODO
- [ ] View 구성안 대충 손으로 그려오기 (사진, 패드로 그려서 스케치, ppt)
- [ ] DB 설계 (user, product) 
  - product : 카테고리, 물품명, 가격, 갯수, 판매여부, 판매날짜, 판매된 사람 정보 (user id와 연결) 
  - user : 
