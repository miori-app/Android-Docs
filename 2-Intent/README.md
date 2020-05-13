# Intent
![image](https://user-images.githubusercontent.com/46439995/81828898-43d58380-9575-11ea-8e32-ed1a87dfb9ff.png)
- reference : https://medium.com/@saranyaan2710/android-tutorials-for-beginners-intents-and-filters-127970430ee4
- activity 끼리 서로 호출하기 위해 필요
- example code
 ```
b3.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        //명시적인 Intent를 사용해서 UiAss 호풀 (현재인자, 호출할 인자)
        Intent intent = new Intent(MainActivity.this,UiAss.class);
        startActivity(intent);
    }
});
```

## activity 간 값전달
- putExtra
- getIntExtra, getSTringExtra...
