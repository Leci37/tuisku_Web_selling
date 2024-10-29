//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Bollinger_RSI_Double_Strategy
// ID_model: NIO_1Min_1BOL_0527b909 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_NIO_1Min_1BOL_0527b909", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_NIO_1Min_0527b909(crossunder_rsi_bbupperInt, BBlower, dif_source_BBupper, crossover_rsi_bblowerInt, vrsi, BBupper, dif_source_BBlower)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( vrsi <= 59.6994 )
		if( BBupper <= 5.32287 )
			if( BBlower <= 3.67762 )
				if( BBlower <= 3.65807 )
					if( BBlower <= 3.6482 )
						if( dif_source_BBlower <= 0.189577 )
							if( dif_source_BBupper <= -0.042074 )
								if( dif_source_BBlower <= 0.077427 )
									ret := 0.701923 // buy
								if( dif_source_BBlower > 0.077427 )
									ret := 0.166667
							if( dif_source_BBupper > -0.042074 )
								ret := 1.000000 // buy
						if( dif_source_BBlower > 0.189577 )
							if( vrsi <= 46.7226 )
								if( vrsi <= 31.1395 )
									ret := 0.126761
								if( vrsi > 31.1395 )
									ret := 0.731343 // buy
							if( vrsi > 46.7226 )
								if( dif_source_BBupper <= -0.047136 )
									ret := -0.904762 // sell
								if( dif_source_BBupper > -0.047136 )
									ret := 0.022989
					if( BBlower > 3.6482 )
						if( vrsi <= 22.1314 )
							ret := 0.590909
						if( vrsi > 22.1314 )
							if( vrsi <= 50.3514 )
								if( vrsi <= 48.395 )
									ret := -0.009009
								if( vrsi > 48.395 )
									ret := -0.479452
							if( vrsi > 50.3514 )
								if( dif_source_BBlower <= 0.143543 )
									ret := 0.681818
								if( dif_source_BBlower > 0.143543 )
									ret := -0.166667
				if( BBlower > 3.65807 )
					if( dif_source_BBupper <= -0.01647 )
						if( dif_source_BBupper <= -0.06417 )
							if( dif_source_BBlower <= -0.001067 )
								ret := 1.000000 // buy
							if( dif_source_BBlower > -0.001067 )
								if( dif_source_BBupper <= -0.2433 )
									ret := -0.444444
								if( dif_source_BBupper > -0.2433 )
									ret := 0.163934
						if( dif_source_BBupper > -0.06417 )
							if( BBlower <= 3.6758 )
								if( vrsi <= 46.6488 )
									ret := 0.813187 // buy
								if( vrsi > 46.6488 )
									ret := 0.242105
							if( BBlower > 3.6758 )
								ret := -0.133333
					if( dif_source_BBupper > -0.01647 )
						if( dif_source_BBupper <= -0.004194 )
							if( BBupper <= 3.75759 )
								ret := -0.913043 // sell
							if( BBupper > 3.75759 )
								ret := -0.200000
						if( dif_source_BBupper > -0.004194 )
							ret := 0.333333
			if( BBlower > 3.67762 )
				if( BBupper <= 4.49496 )
					if( dif_source_BBupper <= -0.017503 )
						if( dif_source_BBlower <= 0.029116 )
							if( BBlower <= 4.149 )
								if( BBupper <= 4.13459 )
									ret := 0.224143
								if( BBupper > 4.13459 )
									ret := -0.005720
							if( BBlower > 4.149 )
								if( vrsi <= 44.4963 )
									ret := 0.352738
								if( vrsi > 44.4963 )
									ret := 0.162487
						if( dif_source_BBlower > 0.029116 )
							if( dif_source_BBupper <= -0.14496 )
								if( BBlower <= 4.22444 )
									ret := -0.224419
								if( BBlower > 4.22444 )
									ret := 0.464286
							if( dif_source_BBupper > -0.14496 )
								if( dif_source_BBupper <= -0.01756 )
									ret := 0.109659
								if( dif_source_BBupper > -0.01756 )
									ret := 0.764706 // buy
					if( dif_source_BBupper > -0.017503 )
						if( dif_source_BBlower <= 0.020909 )
							if( BBupper <= 4.48622 )
								if( dif_source_BBlower <= 0.009584 )
									ret := 0.757576 // buy
								if( dif_source_BBlower > 0.009584 )
									ret := 0.124352
							if( BBupper > 4.48622 )
								ret := 0.882353 // buy
						if( dif_source_BBlower > 0.020909 )
							if( vrsi <= 37.5354 )
								if( BBlower <= 3.77399 )
									ret := -0.238532
								if( BBlower > 3.77399 )
									ret := 0.052083
							if( vrsi > 37.5354 )
								if( BBlower <= 3.69431 )
									ret := -0.698795
								if( BBlower > 3.69431 )
									ret := -0.141548
				if( BBupper > 4.49496 )
					if( BBupper <= 4.60007 )
						if( vrsi <= 42.8517 )
							if( vrsi <= 40.09 )
								if( dif_source_BBlower <= -0.011432 )
									ret := -0.322870
								if( dif_source_BBlower > -0.011432 )
									ret := 0.036467
							if( vrsi > 40.09 )
								if( vrsi <= 40.3866 )
									ret := 0.913793 // buy
								if( vrsi > 40.3866 )
									ret := -0.042169
						if( vrsi > 42.8517 )
							if( dif_source_BBlower <= 0.299916 )
								if( dif_source_BBupper <= -0.068732 )
									ret := 0.025505
								if( dif_source_BBupper > -0.068732 )
									ret := -0.190448
							if( dif_source_BBlower > 0.299916 )
								if( dif_source_BBupper <= -0.091446 )
									ret := -0.333333
								if( dif_source_BBupper > -0.091446 )
									ret := -1.000000 // sell
					if( BBupper > 4.60007 )
						if( dif_source_BBlower <= -0.078191 )
							if( dif_source_BBupper <= -0.330852 )
								if( BBlower <= 4.90469 )
									ret := 0.394737
								if( BBlower > 4.90469 )
									ret := -0.909091 // sell
							if( dif_source_BBupper > -0.330852 )
								if( vrsi <= 6.6069 )
									ret := -0.757576 // sell
								if( vrsi > 6.6069 )
									ret := -0.473684
						if( dif_source_BBlower > -0.078191 )
							if( vrsi <= 42.4794 )
								if( dif_source_BBlower <= 0.332343 )
									ret := 0.159038
								if( dif_source_BBlower > 0.332343 )
									ret := 0.547945
							if( vrsi > 42.4794 )
								if( BBupper <= 5.07633 )
									ret := 0.007001
								if( BBupper > 5.07633 )
									ret := 0.106998
		if( BBupper > 5.32287 )
			if( dif_source_BBupper <= -0.048037 )
				if( BBupper <= 5.61408 )
					if( BBupper <= 5.5516 )
						if( crossover_rsi_bblowerInt <= 0.5 )
							if( vrsi <= 35.5118 )
								if( BBlower <= 5.39375 )
									ret := 0.125434
								if( BBlower > 5.39375 )
									ret := 0.551724
							if( vrsi > 35.5118 )
								if( BBlower <= 5.07914 )
									ret := 0.271012
								if( BBlower > 5.07914 )
									ret := -0.064020
						if( crossover_rsi_bblowerInt > 0.5 )
							ret := 0.428571
					if( BBupper > 5.5516 )
						if( dif_source_BBupper <= -0.212313 )
							if( vrsi <= 32.1625 )
								if( dif_source_BBupper <= -0.461101 )
									ret := -0.434783
								if( dif_source_BBupper > -0.461101 )
									ret := 0.042735
							if( vrsi > 32.1625 )
								if( BBlower <= 5.01617 )
									ret := -0.083333
								if( BBlower > 5.01617 )
									ret := -0.609195
						if( dif_source_BBupper > -0.212313 )
							if( BBlower <= 4.98198 )
								if( BBupper <= 5.56982 )
									ret := 0.800000 // buy
								if( BBupper > 5.56982 )
									ret := 0.952381 // buy
							if( BBlower > 4.98198 )
								if( dif_source_BBlower <= 0.283784 )
									ret := 0.203252
								if( dif_source_BBlower > 0.283784 )
									ret := -0.380952
				if( BBupper > 5.61408 )
					ret := -0.025088
			if( dif_source_BBupper > -0.048037 )
				if( dif_source_BBlower <= 0.151845 )
					if( BBupper <= 5.35414 )
						if( dif_source_BBlower <= 0.035393 )
							if( BBlower <= 5.2689 )
								if( BBupper <= 5.3363 )
									ret := -0.916667 // sell
								if( BBupper > 5.3363 )
									ret := -0.400000
							if( BBlower > 5.2689 )
								ret := -1.000000 // sell
						if( dif_source_BBlower > 0.035393 )
							if( vrsi <= 37.39 )
								if( dif_source_BBlower <= 0.064686 )
									ret := 0.370968
								if( dif_source_BBlower > 0.064686 )
									ret := 0.078125
							if( vrsi > 37.39 )
								if( vrsi <= 49.7318 )
									ret := -0.283582
								if( vrsi > 49.7318 )
									ret := -0.563830
					if( BBupper > 5.35414 )
						if( BBupper <= 6.5673 )
							if( BBlower <= 6.03554 )
								if( crossunder_rsi_bbupperInt <= 0.5 )
									ret := 0.012564
								if( crossunder_rsi_bbupperInt > 0.5 )
									ret := 0.550000
							if( BBlower > 6.03554 )
								if( vrsi <= 50.0134 )
									ret := -0.220641
								if( vrsi > 50.0134 )
									ret := -0.598802
						if( BBupper > 6.5673 )
							if( BBupper <= 6.82923 )
								if( BBupper <= 6.71586 )
									ret := 0.117647
								if( BBupper > 6.71586 )
									ret := 0.440171
							if( BBupper > 6.82923 )
								if( BBlower <= 7.31478 )
									ret := -0.072243
								if( BBlower > 7.31478 )
									ret := 0.750000 // buy
				if( dif_source_BBlower > 0.151845 )
					if( vrsi <= 0.072236 )
						if( dif_source_BBupper <= -0.046973 )
							ret := -0.833333 // sell
						if( dif_source_BBupper > -0.046973 )
							if( BBlower <= 6.66818 )
								if( dif_source_BBupper <= -0.020753 )
									ret := 0.666667
								if( dif_source_BBupper > -0.020753 )
									ret := 0.394737
							if( BBlower > 6.66818 )
								if( BBupper <= 6.88592 )
									ret := -0.909091 // sell
								if( BBupper > 6.88592 )
									ret := 0.375000
					if( vrsi > 0.072236 )
						if( dif_source_BBlower <= 1.20666 )
							if( BBlower <= 5.44085 )
								if( dif_source_BBlower <= 0.269527 )
									ret := -0.252708
								if( dif_source_BBlower > 0.269527 )
									ret := -0.468852
							if( BBlower > 5.44085 )
								if( BBlower <= 6.41539 )
									ret := 0.081197
								if( BBlower > 6.41539 )
									ret := -0.366569
						if( dif_source_BBlower > 1.20666 )
							ret := -1.000000 // sell
	if( vrsi > 59.6994 )
		if( BBupper <= 5.07093 )
			if( crossover_rsi_bblowerInt <= 0.5 )
				if( dif_source_BBupper <= -0.057895 )
					if( BBupper <= 4.3492 )
						if( vrsi <= 60.0939 )
							if( BBupper <= 4.10051 )
								if( vrsi <= 60.0028 )
									ret := 0.020202
								if( vrsi > 60.0028 )
									ret := 0.800000 // buy
							if( BBupper > 4.10051 )
								if( dif_source_BBupper <= -0.119952 )
									ret := -0.500000
								if( dif_source_BBupper > -0.119952 )
									ret := 0.608108
						if( vrsi > 60.0939 )
							if( BBupper <= 4.13046 )
								if( BBlower <= 3.88191 )
									ret := -0.284250
								if( BBlower > 3.88191 )
									ret := 0.102174
							if( BBupper > 4.13046 )
								if( BBlower <= 3.90384 )
									ret := -0.941176 // sell
								if( BBlower > 3.90384 )
									ret := -0.341847
					if( BBupper > 4.3492 )
						if( BBlower <= 4.62846 )
							if( BBupper <= 4.66965 )
								if( vrsi <= 73.81 )
									ret := 0.033645
								if( vrsi > 73.81 )
									ret := -0.162299
							if( BBupper > 4.66965 )
								if( BBlower <= 4.62183 )
									ret := 0.066219
								if( BBlower > 4.62183 )
									ret := 0.680000
						if( BBlower > 4.62846 )
							if( BBlower <= 4.64534 )
								if( vrsi <= 67.8025 )
									ret := -0.692308
								if( vrsi > 67.8025 )
									ret := -0.205128
							if( BBlower > 4.64534 )
								if( BBupper <= 4.83682 )
									ret := 0.132911
								if( BBupper > 4.83682 )
									ret := -0.194166
				if( dif_source_BBupper > -0.057895 )
					if( vrsi <= 59.9694 )
						if( dif_source_BBupper <= -0.018948 )
							if( BBlower <= 3.68133 )
								ret := 0.071429
							if( BBlower > 3.68133 )
								if( dif_source_BBlower <= 0.078647 )
									ret := -0.795276 // sell
								if( dif_source_BBlower > 0.078647 )
									ret := -0.050000
						if( dif_source_BBupper > -0.018948 )
							if( vrsi <= 59.852 )
								if( BBlower <= 4.4 )
									ret := -0.147059
								if( BBlower > 4.4 )
									ret := -0.375000
							if( vrsi > 59.852 )
								if( dif_source_BBlower <= 0.048506 )
									ret := -0.428571
								if( dif_source_BBlower > 0.048506 )
									ret := -0.909091 // sell
					if( vrsi > 59.9694 )
						if( dif_source_BBlower <= 0.125607 )
							if( BBlower <= 4.77591 )
								if( vrsi <= 99.9955 )
									ret := -0.213274
								if( vrsi > 99.9955 )
									ret := -0.121030
							if( BBlower > 4.77591 )
								if( vrsi <= 95.0066 )
									ret := -0.310627
								if( vrsi > 95.0066 )
									ret := -0.548077
						if( dif_source_BBlower > 0.125607 )
							if( dif_source_BBlower <= 0.433804 )
								if( BBlower <= 4.80978 )
									ret := -0.119423
								if( BBlower > 4.80978 )
									ret := 0.309353
							if( dif_source_BBlower > 0.433804 )
								if( BBlower <= 4.5137 )
									ret := -0.157895
								if( BBlower > 4.5137 )
									ret := -1.000000 // sell
			if( crossover_rsi_bblowerInt > 0.5 )
				if( vrsi <= 59.9988 )
					ret := 0.785714 // buy
				if( vrsi > 59.9988 )
					if( dif_source_BBupper <= -0.080246 )
						if( dif_source_BBupper <= -0.1037 )
							ret := -0.200000
						if( dif_source_BBupper > -0.1037 )
							ret := -0.818182 // sell
					if( dif_source_BBupper > -0.080246 )
						if( dif_source_BBupper <= -0.055331 )
							ret := 0.285714
						if( dif_source_BBupper > -0.055331 )
							if( dif_source_BBupper <= -0.044639 )
								ret := -0.500000
							if( dif_source_BBupper > -0.044639 )
								if( dif_source_BBlower <= 0.008607 )
									ret := 0.142857
								if( dif_source_BBlower > 0.008607 )
									ret := -0.083333
		if( BBupper > 5.07093 )
			if( BBlower <= 4.97152 )
				if( dif_source_BBlower <= 0.523415 )
					if( vrsi <= 71.0687 )
						if( BBlower <= 4.7767 )
							if( dif_source_BBupper <= -0.322409 )
								if( BBlower <= 4.6383 )
									ret := -0.173913
								if( BBlower > 4.6383 )
									ret := -0.363636
							if( dif_source_BBupper > -0.322409 )
								if( BBupper <= 5.17964 )
									ret := 0.725806 // buy
								if( BBupper > 5.17964 )
									ret := -0.137931
						if( BBlower > 4.7767 )
							if( dif_source_BBupper <= -0.094903 )
								if( dif_source_BBlower <= 0.225107 )
									ret := -0.264706
								if( dif_source_BBlower > 0.225107 )
									ret := -0.700000 // sell
							if( dif_source_BBupper > -0.094903 )
								if( BBlower <= 4.85382 )
									ret := -0.307692
								if( BBlower > 4.85382 )
									ret := 0.301887
					if( vrsi > 71.0687 )
						if( dif_source_BBlower <= 0.358947 )
							if( dif_source_BBupper <= -0.35879 )
								if( BBupper <= 5.31609 )
									ret := 0.125000
								if( BBupper > 5.31609 )
									ret := 0.830000 // buy
							if( dif_source_BBupper > -0.35879 )
								if( dif_source_BBlower <= 0.258968 )
									ret := 0.115385
								if( dif_source_BBlower > 0.258968 )
									ret := 0.510000
						if( dif_source_BBlower > 0.358947 )
							if( vrsi <= 80.701 )
								if( vrsi <= 75.1125 )
									ret := 0.789474 // buy
								if( vrsi > 75.1125 )
									ret := 0.302326
							if( vrsi > 80.701 )
								if( dif_source_BBupper <= -0.041392 )
									ret := 0.120000
								if( dif_source_BBupper > -0.041392 )
									ret := -0.533333
				if( dif_source_BBlower > 0.523415 )
					if( dif_source_BBupper <= -0.0472 )
						if( vrsi <= 99.9974 )
							if( vrsi <= 80.9265 )
								if( BBlower <= 4.67302 )
									ret := 1.000000 // buy
								if( BBlower > 4.67302 )
									ret := 0.807692 // buy
							if( vrsi > 80.9265 )
								if( BBlower <= 4.75629 )
									ret := 0.678571
								if( BBlower > 4.75629 )
									ret := 0.000000
						if( vrsi > 99.9974 )
							ret := -0.750000 // sell
					if( dif_source_BBupper > -0.0472 )
						if( dif_source_BBupper <= -0.035713 )
							ret := -0.555556
						if( dif_source_BBupper > -0.035713 )
							if( dif_source_BBupper <= -0.016655 )
								ret := 0.636364
							if( dif_source_BBupper > -0.016655 )
								ret := 0.142857
			if( BBlower > 4.97152 )
				if( dif_source_BBupper <= 0.028314 )
					if( crossover_rsi_bblowerInt <= 0.5 )
						if( BBupper <= 5.70711 )
							if( BBlower <= 5.30303 )
								if( vrsi <= 88.8475 )
									ret := -0.051050
								if( vrsi > 88.8475 )
									ret := -0.214761
							if( BBlower > 5.30303 )
								if( vrsi <= 99.0187 )
									ret := -0.240642
								if( vrsi > 99.0187 )
									ret := -0.069919
						if( BBupper > 5.70711 )
							if( BBlower <= 6.71854 )
								if( BBupper <= 6.97569 )
									ret := 0.016408
								if( BBupper > 6.97569 )
									ret := 0.349206
							if( BBlower > 6.71854 )
								if( vrsi <= 60.0091 )
									ret := 0.014925
								if( vrsi > 60.0091 )
									ret := -0.232477
					if( crossover_rsi_bblowerInt > 0.5 )
						if( BBlower <= 5.32358 )
							if( dif_source_BBupper <= -0.076782 )
								ret := -0.400000
							if( dif_source_BBupper > -0.076782 )
								ret := 0.250000
						if( BBlower > 5.32358 )
							ret := -0.533333
				if( dif_source_BBupper > 0.028314 )
					if( dif_source_BBupper <= 0.035423 )
						if( vrsi <= 99.3149 )
							if( BBlower <= 6.01746 )
								if( BBupper <= 5.22403 )
									ret := -0.125000
								if( BBupper > 5.22403 )
									ret := 0.632479
							if( BBlower > 6.01746 )
								if( dif_source_BBlower <= 0.228886 )
									ret := 0.100000
								if( dif_source_BBlower > 0.228886 )
									ret := -0.538462
						if( vrsi > 99.3149 )
							if( dif_source_BBlower <= 0.187014 )
								if( dif_source_BBupper <= 0.030942 )
									ret := 0.666667
								if( dif_source_BBupper > 0.030942 )
									ret := 0.973684 // buy
							if( dif_source_BBlower > 0.187014 )
								ret := 0.000000
					if( dif_source_BBupper > 0.035423 )
						if( BBupper <= 5.35261 )
							if( vrsi <= 98.5245 )
								if( BBupper <= 5.14931 )
									ret := 0.000000
								if( BBupper > 5.14931 )
									ret := 0.675676
							if( vrsi > 98.5245 )
								if( BBlower <= 5.17988 )
									ret := -0.500000
								if( BBlower > 5.17988 )
									ret := 0.769231 // buy
						if( BBupper > 5.35261 )
							if( vrsi <= 62.1604 )
								ret := -0.863636 // sell
							if( vrsi > 62.1604 )
								if( vrsi <= 63.8876 )
									ret := 0.885714 // buy
								if( vrsi > 63.8876 )
									ret := -0.023352
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator Bollinger_RSI_Double_Strategy 
//@version=5
//strategy "Bollinger + RSI, Double Strategy (by ChartArt) v1.1", shorttitle="CA_-_RSI_Bol_Strat_1.1", overlay=true)

// ChartArt's RSI + Bollinger Bands, Double Strategy - Update
//
// Version 1.1
// Idea by ChartArt on January 18, 2015.
//
// This strategy uses the RSI indicator
// together with the Bollinger Bands
// to sell when the price is above the
// upper Bollinger Band (and to buy when
// this value is below the lower band).
//
// This simple strategy only triggers when
// both the RSI and the Bollinger Bands
// indicators are at the same time in
// a overbought or oversold condition.
//
// In this version 1.1 the strategy was
// both simplified for the user and
// made more successful in backtesting.
//
// List of my work:
// https://www.tradingview.com/u/ChartArt/
//
//  __             __  ___       __  ___
// /  ` |__|  /\  |__)  |   /\  |__)  |
// \__, |  | /~~\ |  \  |  /~~\ |  \  |
//
//

///////////// RSI
RSIlength = input.int(6, title="RSI Period Length")
RSIoverSold = 50
RSIoverBought = 50
price = close
vrsi = ta.rsi(price, RSIlength)

///////////// Bollinger Bands
BBlength = input.int(200, minval=1, title="Bollinger Period Length")
BBmult = 2 // input(2.0, minval=0.001, maxval=50,title="Bollinger Bands Standard Deviation")
BBbasis = ta.sma(price, BBlength)
BBdev = BBmult * ta.stdev(price, BBlength)
BBupper = BBbasis + BBdev
BBlower = BBbasis - BBdev
source = close
buyEntry = ta.crossover(source, BBlower)
sellEntry = ta.crossunder(source, BBupper)
plot(BBbasis, color=color.aqua, title="Bollinger Bands SMA Basis Line")
p1 = plot(BBupper, color=color.silver, title="Bollinger Bands Upper Line")
p2 = plot(BBlower, color=color.silver, title="Bollinger Bands Lower Line")
fill(p1, p2)

///////////// Colors
switch1 = input(true, title="Enable Bar Color?")
switch2 = input(true, title="Enable Background Color?")
TrendColor = (price[1] > BBupper and price < BBupper and BBbasis < BBbasis[1]) ? color.red : (price[1] < BBlower and price > BBlower and BBbasis > BBbasis[1]) ? color.green : na
// bgColor1 = color.new(TrendColor, 70)
barcolor(switch1 ? TrendColor : na)

// Using color.new() to set transparency
bgColor = color.new(TrendColor, 90)
bgcolor(switch2 ? bgColor : na)

///////////// RSI + Bollinger Bands Strategy
crossover_rsi_bblower = ta.crossover(vrsi, RSIoverSold) and ta.crossover(source, BBlower)
crossunder_rsi_bbupper = ta.crossunder(vrsi, RSIoverBought) and ta.crossunder(source, BBupper)

crossover_rsi_bblowerInt = crossover_rsi_bblower ? 1: 0    //Bool to int
crossunder_rsi_bbupperInt = crossunder_rsi_bbupper ? 1: 0  //Bool to int

dif_vrsi_RSIoverSold = vrsi - RSIoverSold
dif_source_BBlower = source - BBlower
dif_vrsi_RSIoverBought = vrsi - RSIoverBought
dif_source_BBupper = source - BBupper

// if not na(vrsi)
//     if crossover_rsi_bblower
//         strategy.entry("RSI_BB_L", strategy.long, stop=BBlower, oca_type=strategy.oca.cancel, comment="RSI_BB_L")
//     else
//         strategy.cancel(id="RSI_BB_L")
//
//     if crossunder_rsi_bbupper
//         strategy.entry("RSI_BB_S", strategy.short, stop=BBupper, oca_type=strategy.oca.cancel, comment="RSI_BB_S")
//     else
//         strategy.cancel(id="RSI_BB_S")

//plot(strategy.equity, title="equity", color=color.red, linewidth=2, style=plot.style_areabr)
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
float op_operation = decision_tree_0_NIO_1Min_0527b909(crossunder_rsi_bbupperInt, BBlower, dif_source_BBupper, crossover_rsi_bblowerInt, vrsi, BBupper, dif_source_BBlower)

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


