//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Vortex_Indicator
// ID_model: MSFT_1Min_2CV0_4fb1517a Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MSFT_1Min_2CV0_4fb1517a", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MSFT_1Min_4fb1517a(mf, ad_mf, ad, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( ad <= 10.4056 )
		if( VIP <= 4.56422 )
			if( mf <= 0.349479 )
				if( VIM <= 1.39256 )
					if( VIP <= 2.15722 )
						if( ad_mf <= -450685 )
							if( VIM <= 0.94269 )
								if( VIM <= 0.606982 )
									ret := 1.000000 // buy
								if( VIM > 0.606982 )
									ret := 0.731183 // buy
							if( VIM > 0.94269 )
								if( mf <= -0.707574 )
									ret := -0.483871
								if( mf > -0.707574 )
									ret := 0.637681
						if( ad_mf > -450685 )
							if( ad <= -18099.9 )
								if( VIM <= 1.18834 )
									ret := 0.067571
								if( VIM > 1.18834 )
									ret := -0.061667
							if( ad > -18099.9 )
								if( VIP <= 0.940516 )
									ret := -0.054348
								if( VIP > 0.940516 )
									ret := 0.009671
					if( VIP > 2.15722 )
						if( VIM <= 1.21358 )
							if( mf <= 0.254508 )
								if( VIP_VIM <= 1.56261 )
									ret := -0.652174
								if( VIP_VIM > 1.56261 )
									ret := -1.000000 // sell
							if( mf > 0.254508 )
								ret := -0.200000
						if( VIM > 1.21358 )
							if( VIP <= 2.18587 )
								ret := -0.727273 // sell
							if( VIP > 2.18587 )
								if( VIP_VIM <= 0.941979 )
									ret := -0.214286
								if( VIP_VIM > 0.941979 )
									ret := 0.240000
				if( VIM > 1.39256 )
					if( VIP_VIM <= 0.398525 )
						if( VIP <= 4.42269 )
							if( ad <= -157.375 )
								if( VIP <= 0.671159 )
									ret := -0.047059
								if( VIP > 0.671159 )
									ret := 0.171883
							if( ad > -157.375 )
								if( VIP_VIM <= -0.061772 )
									ret := -0.006613
								if( VIP_VIM > -0.061772 )
									ret := 0.187124
						if( VIP > 4.42269 )
							if( ad_mf <= -0.01903 )
								if( VIP <= 4.46882 )
									ret := -0.076923
								if( VIP > 4.46882 )
									ret := -0.666667
							if( ad_mf > -0.01903 )
								if( VIM <= 4.27086 )
									ret := -0.750000 // sell
								if( VIM > 4.27086 )
									ret := 0.094340
					if( VIP_VIM > 0.398525 )
						if( VIP <= 2.86752 )
							if( VIP <= 2.38669 )
								if( mf <= -0.272397 )
									ret := -0.604938
								if( mf > -0.272397 )
									ret := 0.137931
							if( VIP > 2.38669 )
								if( ad_mf <= -0.295059 )
									ret := 0.000000
								if( ad_mf > -0.295059 )
									ret := -0.531532
						if( VIP > 2.86752 )
							if( ad <= -1699.61 )
								if( VIM <= 2.86813 )
									ret := -0.210526
								if( VIM > 2.86813 )
									ret := -0.833333 // sell
							if( ad > -1699.61 )
								if( VIP_VIM <= 1.79073 )
									ret := 0.109966
								if( VIP_VIM > 1.79073 )
									ret := -0.717391 // sell
			if( mf > 0.349479 )
				if( VIM <= 4.14915 )
					if( ad <= -58849.5 )
						if( VIP_VIM <= 0.503133 )
							if( VIP <= 0.91431 )
								ret := -0.083333
							if( VIP > 0.91431 )
								if( ad <= -74945.4 )
									ret := -0.370370
								if( ad > -74945.4 )
									ret := -1.000000 // sell
						if( VIP_VIM > 0.503133 )
							if( mf <= 0.413242 )
								ret := -0.500000
							if( mf > 0.413242 )
								ret := 0.272727
					if( ad > -58849.5 )
						if( VIP_VIM <= -0.605622 )
							if( mf <= 0.503268 )
								if( ad_mf <= -417.482 )
									ret := 0.387097
								if( ad_mf > -417.482 )
									ret := -0.063830
							if( mf > 0.503268 )
								if( ad_mf <= -1809.2 )
									ret := 0.950000 // buy
								if( ad_mf > -1809.2 )
									ret := 0.230769
						if( VIP_VIM > -0.605622 )
							if( mf <= 0.528211 )
								if( VIM <= 1.11709 )
									ret := 0.012270
								if( VIM > 1.11709 )
									ret := -0.300439
							if( mf > 0.528211 )
								if( mf <= 0.756389 )
									ret := 0.060881
								if( mf > 0.756389 )
									ret := -0.230769
				if( VIM > 4.14915 )
					if( VIM <= 4.65 )
						if( ad_mf <= -0.747933 )
							ret := -0.200000
						if( ad_mf > -0.747933 )
							if( mf <= 0.52888 )
								if( VIP_VIM <= -0.392955 )
									ret := 0.909091 // buy
								if( VIP_VIM > -0.392955 )
									ret := 0.916667 // buy
							if( mf > 0.52888 )
								ret := 0.692308
					if( VIM > 4.65 )
						ret := 0.000000
		if( VIP > 4.56422 )
			if( ad_mf <= 0.224786 )
				if( VIP_VIM <= -1.13246 )
					if( VIM <= 24.7074 )
						if( VIM <= 6.2301 )
							if( ad_mf <= 0.116771 )
								if( ad_mf <= -0.039623 )
									ret := -0.384615
								if( ad_mf > -0.039623 )
									ret := 0.083333
							if( ad_mf > 0.116771 )
								ret := -0.923077 // sell
						if( VIM > 6.2301 )
							if( ad_mf <= -0.020654 )
								if( VIP <= 5.62414 )
									ret := 0.700000 // buy
								if( VIP > 5.62414 )
									ret := -0.014563
							if( ad_mf > -0.020654 )
								if( VIP_VIM <= -1.39157 )
									ret := 0.248945
								if( VIP_VIM > -1.39157 )
									ret := 0.676136
					if( VIM > 24.7074 )
						if( VIP <= 94.4418 )
							if( VIP_VIM <= -1.19616 )
								if( VIM <= 31.9219 )
									ret := -0.130435
								if( VIM > 31.9219 )
									ret := -0.511628
							if( VIP_VIM > -1.19616 )
								ret := 0.615385
						if( VIP > 94.4418 )
							if( ad_mf <= -0.027598 )
								if( VIP_VIM <= -2.22351 )
									ret := 0.384615
								if( VIP_VIM > -2.22351 )
									ret := -0.100000
							if( ad_mf > -0.027598 )
								if( ad_mf <= 0.051101 )
									ret := 0.812500 // buy
								if( ad_mf > 0.051101 )
									ret := 0.500000
				if( VIP_VIM > -1.13246 )
					if( ad_mf <= -0.076462 )
						if( VIP_VIM <= 0.128413 )
							if( ad_mf <= -0.811401 )
								if( ad_mf <= -423.371 )
									ret := -0.071053
								if( ad_mf > -423.371 )
									ret := 0.609195
							if( ad_mf > -0.811401 )
								if( VIP <= 49.9437 )
									ret := -0.142180
								if( VIP > 49.9437 )
									ret := 0.558824
						if( VIP_VIM > 0.128413 )
							if( VIP <= 5.10107 )
								if( VIM <= 3.82397 )
									ret := 0.336134
								if( VIM > 3.82397 )
									ret := 0.656000
							if( VIP > 5.10107 )
								if( VIP_VIM <= 0.333138 )
									ret := 0.483333
								if( VIP_VIM > 0.333138 )
									ret := 0.123229
					if( ad_mf > -0.076462 )
						if( VIP <= 4.68536 )
							if( mf <= -0.091762 )
								ret := 0.470588
							if( mf > -0.091762 )
								if( VIP <= 4.60935 )
									ret := 0.529412
								if( VIP > 4.60935 )
									ret := 0.800000 // buy
						if( VIP > 4.68536 )
							if( VIP_VIM <= -1.09246 )
								ret := 0.923077 // buy
							if( VIP_VIM > -1.09246 )
								if( VIP <= 7226.59 )
									ret := -0.075712
								if( VIP > 7226.59 )
									ret := -1.000000 // sell
			if( ad_mf > 0.224786 )
				if( VIP <= 13.1389 )
					if( VIP <= 11.1625 )
						if( VIM <= 5.74632 )
							if( ad_mf <= 0.284495 )
								if( VIP_VIM <= 0.378476 )
									ret := -0.166667
								if( VIP_VIM > 0.378476 )
									ret := 0.388889
							if( ad_mf > 0.284495 )
								if( mf <= -0.574025 )
									ret := -0.068966
								if( mf > -0.574025 )
									ret := 0.433962
						if( VIM > 5.74632 )
							if( VIP <= 7.91182 )
								if( mf <= -0.285272 )
									ret := 0.470060
								if( mf > -0.285272 )
									ret := 0.669231
							if( VIP > 7.91182 )
								if( VIP_VIM <= 0.687306 )
									ret := 0.364286
								if( VIP_VIM > 0.687306 )
									ret := -0.266667
					if( VIP > 11.1625 )
						if( VIM <= 12.2658 )
							if( VIM <= 10.6269 )
								ret := 0.545455
							if( VIM > 10.6269 )
								if( ad_mf <= 0.294743 )
									ret := 1.000000 // buy
								if( ad_mf > 0.294743 )
									ret := 0.875000 // buy
						if( VIM > 12.2658 )
							if( VIM <= 13.7478 )
								ret := 0.000000
							if( VIM > 13.7478 )
								ret := 0.764706 // buy
				if( VIP > 13.1389 )
					if( VIP_VIM <= -0.066313 )
						if( VIM <= 27.6651 )
							if( VIP <= 15.3647 )
								if( VIM <= 14.3253 )
									ret := -0.333333
								if( VIM > 14.3253 )
									ret := -0.769231 // sell
							if( VIP > 15.3647 )
								if( ad_mf <= 0.310854 )
									ret := 0.307692
								if( ad_mf > 0.310854 )
									ret := 0.083333
						if( VIM > 27.6651 )
							if( VIP_VIM <= -1.44136 )
								if( VIP <= 32.115 )
									ret := -0.500000
								if( VIP > 32.115 )
									ret := 0.100000
							if( VIP_VIM > -1.44136 )
								ret := -0.923077 // sell
					if( VIP_VIM > -0.066313 )
						if( mf <= -0.23804 )
							if( mf <= -0.251046 )
								if( VIP <= 24.0433 )
									ret := -0.061538
								if( VIP > 24.0433 )
									ret := 0.500000
							if( mf > -0.251046 )
								ret := 1.000000 // buy
						if( mf > -0.23804 )
							ret := -0.357143
	if( ad > 10.4056 )
		if( ad <= 5164.75 )
			if( ad_mf <= 3464.31 )
				if( VIM <= 2.66491 )
					if( mf <= 0.400768 )
						if( ad_mf <= 13.5265 )
							if( ad_mf <= 12.0494 )
								ret := -0.750000 // sell
							if( ad_mf > 12.0494 )
								ret := -1.000000 // sell
						if( ad_mf > 13.5265 )
							if( VIM <= 0.910651 )
								if( VIP <= 1.09525 )
									ret := -0.200000
								if( VIP > 1.09525 )
									ret := 0.088533
							if( VIM > 0.910651 )
								if( VIP <= 1.011 )
									ret := 0.030877
								if( VIP > 1.011 )
									ret := -0.137275
					if( mf > 0.400768 )
						if( VIP <= 1.3739 )
							if( VIM <= 1.30409 )
								if( VIM <= 0.946349 )
									ret := -0.491803
								if( VIM > 0.946349 )
									ret := -0.182692
							if( VIM > 1.30409 )
								if( ad_mf <= 2329.85 )
									ret := 0.312500
								if( ad_mf > 2329.85 )
									ret := 0.842105 // buy
						if( VIP > 1.3739 )
							if( VIM <= 1.49313 )
								if( ad <= 1415.67 )
									ret := -0.103093
								if( ad > 1415.67 )
									ret := -0.398374
							if( VIM > 1.49313 )
								if( VIP <= 3.34045 )
									ret := -0.573964
								if( VIP > 3.34045 )
									ret := 0.000000
				if( VIM > 2.66491 )
					if( ad <= 940.877 )
						if( ad <= 769.942 )
							if( VIP_VIM <= -0.765453 )
								if( ad <= 396.792 )
									ret := 0.600000
								if( ad > 396.792 )
									ret := 0.169492
							if( VIP_VIM > -0.765453 )
								if( VIP <= 254.928 )
									ret := 0.041597
								if( VIP > 254.928 )
									ret := -1.000000 // sell
						if( ad > 769.942 )
							if( ad_mf <= 860.376 )
								if( mf <= -0.394499 )
									ret := 0.500000
								if( mf > -0.394499 )
									ret := -0.418440
							if( ad_mf > 860.376 )
								if( mf <= 0.103052 )
									ret := 0.275510
								if( mf > 0.103052 )
									ret := -0.625000
					if( ad > 940.877 )
						if( ad_mf <= 1083.69 )
							if( mf <= 0.245829 )
								if( mf <= 0.098621 )
									ret := 0.275862
								if( mf > 0.098621 )
									ret := 0.888889 // buy
							if( mf > 0.245829 )
								if( ad_mf <= 1003.56 )
									ret := -0.300000
								if( ad_mf > 1003.56 )
									ret := 0.176471
						if( ad_mf > 1083.69 )
							if( ad <= 1163.97 )
								if( mf <= 0.2979 )
									ret := -0.439024
								if( mf > 0.2979 )
									ret := 0.600000
							if( ad > 1163.97 )
								if( mf <= 0.551767 )
									ret := 0.167702
								if( mf > 0.551767 )
									ret := -0.615385
			if( ad_mf > 3464.31 )
				if( VIM <= 1.20696 )
					if( ad_mf <= 4098.41 )
						if( VIP <= 1.79312 )
							if( ad_mf <= 3742.43 )
								if( ad_mf <= 3570.89 )
									ret := -0.357143
								if( ad_mf > 3570.89 )
									ret := 0.031674
							if( ad_mf > 3742.43 )
								if( ad <= 3904.08 )
									ret := -0.491803
								if( ad > 3904.08 )
									ret := -0.185811
						if( VIP > 1.79312 )
							ret := 0.500000
					if( ad_mf > 4098.41 )
						if( ad_mf <= 4598.44 )
							if( ad <= 4572.47 )
								if( VIM <= 0.769665 )
									ret := 0.320755
								if( VIM > 0.769665 )
									ret := -0.017575
							if( ad > 4572.47 )
								if( VIM <= 0.911884 )
									ret := -0.100000
								if( VIM > 0.911884 )
									ret := 0.655172
						if( ad_mf > 4598.44 )
							if( VIP_VIM <= -0.019131 )
								if( ad_mf <= 4735.35 )
									ret := -0.666667
								if( ad_mf > 4735.35 )
									ret := -0.259109
							if( VIP_VIM > -0.019131 )
								if( VIM <= 0.803926 )
									ret := -0.400000
								if( VIM > 0.803926 )
									ret := 0.028249
				if( VIM > 1.20696 )
					if( ad <= 3492.75 )
						if( ad <= 3471.03 )
							ret := -0.666667
						if( ad > 3471.03 )
							if( ad_mf <= 3488.34 )
								ret := -1.000000 // sell
							if( ad_mf > 3488.34 )
								ret := -0.875000 // sell
					if( ad > 3492.75 )
						if( mf <= -0.15828 )
							if( ad <= 4799.35 )
								if( VIP <= 1.0348 )
									ret := 0.021739
								if( VIP > 1.0348 )
									ret := -0.625000
							if( ad > 4799.35 )
								if( ad_mf <= 4838.26 )
									ret := 0.941176 // buy
								if( ad_mf > 4838.26 )
									ret := 0.000000
						if( mf > -0.15828 )
							if( mf <= -0.021662 )
								if( VIP_VIM <= -0.480639 )
									ret := -0.428571
								if( VIP_VIM > -0.480639 )
									ret := -0.698795
							if( mf > -0.021662 )
								if( VIP_VIM <= -0.442353 )
									ret := 0.044248
								if( VIP_VIM > -0.442353 )
									ret := -0.372470
		if( ad > 5164.75 )
			if( VIP <= 1.47955 )
				if( ad <= 107809 )
					if( ad_mf <= 32252.7 )
						if( ad <= 26484.5 )
							if( ad_mf <= 21855.9 )
								if( VIM <= 0.903959 )
									ret := 0.022615
								if( VIM > 0.903959 )
									ret := -0.042655
							if( ad_mf > 21855.9 )
								if( ad_mf <= 22201.5 )
									ret := 0.448430
								if( ad_mf > 22201.5 )
									ret := 0.068376
						if( ad > 26484.5 )
							if( ad_mf <= 29377.5 )
								if( ad_mf <= 29098.9 )
									ret := -0.141058
								if( ad_mf > 29098.9 )
									ret := -0.611111
							if( ad_mf > 29377.5 )
								if( ad_mf <= 29769.5 )
									ret := 0.554745
								if( ad_mf > 29769.5 )
									ret := -0.092925
					if( ad_mf > 32252.7 )
						if( ad_mf <= 32705.2 )
							if( ad <= 32521.4 )
								if( VIP_VIM <= -0.31296 )
									ret := 0.923077 // buy
								if( VIP_VIM > -0.31296 )
									ret := -0.115385
							if( ad > 32521.4 )
								if( ad_mf <= 32563.9 )
									ret := 0.760000 // buy
								if( ad_mf > 32563.9 )
									ret := 0.931818 // buy
						if( ad_mf > 32705.2 )
							if( ad <= 97673 )
								if( VIP <= 1.38916 )
									ret := 0.067536
								if( VIP > 1.38916 )
									ret := -0.382979
							if( ad > 97673 )
								if( VIP_VIM <= 0.272069 )
									ret := -0.031250
								if( VIP_VIM > 0.272069 )
									ret := 0.810345 // buy
				if( ad > 107809 )
					if( VIP_VIM <= 0.092967 )
						if( ad <= 123225 )
							if( ad_mf <= 113965 )
								if( VIM <= 0.998034 )
									ret := 0.090909
								if( VIM > 0.998034 )
									ret := -0.666667
							if( ad_mf > 113965 )
								if( ad <= 116064 )
									ret := -1.000000 // sell
								if( ad > 116064 )
									ret := -0.444444
						if( ad > 123225 )
							if( ad <= 192290 )
								if( ad <= 137939 )
									ret := -0.054545
								if( ad > 137939 )
									ret := 0.438017
							if( ad > 192290 )
								if( VIM <= 1.20525 )
									ret := -0.331250
								if( VIM > 1.20525 )
									ret := 0.184211
					if( VIP_VIM > 0.092967 )
						if( VIP <= 1.37688 )
							if( ad_mf <= 147387 )
								if( ad_mf <= 115020 )
									ret := -0.300000
								if( ad_mf > 115020 )
									ret := -0.871287 // sell
							if( ad_mf > 147387 )
								if( mf <= 0.148276 )
									ret := 0.182927
								if( mf > 0.148276 )
									ret := -0.300000
						if( VIP > 1.37688 )
							if( VIP <= 1.42247 )
								ret := 0.263158
							if( VIP > 1.42247 )
								ret := 0.600000
			if( VIP > 1.47955 )
				if( VIM <= 0.801665 )
					if( VIP <= 1.48498 )
						ret := -0.533333
					if( VIP > 1.48498 )
						if( ad <= 8368.27 )
							ret := -0.200000
						if( ad > 8368.27 )
							if( VIP <= 1.57175 )
								if( ad <= 22511.9 )
									ret := 0.333333
								if( ad > 22511.9 )
									ret := 0.000000
							if( VIP > 1.57175 )
								ret := 0.631579
				if( VIM > 0.801665 )
					if( VIP_VIM <= -0.86266 )
						ret := 0.909091 // buy
					if( VIP_VIM > -0.86266 )
						if( ad <= 5723.14 )
							ret := -0.055556
						if( ad > 5723.14 )
							if( ad <= 8462.04 )
								if( VIM <= 1.73407 )
									ret := -0.947368 // sell
								if( VIM > 1.73407 )
									ret := -0.642857
							if( ad > 8462.04 )
								if( ad_mf <= 9448.42 )
									ret := 0.272727
								if( ad_mf > 9448.42 )
									ret := -0.634409
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Chaikin_Money_Flow 
 //@version=5
//indicator title="Chaikin Money Flow", shorttitle="CMF", format=format.price, precision=2, timeframe="", timeframe_gaps=true)
var cumVol = 0.
cumVol += nz(volume)
if barstate.islast and cumVol == 0
    runtime.error("No volume is provided by the data vendor.")
length_CMF = input.int(20, minval=1)
ad = close==high and close==low or high==low ? 0 : ((2*close-low-high)/(high-low))*volume
mf = math.sum(ad, length_CMF) / math.sum(volume, length_CMF)
plot(mf, color=#43A047, title="MF")
hline(0, color=#787B86, title="Zero", linestyle=hline.style_dashed)


ad_mf = ad - mf

//CODE associated with the technical indicator L_Vortex_Indicator 
//@version=5
//indicator title = "Vortex Indicator", shorttitle="VI", format=format.price, precision=4, timeframe="", timeframe_gaps=true)
period_ = input.int(14, title="Length", minval=2)
VMP = math.sum( math.abs( high - low[1]), period_ )
VMM = math.sum( math.abs( low - high[1]), period_ )
STR = math.sum( ta.atr(1), period_ )
VIP = VMP / STR
VIM = VMM / STR

VIP_VIM = VIP - VIM

plot(VIP, title="VI +", color=#2962FF)
plot(VIM, title="VI -", color=#E91E63)
// EXPLANATION OF THE STRATEGY
//The provided Pine Script implements a trading strategy that includes stop loss (SL) and multiple take profit (TP) levels,
//with an option to activate a trailing stop at the third TP level. Here's a detailed breakdown of its components and functionality:

//Variables Initialization:
var float stop = na
var float limit1 = na
var float limit2 = na

// Converts a percentage to points based on the average position price and the minimum tick size.
percent2points(percent) =>
    strategy.position_avg_price * percent / 100 / syminfo.mintick

// Stop Loss and Take Profit Inputs:
//Defines inputs for stop loss and three take profit levels in percentage terms.
sl = percent2points(input(2.92, title="stop loss %%"))
tp1 = percent2points(input(1.12, title="take profit 1 %%"))
tp2 = percent2points(input(2.31, title="take profit 2 %%"))
tp3 = percent2points(input(3.91, title="take profit 3 %%"))
activateTrailingOnThirdStep = input(false,title="activate trailing on third stage (tp3 is amount, tp2 is offset level)")
log.info("Stop Loss (sl):", sl," Take Profit 1 (tp1):", tp1, " Take Profit 2 (tp2):", tp2," Take Profit 3 (tp3):", tp3)

// Current Profit Calculation:
//Calculates the current profit in points based on the position size and price.
curProfitInPts() =>
    if strategy.position_size > 0
        (high - strategy.position_avg_price) / syminfo.mintick
    else if strategy.position_size < 0
        (strategy.position_avg_price - low) / syminfo.mintick
    else
        0
// Stop Loss and Profit Target Price Calculations:
//Determines the stop loss and profit target prices based on the position size and offset points.
calcStopLossPrice(OffsetPts) =>
    if strategy.position_size > 0
        strategy.position_avg_price - OffsetPts * syminfo.mintick
    else if strategy.position_size < 0
        strategy.position_avg_price + OffsetPts * syminfo.mintick
    else
        0
calcProfitTrgtPrice(OffsetPts) =>
    calcStopLossPrice(-OffsetPts)
// Current Stage Determination:
//Determines the current stage of the trade based on the profit points reached.
getCurrentStage() =>
    var stage = 0
    if strategy.position_size == 0
        stage := 0
    if stage == 0 and strategy.position_size != 0
        stage := 1
    else if stage == 1 and curProfitInPts() >= tp1
        stage := 2
    else if stage == 2 and curProfitInPts() >= tp2
        stage := 3
    stage
stopLevel = -1.
profitLevel = calcProfitTrgtPrice(tp3)

log.info("Stop Level:", stopLevel)
log.info("Profit Level:", profitLevel)
//This part of the strategy sets up exit conditions based on the current stage of the trade and uses the same exit ID "x" to modify the exit parameters dynamically.
//The exit parameters include stop loss, take profit, and comments for each stage.
// based on current stage set up exit
// note: we use same exit ids ("x") consciously, for MODIFY the exit's parameters
curStage = getCurrentStage()
float op_operation = decision_tree_0_MSFT_1Min_4fb1517a(mf, ad_mf, ad, VIP, VIP_VIM, VIM)

log.info("Decision Tree Operation (op_operation):", op_operation)
if (op_operation <= 0)
    if curStage == 1
        stopLevel := calcStopLossPrice(sl)
        strategy.exit("x", loss = sl, profit = tp3, comment = "sl or tp3")
    else if curStage == 2
        stopLevel := calcStopLossPrice(0)
        strategy.exit("x", stop = stopLevel, profit = tp3, comment = "breakeven or tp3")
    else if curStage == 3
        stopLevel := calcStopLossPrice(-tp1)
        strategy.exit("x", stop = stopLevel, profit = tp3, comment = "tp1 or tp3")
    else
        strategy.cancel("x")


//SIGNAL MANAGE    User Adjustments and Risk Management
// The user can adjust the threshold values for op_operation to control the level of risk they are willing to take:
// Lower op_operation Threshold for Buy Signal (e.g., 0.5 instead of 0.55):
//     Effect: Generates more buy signals, increasing the frequency of trades. This is suitable for a user willing to take more risks and potentially capture more trading opportunities.
// Higher op_operation Threshold for Buy Signal (e.g., 0.8 instead of 0.55):
//     Effect: Generates fewer buy signals, reducing the frequency of trades. This is suitable for a user seeking to take fewer risks and only enter trades under more favorable conditions.
// Lower op_operation Threshold for Signal Closure (e.g., -0.8 instead of -0.9):
//     Effect: Closes positions less frequently, allowing trades more room to recover from temporary unfavorable conditions. This increases risk but can capture larger gains if the market reverses favorably.
// Higher op_operation Threshold for Signal Closure (e.g., -0.95 instead of -0.9):
//     Effect: Closes positions more frequently, exiting trades quickly at the first sign of unfavorable conditions. This decreases risk but may result in missed opportunities for recovery.
//Signal BUY
FIXED_DOLLAR_AMOUNT  = 10000
positionSize = FIXED_DOLLAR_AMOUNT / close
log.info("Position Size (in dollars $",FIXED_DOLLAR_AMOUNT,"):", positionSize)

if (op_operation >= 0.55)
    stop := close * 0.965
    limit1 := close * 1.03
    limit2 := close * 1.02
    strategy.entry("x", strategy.long, qty=positionSize, stop=stop, comment="in")
//Signal SELL
if (op_operation <= -0.9)
    strategy.close("x", comment = "under Le1")

// Impact on the Dataset
//Stop Loss (SL): Limits the maximum loss by exiting the position if the price moves against the trade by a specified percentage.
//Take Profit (TP1, TP2, TP3): Defines profit-taking levels to secure gains at different stages.
//Trailing Stop: Optionally activates a trailing stop at the third TP level to lock in profits while allowing for further gains if the price continues to move favorably.
//Position Entry and Exit: The strategy's buy and sell signals determine when to enter and exit positions, influencing the dataset by marking the points of trade execution and closure.
//Current Stage Tracking: Monitors the trade's progress through predefined stages, adjusting stop and profit levels accordingly.
//This strategy is designed to manage risk and maximize profits through a structured approach, incorporating multiple exit levels and dynamic adjustments based on market conditions. The dataset will reflect these actions, showing entries, exits, stop loss activations, and profit-taking events, providing valuable information for backtesting and performance analysis.
//Random forest AI offers significant advantages in trading, including the ability to handle large data sets, reduce overfitting and provide more robust predictions through the aggregation of multiple decision trees.

// NOTE: While the Tuisku team stands behind the quality and effectiveness of this trading strategy,
// PLEASE be aware that there is NO GUARANTEE of specific results or profits. TRADING INVOLVES SIGNIFICANT RISK, and it is important to use this strategy with careful consideration of your financial situation and risk tolerance.
// For further information and support, please contact us at Tuisku.eu.


