package com.aaa.biz;

import java.util.List;
import java.util.Map;

import com.aaa.entity.QianUser;

public interface QianUserBiz {
void adduser(QianUser user);//��ӻ�Ա
List<Map<String, Object>> checkname(String name);
}
