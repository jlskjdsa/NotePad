### 实现功能

1、NoteList界面中笔记条目增加时间戳显示

2、添加笔记查询功能（根据标题或内容查询）

3、UI美化：明、暗主题选择

4、笔记导出



### **具体效果**

**1、NoteList界面中笔记条目增加时间戳显示（显示上一次修改时间）**

<img title="" src="结果图片/7c01404dca44508d02e2ee1cf3eb77ce.png" alt="loading-ag-146" style="zoom:50%;">

**2、添加笔记查询功能（点击放大镜根据标题或内容查询，弹出相应的笔记）**

<img title="" src="结果图片/c2753e108191318389eccbacc5b71d22.png" alt="loading-ag-148" style="zoom:50%;">

**3、UI美化：明、暗主题选择（默认主题为暗，可由菜单选项Theme选择明暗主题）**

<img title="" src="结果图片/d085bd946f0fd79d4c00caedb70ec099.png" alt="loading-ag-150" style="zoom:50%;">

<img title="" src="结果图片/4c7b515ae142a6dabd1c4a30a67e538e.png" alt="loading-ag-152" style="zoom:50%;">

笔记列表亮主题

<img title="" src="结果图片/e24c6d823a324e892d02dbb784df2bc0.png" alt="loading-ag-156" style="zoom:50%;">

笔记编辑亮主题

<img title="" src="结果图片/d29163e6eba7effcf340b800cc560135.png" alt="loading-ag-158" style="zoom:50%;">

**4、笔记导出**

<img title="" src="结果图片/Screenshot_20241203_193838.png" alt="loading-ag-397" style="zoom:50%;">

跳转入存储地址选择界面

<img title="" src="结果图片/Screenshot_20241203_194441.png" alt="loading-ag-417" style="zoom:50%;">

导出成功

<img title="" src="结果图片/Screenshot_20241203_193913.png" alt="loading-ag-419" style="zoom:50%;">

查看导出笔记

![loading-ag-421](结果图片/QQ截图20241203194053.png)

![loading-ag-423](结果图片/QQ截图20241203194013.png)

### **主要实现逻辑**

**1、NoteList界面中笔记条目增加时间戳显示**

![loading-ag-160](重要代码截图/f673bc98-137a-48d7-b5e1-9ff03e67a0a5.png)

![loading-ag-162](重要代码截图/213496ce-0cee-4fd2-93dd-ad3d5118026a.png)

自建的CustomCursorAdapter类用于实现时间戳格式化和明暗主题

![loading-ag-164](重要代码截图/63ca1cd2-7f58-4b63-9c1a-76c2e4e9631e.png)

**2、添加笔记查询功能（根据标题或内容查询）**

![loading-ag-166](重要代码截图/1c1515d7-6ce2-4978-9c99-535992d1f940.png)

![loading-ag-168](重要代码截图/ac775627-73a3-45fe-b346-0bae4989a7e0.png)

搜索逻辑

![loading-ag-170](重要代码截图/505fc669-6d98-49fb-836a-1fc9502ebd3a.png)

**3、UI美化：明、暗主题选择**

![loading-ag-172](重要代码截图/bd91bab0-a794-4167-a81e-a8909ef564ca.png)

![loading-ag-174](重要代码截图/c8e70c33-ffed-4fc9-9983-ebfecb26a441.png)

自建的CustomCursorAdapter类用于实现时间戳格式化和明暗主题

![loading-ag-176](重要代码截图/2fa16a7c-62ec-4823-9972-ce02e9c24e5a.png)

**4、笔记导出**

主要实现逻辑
![QQ截图20241203195725](D:\Code\NotePad_new-master\NotePad_new-master\重要代码截图\QQ截图20241203195725.png)
