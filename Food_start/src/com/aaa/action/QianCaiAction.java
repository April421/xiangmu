package com.aaa.action;

import java.util.List;
import java.util.Map;

import com.aaa.biz.QianCaiBiz;
import com.aaa.biz.imp.QianCaiBizImp;
import com.aaa.entity.HouMenuType;
import com.opensymphony.xwork2.ModelDriven;

/**
 * 
 * @author ǰ̨���ҳ��
 *
 */
public class QianCaiAction extends BaseAction implements ModelDriven<HouMenuType> {
private HouMenuType hmt=new HouMenuType();
private QianCaiBiz qcb=new QianCaiBizImp();
	public HouMenuType getModel() {
		return hmt;
	}
	public HouMenuType getHmt() {
		return hmt;
	}
	public void setHmt(HouMenuType hmt) {
		this.hmt = hmt;
	}
	public QianCaiBiz getQcb() {
		return qcb;
	}
	public void setQcb(QianCaiBiz qcb) {
		this.qcb = qcb;
	}
	//��ѯ��Ʒ���
	public String caitype(){
		List<Map<String, Object>> caitype=qcb.selCaiType();
		super.getSession().put("caitype", caitype);
		return "to_cai";
	}
	//�����ƶ����Ͳ�Ʒ
	public String caiping(){
		List<Map<String, Object>> aa=(List<Map<String, Object>>) getSession().get("caitype");
		Integer tyid= (Integer) aa.get(0).get("cate_id");
		if(hmt.getCate_id()!=null){
			tyid=hmt.getCate_id();
		}
		List<Map<String, Object>> yileicai=qcb.selAllCai(tyid);
		super.getSession().put("yileicai", yileicai);
		return "to_diancai";
	}
	
	

}
