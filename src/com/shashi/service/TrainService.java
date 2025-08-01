package com.shashi.service;

import java.util.List;

import com.shashi.beans.TrainBean;
import com.shashi.beans.TrainException;

public interface TrainService {

	public String addTrain(TrainBean train);

	public String deleteTrainById(Long trainNo);

	public String updateTrain(TrainBean train);

	public TrainBean getTrainById(long trainNo) throws TrainException;

	public List<TrainBean> getAllTrains() throws TrainException;

	public List<TrainBean> getTrainsBetweenStations(String fromStation, String toStation) throws TrainException;
}
