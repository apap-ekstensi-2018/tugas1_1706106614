package com.tugas1.service;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tugas1.dao.MahasiswaMapper;
import com.tugas1.model.MahasiswaModel;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class MahasiswaServiceDatabase implements MahasiswaService {

	@Autowired
	private MahasiswaMapper mahasiswaMapper;

	@Override
	public MahasiswaModel selectDataById(Object id) {
		log.info("select mahasiswa with npm {}", id);
		return mahasiswaMapper.selectMahasiswa((int) id);
	}

	@Override
	public MahasiswaModel selectMahasiswaByNPM(String value) {
		log.info(value);
		return mahasiswaMapper.selectMahasiswaByNPM(value);
	}

	@Override
	public List<MahasiswaModel> selectAllData() {
		return mahasiswaMapper.selectAllMahasiswa();
	}

	@Override
	public void insertData(MahasiswaModel data) {
		mahasiswaMapper.insertMahasiwa(data);
	}

	@Override
	public void updateData(MahasiswaModel data) {
		mahasiswaMapper.updateMahasiswa(data);
	}

	@Override
	public void deleteData(Object id) {
		mahasiswaMapper.deleteMahasiswa((int) id);
	}

	@Override
	public int countMahasiswaByTahunAndProdi(int tahun, int idProdi) {
		return mahasiswaMapper.countMahasiswaByTahunAndProdi(tahun, idProdi);
	}
	
	@Override
	public List<MahasiswaModel> selectMahasiswaByProdi(int idProdi) {
		return mahasiswaMapper.selectMahasiswaByProdi(idProdi);
	}

	@Override
	public Map<String, String> selectMahasiswaBy(int idUniv, int idFakultas, int idProdi) {
		
		Map<String, String> tmp = mahasiswaMapper.selectMahasiswaBy(idUniv, idFakultas, idProdi);
		
		log.info(tmp.toString());
		return mahasiswaMapper.selectMahasiswaBy(idUniv, idFakultas, idProdi);
	}
}
