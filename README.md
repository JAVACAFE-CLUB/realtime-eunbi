## Realtime Trending Searches

역사속으로 사라진 네이버 실시간 검색어 순위 서비스를 직접 구현하고자 합니다!

### 1. 전체 프로세스

<img width="921" height="61" alt="Image" src="https://github.com/user-attachments/assets/2f09e472-db7c-4aae-b84a-c7938fc8544f" />

<br>

### 2. 기술 명세

| 구분                          | 설명                                                           | 사용 기술 / 대표 라이브러리                |
| ----------------------------- | -------------------------------------------------------------- | ------------------------------------------ |
| **Crawling**                  | API를 활용한 데이터 수집                                       | Python, Tweepy                             |
| **Preprocessing**             | 클렌징 -> 토큰화 -> 불용어 -> 형태소 -> 키워드 -> 구조화(JSON) | Python, KoNLPy                             |
| **Storage (Buffering Layer)** | Memory Queue(Buffer)                                           | Kafka                                      |
| **Indexing**                  | 색인                                                           | Elasticsearch                              |
| **Backend**                   |                                                                | Kotlin, Spring Boot, JPA                   |
| **Frontend**                  | Vibe Coding FE 구현                                            | React, TypeScript                          |
| **DB**                        | Backend RDB                                                    | PostgreSQL                                 |
| **Deployment**                |                                                                | Docker                                     |
| **CI/CD**                     |                                                                | Jenkins                                    |
| **IDE**                       | JetBrains Tool                                                 | PyCharm (Python), IntelliJ (Kotlin/Spring) |

### 3. 🚜 Directory Structure

```
├── backend
├── data-processing
│   ├── crawler
│   └── preprocessor
├── docs
├── frontend
├── indexer
└── README.md
```
