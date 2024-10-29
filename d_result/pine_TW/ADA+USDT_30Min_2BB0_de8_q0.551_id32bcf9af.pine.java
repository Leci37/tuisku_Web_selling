//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bollinger_Bands, L_Bull_Bear_Power
// ID_model: ADAUSDT_30Min_2BB0_32bcf9af Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ADAUSDT_30Min_2BB0_32bcf9af", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ADAUSDT_30Min_32bcf9af(Upper_Band, basis, Lower_Band, bullPower, bbp, bearPower, bbm, BBPower_Color)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( bearPower <= -0.017469 )
		if( Lower_Band <= 0.473844 )
			if( basis <= 0.403634 )
				if( bullPower <= -0.011849 )
					if( basis <= 0.300002 )
						if( bbp <= -0.044222 )
							ret := -0.857143 // sell
						if( bbp > -0.044222 )
							ret := -0.250000
					if( basis > 0.300002 )
						if( Lower_Band <= 0.301775 )
							ret := 1.000000 // buy
						if( Lower_Band > 0.301775 )
							if( bbm <= 0.0076 )
								ret := 0.857143 // buy
							if( bbm > 0.0076 )
								if( bbm <= 0.010337 )
									ret := 0.000000
								if( bbm > 0.010337 )
									ret := -0.833333 // sell
				if( bullPower > -0.011849 )
					if( Lower_Band <= 0.367934 )
						if( bearPower <= -0.020197 )
							if( bbp <= -0.030605 )
								if( bearPower <= -0.034992 )
									ret := 0.500000
								if( bearPower > -0.034992 )
									ret := 0.921053 // buy
							if( bbp > -0.030605 )
								if( Upper_Band <= 0.384335 )
									ret := 0.294118
								if( Upper_Band > 0.384335 )
									ret := 1.000000 // buy
						if( bearPower > -0.020197 )
							if( bbm <= 0.014999 )
								if( bullPower <= -0.005732 )
									ret := 0.514286
								if( bullPower > -0.005732 )
									ret := -0.294118
							if( bbm > 0.014999 )
								if( Upper_Band <= 0.352648 )
									ret := 1.000000 // buy
								if( Upper_Band > 0.352648 )
									ret := 0.400000
					if( Lower_Band > 0.367934 )
						if( bullPower <= -0.00746 )
							ret := 0.333333
						if( bullPower > -0.00746 )
							ret := -1.000000 // sell
			if( basis > 0.403634 )
				if( bullPower <= -0.000603 )
					if( bullPower <= -0.008294 )
						if( Lower_Band <= 0.440989 )
							ret := 1.000000 // buy
						if( Lower_Band > 0.440989 )
							if( bbm <= 0.018787 )
								if( Lower_Band <= 0.470662 )
									ret := 0.888889 // buy
								if( Lower_Band > 0.470662 )
									ret := 0.500000
							if( bbm > 0.018787 )
								ret := 0.000000
					if( bullPower > -0.008294 )
						if( basis <= 0.476593 )
							if( Upper_Band <= 0.424056 )
								ret := 0.000000
							if( Upper_Band > 0.424056 )
								if( bullPower <= -0.004998 )
									ret := 1.000000 // buy
								if( bullPower > -0.004998 )
									ret := 0.760000 // buy
						if( basis > 0.476593 )
							if( Lower_Band <= 0.445893 )
								if( basis <= 0.482325 )
									ret := -0.750000 // sell
								if( basis > 0.482325 )
									ret := -1.000000 // sell
							if( Lower_Band > 0.445893 )
								if( bullPower <= -0.008121 )
									ret := 0.000000
								if( bullPower > -0.008121 )
									ret := 0.866667 // buy
				if( bullPower > -0.000603 )
					if( Upper_Band <= 0.483033 )
						ret := 1.000000 // buy
					if( Upper_Band > 0.483033 )
						ret := -1.000000 // sell
		if( Lower_Band > 0.473844 )
			if( Lower_Band <= 1.20192 )
				if( Upper_Band <= 1.28472 )
					if( Upper_Band <= 1.26672 )
						if( Upper_Band <= 1.19896 )
							if( basis <= 1.11371 )
								if( bbm <= 0.03196 )
									ret := 0.160295
								if( bbm > 0.03196 )
									ret := 0.438163
							if( basis > 1.11371 )
								if( bbm <= 0.0363 )
									ret := -0.123967
								if( bbm > 0.0363 )
									ret := -0.888889 // sell
						if( Upper_Band > 1.19896 )
							if( Lower_Band <= 1.1367 )
								if( basis <= 1.14834 )
									ret := 0.103448
								if( basis > 1.14834 )
									ret := 0.644068
							if( Lower_Band > 1.1367 )
								if( Upper_Band <= 1.21176 )
									ret := -0.111111
								if( Upper_Band > 1.21176 )
									ret := 0.313559
					if( Upper_Band > 1.26672 )
						if( bbm <= 0.020944 )
							if( bbp <= -0.033924 )
								if( Lower_Band <= 1.15638 )
									ret := 1.000000 // buy
								if( Lower_Band > 1.15638 )
									ret := 0.333333
							if( bbp > -0.033924 )
								ret := -0.600000
						if( bbm > 0.020944 )
							if( Lower_Band <= 1.11602 )
								if( bbm <= 0.040265 )
									ret := 0.857143 // buy
								if( bbm > 0.040265 )
									ret := -1.000000 // sell
							if( Lower_Band > 1.11602 )
								if( bearPower <= -0.060225 )
									ret := 0.000000
								if( bearPower > -0.060225 )
									ret := -0.815789 // sell
				if( Upper_Band > 1.28472 )
					if( basis <= 1.26302 )
						if( bbp <= -0.008981 )
							if( bbm <= 0.015197 )
								if( bbm <= 0.014989 )
									ret := 0.666667
								if( bbm > 0.014989 )
									ret := -0.750000 // sell
							if( bbm > 0.015197 )
								if( Upper_Band <= 1.29396 )
									ret := 0.423077
								if( Upper_Band > 1.29396 )
									ret := 0.832000 // buy
						if( bbp > -0.008981 )
							if( bbp <= 0.005324 )
								ret := -0.571429
							if( bbp > 0.005324 )
								ret := 1.000000 // buy
					if( basis > 1.26302 )
						if( Lower_Band <= 1.1261 )
							if( basis <= 1.28741 )
								ret := -0.750000 // sell
							if( basis > 1.28741 )
								ret := -1.000000 // sell
						if( Lower_Band > 1.1261 )
							if( bearPower <= -0.061259 )
								if( basis <= 1.34924 )
									ret := 0.794118 // buy
								if( basis > 1.34924 )
									ret := 0.142857
							if( bearPower > -0.061259 )
								if( basis <= 1.28807 )
									ret := 0.120000
								if( basis > 1.28807 )
									ret := -0.526316
			if( Lower_Band > 1.20192 )
				if( Lower_Band <= 1.26891 )
					if( Upper_Band <= 1.31481 )
						if( Upper_Band <= 1.28741 )
							if( bearPower <= -0.018778 )
								if( bullPower <= -0.012378 )
									ret := 0.272727
								if( bullPower > -0.012378 )
									ret := -0.435644
							if( bearPower > -0.018778 )
								if( Upper_Band <= 1.25016 )
									ret := 0.800000 // buy
								if( Upper_Band > 1.25016 )
									ret := -0.166667
						if( Upper_Band > 1.28741 )
							if( bearPower <= -0.020614 )
								if( bbp <= -0.022811 )
									ret := 0.397059
								if( bbp > -0.022811 )
									ret := -0.714286 // sell
							if( bearPower > -0.020614 )
								if( Lower_Band <= 1.22469 )
									ret := 1.000000 // buy
								if( Lower_Band > 1.22469 )
									ret := 0.470588
					if( Upper_Band > 1.31481 )
						if( bearPower <= -0.028647 )
							if( bullPower <= -0.006925 )
								if( Lower_Band <= 1.24053 )
									ret := -0.588235
								if( Lower_Band > 1.24053 )
									ret := -0.140351
							if( bullPower > -0.006925 )
								if( bullPower <= 0.004082 )
									ret := 0.655172
								if( bullPower > 0.004082 )
									ret := -0.571429
						if( bearPower > -0.028647 )
							if( basis <= 1.29848 )
								if( bullPower <= -0.010368 )
									ret := -0.166667
								if( bullPower > -0.010368 )
									ret := -0.857143 // sell
							if( basis > 1.29848 )
								if( bearPower <= -0.018204 )
									ret := -0.600000
								if( bearPower > -0.018204 )
									ret := 0.800000 // buy
				if( Lower_Band > 1.26891 )
					if( bearPower <= -0.027071 )
						if( Upper_Band <= 2.80934 )
							if( Upper_Band <= 2.71918 )
								if( basis <= 1.34505 )
									ret := 0.477477
								if( basis > 1.34505 )
									ret := 0.130041
							if( Upper_Band > 2.71918 )
								if( bearPower <= -0.134137 )
									ret := 0.833333 // buy
								if( bearPower > -0.134137 )
									ret := -0.444444
						if( Upper_Band > 2.80934 )
							if( Lower_Band <= 2.78084 )
								if( basis <= 2.7532 )
									ret := 0.341463
								if( basis > 2.7532 )
									ret := 0.750000 // buy
							if( Lower_Band > 2.78084 )
								if( bullPower <= 0.003448 )
									ret := 0.277108
								if( bullPower > 0.003448 )
									ret := -0.454545
					if( bearPower > -0.027071 )
						if( Lower_Band <= 1.43899 )
							if( bullPower <= -0.003726 )
								if( basis <= 1.34644 )
									ret := 0.306122
								if( basis > 1.34644 )
									ret := -0.116129
							if( bullPower > -0.003726 )
								if( bullPower <= 0.013009 )
									ret := 0.425000
								if( bullPower > 0.013009 )
									ret := 0.054054
						if( Lower_Band > 1.43899 )
							if( Lower_Band <= 1.45426 )
								if( bbm <= 0.026125 )
									ret := -0.676471
								if( bbm > 0.026125 )
									ret := 0.428571
							if( Lower_Band > 1.45426 )
								if( bullPower <= -0.007701 )
									ret := -0.220859
								if( bullPower > -0.007701 )
									ret := 0.003660
	if( bearPower > -0.017469 )
		if( Lower_Band <= 1.31676 )
			if( Lower_Band <= 1.26662 )
				if( basis <= 0.096374 )
					if( Lower_Band <= 0.077261 )
						if( Lower_Band <= 0.076624 )
							if( bbp <= -6.6e-05 )
								if( Lower_Band <= 0.075636 )
									ret := 0.000000
								if( Lower_Band > 0.075636 )
									ret := 0.750000 // buy
							if( bbp > -6.6e-05 )
								if( Upper_Band <= 0.07857 )
									ret := -0.250000
								if( Upper_Band > 0.07857 )
									ret := 0.000000
						if( Lower_Band > 0.076624 )
							if( bullPower <= -0.000843 )
								ret := 0.500000
							if( bullPower > -0.000843 )
								ret := 1.000000 // buy
					if( Lower_Band > 0.077261 )
						if( Upper_Band <= 0.083104 )
							if( bbp <= 0.00118 )
								if( bbp <= -0.002423 )
									ret := -1.000000 // sell
								if( bbp > -0.002423 )
									ret := -0.075949
							if( bbp > 0.00118 )
								if( bbp <= 0.001516 )
									ret := -0.937500 // sell
								if( bbp > 0.001516 )
									ret := -0.500000
						if( Upper_Band > 0.083104 )
							if( basis <= 0.089118 )
								if( bullPower <= -0.001114 )
									ret := -0.750000 // sell
								if( bullPower > -0.001114 )
									ret := 0.619048
							if( basis > 0.089118 )
								if( basis <= 0.095763 )
									ret := 0.139408
								if( basis > 0.095763 )
									ret := 0.409091
				if( basis > 0.096374 )
					if( bbm <= 0.00211 )
						if( Upper_Band <= 0.101312 )
							if( BBPower_Color <= 0.5 )
								if( bullPower <= -0.000923 )
									ret := -0.795455 // sell
								if( bullPower > -0.000923 )
									ret := -0.293532
							if( BBPower_Color > 0.5 )
								if( Lower_Band <= 0.096496 )
									ret := -0.131737
								if( Lower_Band > 0.096496 )
									ret := 0.511111
						if( Upper_Band > 0.101312 )
							if( Lower_Band <= 0.151033 )
								if( Lower_Band <= 0.146726 )
									ret := 0.056974
								if( Lower_Band > 0.146726 )
									ret := 0.419492
							if( Lower_Band > 0.151033 )
								if( Upper_Band <= 0.157175 )
									ret := -0.680412
								if( Upper_Band > 0.157175 )
									ret := 0.004486
					if( bbm > 0.00211 )
						if( Lower_Band <= 0.307836 )
							if( bbp <= -0.003831 )
								if( Upper_Band <= 0.168185 )
									ret := 0.658120
								if( Upper_Band > 0.168185 )
									ret := 0.198574
							if( bbp > -0.003831 )
								if( Lower_Band <= 0.295928 )
									ret := 0.087634
								if( Lower_Band > 0.295928 )
									ret := 0.396774
						if( Lower_Band > 0.307836 )
							if( bearPower <= 0.039612 )
								if( bearPower <= -0.006681 )
									ret := 0.084935
								if( bearPower > -0.006681 )
									ret := 0.030320
							if( bearPower > 0.039612 )
								if( bullPower <= 0.072156 )
									ret := 0.095238
								if( bullPower > 0.072156 )
									ret := -0.714286 // sell
			if( Lower_Band > 1.26662 )
				if( bbm <= 0.009722 )
					if( Upper_Band <= 1.31384 )
						if( bullPower <= 0.00525 )
							if( bbm <= 0.0081 )
								ret := 0.250000
							if( bbm > 0.0081 )
								ret := 0.000000
						if( bullPower > 0.00525 )
							if( basis <= 1.28872 )
								ret := 0.750000 // buy
							if( basis > 1.28872 )
								ret := 1.000000 // buy
					if( Upper_Band > 1.31384 )
						if( bullPower <= 0.012638 )
							if( Upper_Band <= 1.34388 )
								if( bbp <= -0.012146 )
									ret := 0.241379
								if( bbp > -0.012146 )
									ret := -0.226277
							if( Upper_Band > 1.34388 )
								if( Lower_Band <= 1.30082 )
									ret := 0.478873
								if( Lower_Band > 1.30082 )
									ret := -0.033898
						if( bullPower > 0.012638 )
							if( basis <= 1.30666 )
								ret := -1.000000 // sell
							if( basis > 1.30666 )
								if( bbp <= 0.017991 )
									ret := -0.777778 // sell
								if( bbp > 0.017991 )
									ret := -0.360000
				if( bbm > 0.009722 )
					if( bullPower <= 0.125685 )
						if( basis <= 1.3874 )
							if( Upper_Band <= 1.45209 )
								if( bearPower <= 0.018865 )
									ret := 0.321934
								if( bearPower > 0.018865 )
									ret := -0.068966
							if( Upper_Band > 1.45209 )
								if( bearPower <= 0.023522 )
									ret := -0.800000 // sell
								if( bearPower > 0.023522 )
									ret := -0.400000
						if( basis > 1.3874 )
							if( Lower_Band <= 1.31452 )
								if( Lower_Band <= 1.29345 )
									ret := 0.750000 // buy
								if( Lower_Band > 1.29345 )
									ret := 0.971429 // buy
							if( Lower_Band > 1.31452 )
								ret := 0.600000
					if( bullPower > 0.125685 )
						ret := -1.000000 // sell
		if( Lower_Band > 1.31676 )
			if( Lower_Band <= 1.35656 )
				if( Upper_Band <= 1.37058 )
					if( Lower_Band <= 1.32 )
						if( Upper_Band <= 1.34865 )
							if( basis <= 1.3319 )
								if( basis <= 1.33159 )
									ret := 0.500000
								if( basis > 1.33159 )
									ret := 0.750000 // buy
							if( basis > 1.3319 )
								ret := 0.000000
						if( Upper_Band > 1.34865 )
							if( bbp <= -0.016649 )
								ret := 0.600000
							if( bbp > -0.016649 )
								if( Upper_Band <= 1.36898 )
									ret := -0.662338
								if( Upper_Band > 1.36898 )
									ret := 0.333333
					if( Lower_Band > 1.32 )
						if( bbp <= -0.011092 )
							if( bbm <= 0.01269 )
								if( bbp <= -0.014403 )
									ret := 0.666667
								if( bbp > -0.014403 )
									ret := 0.937500 // buy
							if( bbm > 0.01269 )
								if( basis <= 1.34052 )
									ret := 0.000000
								if( basis > 1.34052 )
									ret := 0.666667
						if( bbp > -0.011092 )
							if( bbm <= 0.023247 )
								if( bbp <= 0.01976 )
									ret := -0.004630
								if( bbp > 0.01976 )
									ret := -0.769231 // sell
							if( bbm > 0.023247 )
								if( Lower_Band <= 1.3223 )
									ret := 0.500000
								if( Lower_Band > 1.3223 )
									ret := 0.933333 // buy
				if( Upper_Band > 1.37058 )
					if( bbp <= 0.020953 )
						if( bearPower <= -0.012227 )
							if( basis <= 1.35563 )
								if( Upper_Band <= 1.38031 )
									ret := 0.000000
								if( Upper_Band > 1.38031 )
									ret := -1.000000 // sell
							if( basis > 1.35563 )
								if( bbp <= -0.016676 )
									ret := -0.080000
								if( bbp > -0.016676 )
									ret := 0.295455
						if( bearPower > -0.012227 )
							if( basis <= 1.3572 )
								if( bullPower <= 0.013588 )
									ret := -0.743802 // sell
								if( bullPower > 0.013588 )
									ret := -0.360000
							if( basis > 1.3572 )
								if( Upper_Band <= 1.425 )
									ret := -0.344660
								if( Upper_Band > 1.425 )
									ret := -0.692308
					if( bbp > 0.020953 )
						if( bearPower <= 0.004816 )
							if( bullPower <= 0.02597 )
								if( Lower_Band <= 1.32939 )
									ret := 1.000000 // buy
								if( Lower_Band > 1.32939 )
									ret := -0.285714
							if( bullPower > 0.02597 )
								if( Lower_Band <= 1.33171 )
									ret := 0.750000 // buy
								if( Lower_Band > 1.33171 )
									ret := 1.000000 // buy
						if( bearPower > 0.004816 )
							if( basis <= 1.35749 )
								if( basis <= 1.35037 )
									ret := -0.200000
								if( basis > 1.35037 )
									ret := 0.857143 // buy
							if( basis > 1.35749 )
								if( Upper_Band <= 1.429 )
									ret := -0.382716
								if( Upper_Band > 1.429 )
									ret := 0.120690
			if( Lower_Band > 1.35656 )
				if( basis <= 1.44426 )
					if( Upper_Band <= 1.41854 )
						if( basis <= 1.37898 )
							if( bbp <= 0.003204 )
								if( bbp <= -0.014463 )
									ret := 0.800000 // buy
								if( bbp > -0.014463 )
									ret := -0.200000
							if( bbp > 0.003204 )
								if( basis <= 1.37587 )
									ret := 0.000000
								if( basis > 1.37587 )
									ret := 0.777778 // buy
						if( basis > 1.37898 )
							if( basis <= 1.39084 )
								if( bbp <= 0.009907 )
									ret := -0.363636
								if( bbp > 0.009907 )
									ret := -1.000000 // sell
							if( basis > 1.39084 )
								if( bbm <= 0.01223 )
									ret := -0.764706 // sell
								if( bbm > 0.01223 )
									ret := -1.000000 // sell
					if( Upper_Band > 1.41854 )
						if( basis <= 1.40581 )
							if( bbm <= 0.014812 )
								if( basis <= 1.39706 )
									ret := -0.181818
								if( basis > 1.39706 )
									ret := 0.574074
							if( bbm > 0.014812 )
								if( Upper_Band <= 1.42255 )
									ret := 0.333333
								if( Upper_Band > 1.42255 )
									ret := 0.881579 // buy
						if( basis > 1.40581 )
							if( bullPower <= 0.026856 )
								if( bearPower <= 0.004287 )
									ret := 0.081250
								if( bearPower > 0.004287 )
									ret := -0.316667
							if( bullPower > 0.026856 )
								if( Upper_Band <= 1.463 )
									ret := 0.206897
								if( Upper_Band > 1.463 )
									ret := 0.795918 // buy
				if( basis > 1.44426 )
					if( bbp <= -0.005516 )
						if( bearPower <= -0.013903 )
							if( Lower_Band <= 1.44807 )
								if( Upper_Band <= 1.4895 )
									ret := -0.100000
								if( Upper_Band > 1.4895 )
									ret := 0.739130 // buy
							if( Lower_Band > 1.44807 )
								if( bullPower <= -0.002956 )
									ret := 0.084746
								if( bullPower > -0.002956 )
									ret := -0.156164
						if( bearPower > -0.013903 )
							if( Upper_Band <= 1.53947 )
								if( bbp <= -0.005969 )
									ret := -0.675676
								if( bbp > -0.005969 )
									ret := 0.250000
							if( Upper_Band > 1.53947 )
								if( basis <= 1.53781 )
									ret := 0.315789
								if( basis > 1.53781 )
									ret := -0.209226
					if( bbp > -0.005516 )
						if( bearPower <= -0.001034 )
							if( Lower_Band <= 2.80667 )
								if( Lower_Band <= 1.51368 )
									ret := -0.130814
								if( Lower_Band > 1.51368 )
									ret := 0.108791
							if( Lower_Band > 2.80667 )
								if( bearPower <= -0.003332 )
									ret := -0.451923
								if( bearPower > -0.003332 )
									ret := 0.133333
						if( bearPower > -0.001034 )
							if( bearPower <= 0.028405 )
								if( basis <= 1.45452 )
									ret := -0.637931
								if( basis > 1.45452 )
									ret := -0.089338
							if( bearPower > 0.028405 )
								if( bullPower <= 0.158651 )
									ret := 0.159905
								if( bullPower > 0.158651 )
									ret := -0.846154 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_ADAUSDT_30Min_32bcf9af(Upper_Band, basis, Lower_Band, bullPower, bbp, bearPower, bbm, BBPower_Color)

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


