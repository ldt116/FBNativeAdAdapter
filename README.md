# FBNativeAdAdapter

`FBNativeAdAdapter` provide a `RecyclerView.Adapter` wrapper which can show [Facebook Audience Network Native Ad](https://developers.facebook.com/docs/audience-network/native-ads). `FBNativeAdAdapter` helps you easily add the native ad among your data in `RecyclerView.Adapter`.

# Installation

You can get `FBNativeAdAdapter` via `jCenter` repository

```groovy
compile 'me.timos.thuanle:fb-native-ad-adapter:1.3.0'
```

# Usage

You can check the example in this repo. Basically, the usage of `FBNativeAdAdapter` is as below

```java
MyAdapter adapter = new MyAdapter();//Your Adaper 
FBNativeAdAdapter fbAdapter = FBNativeAdAdapter.Builder.with(PLACEHOLDER_ID, adapter)
        .build();

RecyclerView rv = (RecyclerView) findViewById(R.id.rv);
rv.setAdapter(fbAdapter);
rv.setLayoutManager(new LinearLayoutManager(this));
```

If you want to span between columns in `GridLayout`, here is it

```java
GridLayoutManager lm = new GridLayoutManager(this, 3);
MyAdapter adapter = new MyAdapter();//Your adapter
FBNativeAdAdapter fbAdapter = FBNativeAdAdapter.Builder.with(PLACEHOLDER_ID, adapter)
        .adItemIterval(9)
        .enableSpanRow(lm)
        .build();
RecyclerView rv = (RecyclerView) findViewById(R.id.rv);
rv.setLayoutManager(lm);
rv.setAdapter(fbAdapter);
```

<img src="/images/ss_grid_span_column.png" width="128">


# Contribution

If you have contribution or suggestion, please make a `pull request` or create an issue.

# License

```
MIT License

Copyright (c) 2017 ThuanLe

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.

```
