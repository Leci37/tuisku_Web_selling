//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bollinger_Bands, L_Bull_Bear_Power
// ID_model: U_1Min_2BB0_1b4428f1 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_U_1Min_2BB0_1b4428f1", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_U_1Min_1b4428f1(Upper_Band, basis, Lower_Band, bbp, bullPower, BBPower_Color, bearPower, bbm)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( bullPower <= 0.004408 )
		if( bearPower <= -0.03569 )
			if( bbm <= 0.004993 )
				if( Upper_Band <= 15.8812 )
					if( bearPower <= -0.061305 )
						if( Upper_Band <= 15.3562 )
							if( bullPower <= -0.070008 )
								if( bearPower <= -0.098151 )
									ret := 0.000000
								if( bearPower > -0.098151 )
									ret := 0.647059
							if( bullPower > -0.070008 )
								ret := -0.764706 // sell
						if( Upper_Band > 15.3562 )
							if( bbp <= -0.247643 )
								ret := -0.750000 // sell
							if( bbp > -0.247643 )
								if( bullPower <= -0.080016 )
									ret := -0.923077 // sell
								if( bullPower > -0.080016 )
									ret := -1.000000 // sell
					if( bearPower > -0.061305 )
						if( bearPower <= -0.039271 )
							if( Lower_Band <= 15.5006 )
								if( bearPower <= -0.051294 )
									ret := 0.739130 // buy
								if( bearPower > -0.051294 )
									ret := 0.354430
							if( Lower_Band > 15.5006 )
								if( Lower_Band <= 15.5776 )
									ret := -0.833333 // sell
								if( Lower_Band > 15.5776 )
									ret := -1.000000 // sell
						if( bearPower > -0.039271 )
							if( Upper_Band <= 15.0072 )
								if( Lower_Band <= 14.1618 )
									ret := -0.071429
								if( Lower_Band > 14.1618 )
									ret := -0.909091 // sell
							if( Upper_Band > 15.0072 )
								ret := 0.428571
				if( Upper_Band > 15.8812 )
					if( bullPower <= -0.054923 )
						if( Lower_Band <= 17.1365 )
							if( Upper_Band <= 16.571 )
								if( Lower_Band <= 15.9204 )
									ret := 0.742857 // buy
								if( Lower_Band > 15.9204 )
									ret := -0.160494
							if( Upper_Band > 16.571 )
								if( Upper_Band <= 17.2795 )
									ret := 0.777778 // buy
								if( Upper_Band > 17.2795 )
									ret := 1.000000 // buy
						if( Lower_Band > 17.1365 )
							if( bbm <= 0.000308 )
								if( basis <= 21.5498 )
									ret := -0.141104
								if( basis > 21.5498 )
									ret := 0.268156
							if( bbm > 0.000308 )
								if( basis <= 20.6127 )
									ret := 1.000000 // buy
								if( basis > 20.6127 )
									ret := 0.347222
					if( bullPower > -0.054923 )
						if( basis <= 17.2405 )
							if( Lower_Band <= 16.8706 )
								if( basis <= 16.731 )
									ret := 0.730897 // buy
								if( basis > 16.731 )
									ret := 0.200000
							if( Lower_Band > 16.8706 )
								if( bbp <= -0.086922 )
									ret := 0.916667 // buy
								if( bbp > -0.086922 )
									ret := 1.000000 // buy
						if( basis > 17.2405 )
							if( Lower_Band <= 17.5698 )
								ret := -0.081081
							if( Lower_Band > 17.5698 )
								if( bbp <= -0.098302 )
									ret := 0.186916
								if( bbp > -0.098302 )
									ret := 0.485380
			if( bbm > 0.004993 )
				if( basis <= 16.2926 )
					if( basis <= 16.0879 )
						if( bearPower <= -0.083887 )
							if( Upper_Band <= 15.9616 )
								if( Upper_Band <= 14.5116 )
									ret := -0.155844
								if( Upper_Band > 14.5116 )
									ret := 0.449123
							if( Upper_Band > 15.9616 )
								if( basis <= 15.909 )
									ret := -0.523364
								if( basis > 15.909 )
									ret := 0.255102
						if( bearPower > -0.083887 )
							if( basis <= 13.8421 )
								if( Upper_Band <= 13.8736 )
									ret := -0.941176 // sell
								if( Upper_Band > 13.8736 )
									ret := -0.600000
							if( basis > 13.8421 )
								if( Upper_Band <= 14.322 )
									ret := 0.395062
								if( Upper_Band > 14.322 )
									ret := -0.075048
					if( basis > 16.0879 )
						if( bearPower <= -0.056111 )
							if( Lower_Band <= 16.0005 )
								if( basis <= 16.141 )
									ret := 0.283333
								if( basis > 16.141 )
									ret := 0.816092 // buy
							if( Lower_Band > 16.0005 )
								if( bearPower <= -0.121141 )
									ret := 0.673913
								if( bearPower > -0.121141 )
									ret := 0.260054
						if( bearPower > -0.056111 )
							if( bbp <= -0.043274 )
								if( Upper_Band <= 16.3058 )
									ret := 0.014085
								if( Upper_Band > 16.3058 )
									ret := 0.544910
							if( bbp > -0.043274 )
								if( Lower_Band <= 16.1233 )
									ret := -0.736842 // sell
								if( Lower_Band > 16.1233 )
									ret := -0.300000
				if( basis > 16.2926 )
					if( Upper_Band <= 16.5913 )
						if( basis <= 16.3949 )
							if( basis <= 16.3101 )
								if( Lower_Band <= 16.2352 )
									ret := -0.510638
								if( Lower_Band > 16.2352 )
									ret := -0.920000 // sell
							if( basis > 16.3101 )
								if( basis <= 16.3229 )
									ret := 0.579710
								if( basis > 16.3229 )
									ret := -0.033684
						if( basis > 16.3949 )
							if( Upper_Band <= 16.5294 )
								if( bbp <= -0.089519 )
									ret := 0.250000
								if( bbp > -0.089519 )
									ret := -0.395349
							if( Upper_Band > 16.5294 )
								if( bbp <= -0.151029 )
									ret := 0.340426
								if( bbp > -0.151029 )
									ret := -0.789298 // sell
					if( Upper_Band > 16.5913 )
						if( bbp <= -0.455649 )
							if( bearPower <= -0.276288 )
								if( Upper_Band <= 25.1103 )
									ret := -0.412844
								if( Upper_Band > 25.1103 )
									ret := 0.500000
							if( bearPower > -0.276288 )
								ret := 0.533333
						if( bbp > -0.455649 )
							if( Upper_Band <= 25.4974 )
								if( Upper_Band <= 24.9922 )
									ret := 0.014325
								if( Upper_Band > 24.9922 )
									ret := -0.303030
							if( Upper_Band > 25.4974 )
								if( basis <= 25.424 )
									ret := 0.983871 // buy
								if( basis > 25.424 )
									ret := 0.000000
		if( bearPower > -0.03569 )
			if( bullPower <= -0.021238 )
				if( Upper_Band <= 13.9989 )
					if( Lower_Band <= 13.8097 )
						if( bearPower <= -0.030193 )
							ret := 0.846154 // buy
						if( bearPower > -0.030193 )
							ret := 0.937500 // buy
					if( Lower_Band > 13.8097 )
						if( Upper_Band <= 13.9749 )
							if( Lower_Band <= 13.8405 )
								ret := 0.142857
							if( Lower_Band > 13.8405 )
								ret := 0.583333
						if( Upper_Band > 13.9749 )
							ret := 1.000000 // buy
				if( Upper_Band > 13.9989 )
					if( bullPower <= -0.03128 )
						if( Lower_Band <= 14.7316 )
							if( Lower_Band <= 14.2651 )
								ret := 0.187500
							if( Lower_Band > 14.2651 )
								ret := -0.666667
						if( Lower_Band > 14.7316 )
							if( basis <= 15.7324 )
								if( bearPower <= -0.032147 )
									ret := 1.000000 // buy
								if( bearPower > -0.032147 )
									ret := 0.600000
							if( basis > 15.7324 )
								if( bullPower <= -0.035443 )
									ret := 0.777778 // buy
								if( bullPower > -0.035443 )
									ret := 0.459075
					if( bullPower > -0.03128 )
						if( Lower_Band <= 14.13 )
							if( bbm <= 0.000518 )
								ret := -0.777778 // sell
							if( bbm > 0.000518 )
								ret := -1.000000 // sell
						if( Lower_Band > 14.13 )
							if( bbm <= 0.004891 )
								if( Lower_Band <= 16.393 )
									ret := 0.484127
								if( Lower_Band > 16.393 )
									ret := 0.273333
							if( bbm > 0.004891 )
								if( Lower_Band <= 21.6754 )
									ret := 0.174312
								if( Lower_Band > 21.6754 )
									ret := -0.246914
			if( bullPower > -0.021238 )
				if( bbp <= -0.051861 )
					if( bullPower <= -0.020566 )
						if( bbp <= -0.053915 )
							ret := -0.809524 // sell
						if( bbp > -0.053915 )
							ret := -0.388889
					if( bullPower > -0.020566 )
						if( Upper_Band <= 17.0738 )
							if( Lower_Band <= 16.02 )
								if( bbp <= -0.053108 )
									ret := -0.583333
								if( bbp > -0.053108 )
									ret := 0.538462
							if( Lower_Band > 16.02 )
								if( bbp <= -0.053143 )
									ret := -0.708333 // sell
								if( bbp > -0.053143 )
									ret := -0.937500 // sell
						if( Upper_Band > 17.0738 )
							if( bbm <= 0.015545 )
								if( bbp <= -0.053438 )
									ret := 0.093750
								if( bbp > -0.053438 )
									ret := -0.555556
							if( bbm > 0.015545 )
								if( bullPower <= -0.01832 )
									ret := 0.600000
								if( bullPower > -0.01832 )
									ret := 0.055556
				if( bbp > -0.051861 )
					if( basis <= 14.3143 )
						if( Upper_Band <= 14.2426 )
							if( Upper_Band <= 14.2351 )
								if( basis <= 14.2058 )
									ret := 0.116883
								if( basis > 14.2058 )
									ret := 0.904762 // buy
							if( Upper_Band > 14.2351 )
								ret := -1.000000 // sell
						if( Upper_Band > 14.2426 )
							if( bbp <= -0.045913 )
								ret := -0.100000
							if( bbp > -0.045913 )
								if( bullPower <= -0.000721 )
									ret := 0.740933 // buy
								if( bullPower > -0.000721 )
									ret := 0.325581
					if( basis > 14.3143 )
						if( Lower_Band <= 14.2594 )
							if( bearPower <= -0.024462 )
								ret := -1.000000 // sell
							if( bearPower > -0.024462 )
								ret := -0.555556
						if( Lower_Band > 14.2594 )
							if( Lower_Band <= 24.2673 )
								if( bullPower <= -0.018983 )
									ret := 0.231250
								if( bullPower > -0.018983 )
									ret := 0.037805
							if( Lower_Band > 24.2673 )
								if( bbp <= -0.016098 )
									ret := -0.095368
								if( bbp > -0.016098 )
									ret := -0.350515
	if( bullPower > 0.004408 )
		if( bbp <= 0.016741 )
			if( Lower_Band <= 15.1956 )
				if( bbp <= -0.038118 )
					if( basis <= 14.8992 )
						if( bbp <= -0.042936 )
							if( basis <= 13.865 )
								ret := -0.733333 // sell
							if( basis > 13.865 )
								if( basis <= 14.2725 )
									ret := 0.769231 // buy
								if( basis > 14.2725 )
									ret := -0.333333
						if( bbp > -0.042936 )
							ret := -0.785714 // sell
					if( basis > 14.8992 )
						ret := 0.850000 // buy
				if( bbp > -0.038118 )
					if( bbp <= 0.013667 )
						if( Upper_Band <= 14.3195 )
							if( bullPower <= 0.015421 )
								if( basis <= 14.0153 )
									ret := -0.052632
								if( basis > 14.0153 )
									ret := 0.778523 // buy
							if( bullPower > 0.015421 )
								if( bbm <= 0.069458 )
									ret := 0.090909
								if( bbm > 0.069458 )
									ret := 0.954545 // buy
						if( Upper_Band > 14.3195 )
							if( bbp <= 0.012944 )
								if( Upper_Band <= 15.0579 )
									ret := 0.013187
								if( Upper_Band > 15.0579 )
									ret := 0.586826
							if( bbp > 0.012944 )
								ret := -0.666667
					if( bbp > 0.013667 )
						if( Upper_Band <= 14.3514 )
							if( bbp <= 0.01523 )
								ret := -0.214286
							if( bbp > 0.01523 )
								ret := 0.818182 // buy
						if( Upper_Band > 14.3514 )
							if( Upper_Band <= 14.4881 )
								ret := 0.952381 // buy
							if( Upper_Band > 14.4881 )
								if( basis <= 14.9994 )
									ret := 0.187500
								if( basis > 14.9994 )
									ret := 0.807692 // buy
			if( Lower_Band > 15.1956 )
				if( bullPower <= 0.029874 )
					if( bbp <= -0.051931 )
						if( Lower_Band <= 17.5699 )
							if( bearPower <= -0.124102 )
								if( bbm <= 0.168809 )
									ret := -0.636364
								if( bbm > 0.168809 )
									ret := -0.470588
							if( bearPower > -0.124102 )
								if( Lower_Band <= 16.6557 )
									ret := 0.081395
								if( Lower_Band > 16.6557 )
									ret := -0.607143
						if( Lower_Band > 17.5699 )
							if( bbp <= -0.054354 )
								if( bbp <= -0.058211 )
									ret := 0.279528
								if( bbp > -0.058211 )
									ret := -0.122449
							if( bbp > -0.054354 )
								if( basis <= 21.8516 )
									ret := 1.000000 // buy
								if( basis > 21.8516 )
									ret := 0.636364
					if( bbp > -0.051931 )
						if( Upper_Band <= 15.3083 )
							if( Lower_Band <= 15.2227 )
								if( Lower_Band <= 15.2099 )
									ret := -0.500000
								if( Lower_Band > 15.2099 )
									ret := -0.966667 // sell
							if( Lower_Band > 15.2227 )
								if( Lower_Band <= 15.2349 )
									ret := -0.333333
								if( Lower_Band > 15.2349 )
									ret := 0.000000
						if( Upper_Band > 15.3083 )
							if( Lower_Band <= 15.3313 )
								if( bearPower <= -0.026847 )
									ret := 0.652174
								if( bearPower > -0.026847 )
									ret := 0.146341
							if( Lower_Band > 15.3313 )
								if( bearPower <= -0.070848 )
									ret := -0.789474 // sell
								if( bearPower > -0.070848 )
									ret := -0.018010
				if( bullPower > 0.029874 )
					if( Upper_Band <= 16.6614 )
						if( bbp <= -0.116532 )
							ret := -0.800000 // sell
						if( bbp > -0.116532 )
							if( Lower_Band <= 16.0456 )
								if( bullPower <= 0.032977 )
									ret := 0.647059
								if( bullPower > 0.032977 )
									ret := 0.000000
							if( Lower_Band > 16.0456 )
								if( Lower_Band <= 16.4737 )
									ret := 0.504950
								if( Lower_Band > 16.4737 )
									ret := 1.000000 // buy
					if( Upper_Band > 16.6614 )
						if( bullPower <= 0.039757 )
							if( bearPower <= -0.041755 )
								if( Lower_Band <= 23.3368 )
									ret := 0.284974
								if( Lower_Band > 23.3368 )
									ret := 0.766667 // buy
							if( bearPower > -0.041755 )
								if( basis <= 17.8266 )
									ret := -0.500000
								if( basis > 17.8266 )
									ret := 0.153153
						if( bullPower > 0.039757 )
							if( Upper_Band <= 22.3487 )
								if( Upper_Band <= 18.2254 )
									ret := -0.275591
								if( Upper_Band > 18.2254 )
									ret := 0.253589
							if( Upper_Band > 22.3487 )
								if( bullPower <= 0.120408 )
									ret := -0.232432
								if( bullPower > 0.120408 )
									ret := -1.000000 // sell
		if( bbp > 0.016741 )
			if( bbm <= 0.009074 )
				if( bullPower <= 0.033513 )
					if( bullPower <= 0.024152 )
						if( bbp <= 0.046795 )
							if( Upper_Band <= 18.7597 )
								if( bullPower <= 0.023725 )
									ret := -0.237929
								if( bullPower > 0.023725 )
									ret := 0.615385
							if( Upper_Band > 18.7597 )
								if( basis <= 21.1938 )
									ret := 0.153571
								if( basis > 21.1938 )
									ret := -0.077726
						if( bbp > 0.046795 )
							if( bullPower <= 0.024078 )
								if( bearPower <= 0.023943 )
									ret := -0.343750
								if( bearPower > 0.023943 )
									ret := -0.909091 // sell
							if( bullPower > 0.024078 )
								ret := 0.230769
					if( bullPower > 0.024152 )
						if( bbp <= 0.04579 )
							if( Upper_Band <= 17.0469 )
								if( bbp <= 0.043469 )
									ret := -0.333333
								if( bbp > 0.043469 )
									ret := -0.878788 // sell
							if( Upper_Band > 17.0469 )
								if( bullPower <= 0.024874 )
									ret := 0.272727
								if( bullPower > 0.024874 )
									ret := -0.500000
						if( bbp > 0.04579 )
							if( bbp <= 0.048217 )
								if( bullPower <= 0.025239 )
									ret := -0.538462
								if( bullPower > 0.025239 )
									ret := 0.268293
							if( bbp > 0.048217 )
								if( basis <= 15.7096 )
									ret := -0.500000
								if( basis > 15.7096 )
									ret := -0.173529
				if( bullPower > 0.033513 )
					if( basis <= 24.1702 )
						if( basis <= 13.877 )
							if( Upper_Band <= 13.8786 )
								if( basis <= 13.5428 )
									ret := 0.307692
								if( basis > 13.5428 )
									ret := -0.500000
							if( Upper_Band > 13.8786 )
								ret := 0.916667 // buy
						if( basis > 13.877 )
							if( bullPower <= 0.04156 )
								if( bullPower <= 0.035061 )
									ret := -0.484277
								if( bullPower > 0.035061 )
									ret := -0.253968
							if( bullPower > 0.04156 )
								if( bullPower <= 0.043756 )
									ret := -0.611570
								if( bullPower > 0.043756 )
									ret := -0.404079
					if( basis > 24.1702 )
						if( basis <= 24.2749 )
							if( bearPower <= 0.060939 )
								if( Upper_Band <= 24.3341 )
									ret := 0.545455
								if( Upper_Band > 24.3341 )
									ret := 1.000000 // buy
							if( bearPower > 0.060939 )
								ret := 0.375000
						if( basis > 24.2749 )
							if( basis <= 24.8333 )
								if( Upper_Band <= 24.9464 )
									ret := -0.615385
								if( Upper_Band > 24.9464 )
									ret := 0.050000
							if( basis > 24.8333 )
								if( Upper_Band <= 25.0053 )
									ret := 0.947368 // buy
								if( Upper_Band > 25.0053 )
									ret := -0.162162
			if( bbm > 0.009074 )
				if( bbm <= 0.2125 )
					if( basis <= 22.7955 )
						if( bbm <= 0.038551 )
							if( bullPower <= 0.153458 )
								if( bbp <= 0.120469 )
									ret := -0.047154
								if( bbp > 0.120469 )
									ret := 0.064777
							if( bullPower > 0.153458 )
								if( Lower_Band <= 15.9832 )
									ret := -0.357143
								if( Lower_Band > 15.9832 )
									ret := -0.864865 // sell
						if( bbm > 0.038551 )
							if( bearPower <= 0.019627 )
								if( Upper_Band <= 22.4772 )
									ret := -0.040090
								if( Upper_Band > 22.4772 )
									ret := 0.280460
							if( bearPower > 0.019627 )
								if( Lower_Band <= 14.5899 )
									ret := -0.271028
								if( Lower_Band > 14.5899 )
									ret := 0.110387
					if( basis > 22.7955 )
						if( Lower_Band <= 22.5416 )
							if( bullPower <= 0.371385 )
								if( bbp <= 0.47509 )
									ret := 0.611111
								if( bbp > 0.47509 )
									ret := 1.000000 // buy
							if( bullPower > 0.371385 )
								ret := -0.818182 // sell
						if( Lower_Band > 22.5416 )
							if( Lower_Band <= 22.9372 )
								if( bearPower <= 0.016624 )
									ret := -0.142857
								if( bearPower > 0.016624 )
									ret := -0.609272
							if( Lower_Band > 22.9372 )
								if( bullPower <= 0.105175 )
									ret := -0.051514
								if( bullPower > 0.105175 )
									ret := -0.300952
				if( bbm > 0.2125 )
					if( Upper_Band <= 24.3147 )
						if( bbp <= 0.114634 )
							if( Lower_Band <= 22.4442 )
								if( bearPower <= -0.105796 )
									ret := -0.692308
								if( bearPower > -0.105796 )
									ret := -0.111111
							if( Lower_Band > 22.4442 )
								ret := 0.625000
						if( bbp > 0.114634 )
							if( Upper_Band <= 15.0359 )
								if( bbp <= 0.633324 )
									ret := 0.217391
								if( bbp > 0.633324 )
									ret := -0.400000
							if( Upper_Band > 15.0359 )
								if( bearPower <= 0.424893 )
									ret := 0.482759
								if( bearPower > 0.424893 )
									ret := 1.000000 // buy
					if( Upper_Band > 24.3147 )
						if( bearPower <= 0.02635 )
							ret := -0.230769
						if( bearPower > 0.02635 )
							ret := -1.000000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Bollinger_Bands 
//@version=5
//indicator shorttitle="BB", title="Bollinger Bands", overlay=true, timeframe="", timeframe_gaps=true)
length_BB = input.int(20, minval=1)
maType = input.string("SMA", "Basis MA Type", options = ["SMA", "EMA", "SMMA (RMA)", "WMA", "VWMA"])
src = input(close, title="Source")
mult = input.float(2.0, minval=0.001, maxval=50, title="StdDev")

ma(source, length_BB, _type) =>
    switch _type
        "SMA" => ta.sma(source, length_BB)
        "EMA" => ta.ema(source, length_BB)
        "SMMA (RMA)" => ta.rma(source, length_BB)
        "WMA" => ta.wma(source, length_BB)
        "VWMA" => ta.vwma(source, length_BB)

basis = ma(src, length_BB, maType)
dev = mult * ta.stdev(src, length_BB)
Upper_Band = basis + dev
Lower_Band = basis - dev
offset = input.int(0, "Offset", minval = -500, maxval = 500, display = display.data_window)
plot(basis, "Basis", color=#2962FF, offset = offset)
p1 = plot(Upper_Band, "Upper", color=#F23645, offset = offset)
p2 = plot(Lower_Band, "Lower", color=#089981, offset = offset)
fill(p1, p2, title = "Background", color=color.rgb(33, 150, 243, 95))

//CODE associated with the technical indicator L_Bull_Bear_Power 
//@version=5
//indicator "Bull Bear Power", shorttitle="BBP")
lengthInput = input.int(13, title="Length")
bullPower = high - ta.ema(close, lengthInput)
bearPower = low - ta.ema(close, lengthInput)
bbp = bullPower + bearPower

bbm = bullPower - bearPower

plot(bbp, color = bbp >= 0 ? #089981 : #f23645, title="BBPower", style = plot.style_columns)
hline(0, "Zero line")

BBPower_Color = bbp >= 0  ? 1: 0

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
float op_operation = decision_tree_0_U_1Min_1b4428f1(Upper_Band, basis, Lower_Band, bbp, bullPower, BBPower_Color, bearPower, bbm)

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


