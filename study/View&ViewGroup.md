# View와 ViewGroup의 관계
![image](https://user-images.githubusercontent.com/46439995/85006530-33788000-b195-11ea-8db4-87ff7ebfbe7e.png)
- reference ) [섭이섭이의 하루](https://ehdtjq0411.tistory.com/5)

# View

### [대표적인 view] 
- TextView
- Button
- EditText
- ImageView

### [View의 상속]
- TextView, Button, EditText, ImageView 와 같은 모든 요소들은 View class를 상속받고 있다.
- VIew는 자신이 화면 어디에 그려져야 하는지에 대한 정보가 없으므로, 배치하기 위해 ViewGroup이 필요

------------------

# ViewGroup
### [대표적인 ViewGroup]
- LinearLayout
- RelativeLaytout
- FrameLayout
- TableLayout
