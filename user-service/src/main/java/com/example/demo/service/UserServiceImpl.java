package com.example.demo.service;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.example.demo.repo.UserEntity;
import com.example.demo.repo.UserRepository;
import com.example.demo.shared.UserDto;
@Service
@EnableTransactionManagement
public class UserServiceImpl implements UserService {
	private UserRepository userRepository;
	

	@Autowired
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}


	@Override
	@Transactional
	public UserDto createUser(UserDto dto) {
		// TODO Auto-generated method stub
		ModelMapper modelMapper=new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		UserEntity entity=modelMapper.map(dto, UserEntity.class);
		entity.setEncryptedPassword("test");
		userRepository.save(entity);
		return dto;
	}

}
