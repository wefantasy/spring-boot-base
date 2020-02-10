package com.ctgu.qmx.springbootbase.service.base;

import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface BaseServ<O>{
	public boolean doAdd(O o);
	public boolean doDel(O o);
	public boolean doUpd(O o);
	public List<O> doSel(O o);
}
