### 实现功能

1、NoteList界面中笔记条目增加时间戳显示

2、添加笔记查询功能（根据标题或内容查询）

3、UI美化：明、暗主题选择



### **具体效果**

1、NoteList界面中笔记条目增加时间戳显示（显示上一次修改时间）

<img src="file:///D:/Code/NotePad_new-master/NotePad_new-master/%E7%BB%93%E6%9E%9C%E5%9B%BE%E7%89%87/7c01404dca44508d02e2ee1cf3eb77ce.png" title="" alt="" style="zoom:50%;">

2、添加笔记查询功能（点击放大镜根据标题或内容查询，弹出相应的笔记）

<img title="" src="file:///D:/QQ/聊天记录/Tencent%20Files/1124409560/nt_qq/nt_data/Pic/2024-12/Ori/c2753e108191318389eccbacc5b71d22.png" alt="c2753e108191318389eccbacc5b71d22" style="zoom:50%;">

3、UI美化：明、暗主题选择（默认主题为暗，可由菜单选项Theme选择明暗主题）

<img title="" src="file:///D:/QQ/聊天记录/Tencent%20Files/1124409560/nt_qq/nt_data/Pic/2024-12/Ori/d085bd946f0fd79d4c00caedb70ec099.png" alt="d085bd946f0fd79d4c00caedb70ec099" style="zoom:50%;">

<img title="" src="file:///D:/QQ/%E8%81%8A%E5%A4%A9%E8%AE%B0%E5%BD%95/Tencent%20Files/1124409560/nt_qq/nt_data/Pic/2024-12/Ori/4c7b515ae142a6dabd1c4a30a67e538e.png" alt="4c7b515ae142a6dabd1c4a30a67e538e" style="zoom:50%;">

笔记列表亮主题

<img title="" src="file:///D:/QQ/%E8%81%8A%E5%A4%A9%E8%AE%B0%E5%BD%95/Tencent%20Files/1124409560/nt_qq/nt_data/Pic/2024-12/Ori/e24c6d823a324e892d02dbb784df2bc0.png" alt="e24c6d823a324e892d02dbb784df2bc0" style="zoom:50%;">

笔记编辑亮主题

<img title="" src="file:///D:/QQ/%E8%81%8A%E5%A4%A9%E8%AE%B0%E5%BD%95/Tencent%20Files/1124409560/nt_qq/nt_data/Pic/2024-12/Ori/d29163e6eba7effcf340b800cc560135.png" alt="d29163e6eba7effcf340b800cc560135" style="zoom:50%;">

### **主要实现逻辑**

1、NoteList界面中笔记条目增加时间戳显示

![f673bc98-137a-48d7-b5e1-9ff03e67a0a5](file:///C:/Users/t'j'y/Pictures/Typedown/f673bc98-137a-48d7-b5e1-9ff03e67a0a5.png)

![213496ce-0cee-4fd2-93dd-ad3d5118026a](file:///C:/Users/t'j'y/Pictures/Typedown/213496ce-0cee-4fd2-93dd-ad3d5118026a.png)

自建的CustomCursorAdapter类用于实现时间戳格式化和明暗主题

![63ca1cd2-7f58-4b63-9c1a-76c2e4e9631e](file:///C:/Users/t'j'y/Pictures/Typedown/63ca1cd2-7f58-4b63-9c1a-76c2e4e9631e.png)

2、添加笔记查询功能（根据标题或内容查询）

![1c1515d7-6ce2-4978-9c99-535992d1f940](file:///C:/Users/t'j'y/Pictures/Typedown/1c1515d7-6ce2-4978-9c99-535992d1f940.png)

![ac775627-73a3-45fe-b346-0bae4989a7e0](file:///C:/Users/t'j'y/Pictures/Typedown/ac775627-73a3-45fe-b346-0bae4989a7e0.png)

搜索逻辑

![505fc669-6d98-49fb-836a-1fc9502ebd3a](file:///C:/Users/t'j'y/Pictures/Typedown/505fc669-6d98-49fb-836a-1fc9502ebd3a.png)

3、UI美化：明、暗主题选择

![bd91bab0-a794-4167-a81e-a8909ef564ca](file:///C:/Users/t'j'y/Pictures/Typedown/bd91bab0-a794-4167-a81e-a8909ef564ca.png)

![c8e70c33-ffed-4fc9-9983-ebfecb26a441](file:///C:/Users/t'j'y/Pictures/Typedown/c8e70c33-ffed-4fc9-9983-ebfecb26a441.png)

自建的CustomCursorAdapter类用于实现时间戳格式化和明暗主题

![2fa16a7c-62ec-4823-9972-ce02e9c24e5a](file:///C:/Users/t'j'y/Pictures/Typedown/2fa16a7c-62ec-4823-9972-ce02e9c24e5a.png)
