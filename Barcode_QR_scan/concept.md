# Barcode/QR scan Concept

- Zxing open source 사용
- 인식 process
  1. cam에 들어오는 QR 코드 영상 변환 => Image Conversion
  2. 이미지를 0,1로 변환하여, QR code의 위치 인식 심볼을 검출하고 방향을 조정하여, 정렬 => QR Detecting
  3. raw data를 decoding 하여 데이터 생성
  
- reference
  1. [QR process 관련](codingcoding.tistory.com/95)
