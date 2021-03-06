package com.training.ratings.service;

import java.util.List;

import com.training.ratings.dto.PoliticalLeaderDto;

public interface PoliticalLeaderService {

	public PoliticalLeaderDto registerPoliticalLeader(PoliticalLeaderDto politicalLeaderDto);

	public PoliticalLeaderDto updatePoliticalLeader(PoliticalLeaderDto politicalLeaderDto);

	public boolean deletePoliticalLeader(Long politicalLeaderId);

	public PoliticalLeaderDto getPoliticalLeaderById(Long politicalLeaderId);

	public List<PoliticalLeaderDto> getAllPoliticalLeaders();

	public List<PoliticalLeaderDto> getPoliticalLeadersByPartyId(Long politicalLeaderId);

}
