package com.rsia.madura.controller;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.rsia.madura.entity.m_Barang;
import com.rsia.madura.entity.m_JenisBarang;
import com.rsia.madura.entity.m_Satuan;
import com.rsia.madura.service.BarangService;
import com.rsia.madura.service.JenisBarangService;
import com.rsia.madura.service.SatuanService;

@Controller
@RequestMapping("/barang")
public class BarangController {
	@Autowired
	private BarangService barangService;
	@Autowired
	private JenisBarangService jenisBarangService;
	@Autowired
	private SatuanService satuanService;
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public String BarangFormView(Model model, @RequestParam(value="page", required=false) int page, 
			@RequestParam(value="limit", required=false) int limit){
		List<m_Barang> result = barangService.getBarangs(page, limit);
		String link = barangService.createLinks(page, limit);
		
		model.addAttribute("barang", result);
		model.addAttribute("link", link);
		
		return "BarangListView";
	}
	
	@RequestMapping(value="/form-add")
	public String BarangFormView(Model model){
		m_Barang barangModel = new m_Barang();
		List<m_JenisBarang> jenisBarangResult = jenisBarangService.getJenisBarangs();
		List<m_Satuan> satuanResult = satuanService.getSatuans();
		
		model.addAttribute("barangModel", barangModel);
		model.addAttribute("jenisBarang", jenisBarangResult);
		model.addAttribute("satuan", satuanResult);
		
		return "BarangAddForm";
	}
	
	@RequestMapping(value="/store", method=RequestMethod.POST)
	public String barangStore(@ModelAttribute("barangModel") m_Barang barangModel) {
		
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		barangModel.setAktifBarang("Y");
		barangModel.setCreateDateBarang(currentTime);
		barangModel.setCreatBarang("Admin");
		
		barangService.store(barangModel);
		
		return "com.rsia.modura/barang/list/?page=1&limit=10";
	}
	
	@RequestMapping(value="/form-update")
	public String BarangFormUpdateView(Model model, @RequestParam("IdBarang") int barangId){
		m_Barang barangModel = barangService.getBarang(barangId);
		
		model.addAttribute("barangModel", barangModel);
		
		return "BarangUpdateForm";
	}
	
	@RequestMapping(value="/update", method=RequestMethod.POST)
	public String barangUpdate(@ModelAttribute("barangModel") m_Barang barangModel) {
		
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		
		barangModel.setDateUpdateBarang(currentTime);
		barangModel.setUpdateBarang("Admin");
		
		barangService.update(barangModel);
		
		return "com.rsia.modura/barang/list/?page=1&limit=10";
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.GET)
	public String barangDelete(@RequestParam("IdBarang") int barangId) {
		
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		m_Barang barangModel = barangService.getBarang(barangId);
		
		barangModel.setAktifBarang("T");
		barangModel.setDeleteDateBarang(currentTime);
		
		barangService.delete(barangModel);
		
		return "com.rsia.modura/barang/list/?page=1&limit=10";
	}
}
