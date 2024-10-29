//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Wave_Trend_Calculation
// ID_model: DOTUSDT_15Min_1WAV_ecd33707 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_DOTUSDT_15Min_1WAV_ecd33707", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_DOTUSDT_15Min_ecd33707(d, esa, d_tci, ci_wt2, wt2, ci, ap, tci)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ci <= -2.26402 )
		if( d <= 0.016088 )
			if( ci_wt2 <= -144.067 )
				if( ci_wt2 <= -160.973 )
					if( ci_wt2 <= -170.136 )
						if( ci <= -209.476 )
							if( esa <= 5.55145 )
								if( tci <= -13.2119 )
									ret := 0.350000
								if( tci > -13.2119 )
									ret := -0.500000
							if( esa > 5.55145 )
								if( tci <= -21.9042 )
									ret := -0.950000 // sell
								if( tci > -21.9042 )
									ret := 0.000000
						if( ci > -209.476 )
							if( wt2 <= 17.364 )
								if( tci <= -13.513 )
									ret := 0.181818
								if( tci > -13.513 )
									ret := 0.517241
							if( wt2 > 17.364 )
								if( wt2 <= 47.9784 )
									ret := 0.050000
								if( wt2 > 47.9784 )
									ret := 0.750000 // buy
					if( ci_wt2 > -170.136 )
						if( d_tci <= -3.04656 )
							if( ap <= 6.49826 )
								if( d_tci <= -21.0552 )
									ret := 0.083333
								if( d_tci > -21.0552 )
									ret := -0.322581
							if( ap > 6.49826 )
								if( d_tci <= -11.6561 )
									ret := 0.250000
								if( d_tci > -11.6561 )
									ret := 1.000000 // buy
						if( d_tci > -3.04656 )
							if( ap <= 6.9637 )
								if( wt2 <= 17.4823 )
									ret := -0.111111
								if( wt2 > 17.4823 )
									ret := -1.000000 // sell
							if( ap > 6.9637 )
								if( wt2 <= 2.15818 )
									ret := -1.000000 // sell
								if( wt2 > 2.15818 )
									ret := -0.750000 // sell
				if( ci_wt2 > -160.973 )
					if( tci <= 26.2478 )
						if( ci <= -162.166 )
							if( d <= 0.013192 )
								if( d_tci <= 32.5732 )
									ret := 0.678571
								if( d_tci > 32.5732 )
									ret := 0.103448
							if( d > 0.013192 )
								if( ap <= 6.33563 )
									ret := 1.000000 // buy
								if( ap > 6.33563 )
									ret := 0.454545
						if( ci > -162.166 )
							if( ci <= -154.347 )
								if( d <= 0.010797 )
									ret := 0.000000
								if( d > 0.010797 )
									ret := -0.538462
							if( ci > -154.347 )
								if( esa <= 6.37349 )
									ret := 0.240664
								if( esa > 6.37349 )
									ret := -0.059701
					if( tci > 26.2478 )
						if( wt2 <= 47.151 )
							if( tci <= 33.5414 )
								if( d <= 0.007708 )
									ret := 0.500000
								if( d > 0.007708 )
									ret := 1.000000 // buy
							if( tci > 33.5414 )
								ret := 0.400000
						if( wt2 > 47.151 )
							ret := 0.000000
			if( ci_wt2 > -144.067 )
				if( d_tci <= 39.0344 )
					if( wt2 <= -41.2533 )
						if( ci_wt2 <= 31.4697 )
							if( ap <= 5.02767 )
								ret := -0.285714
							if( ap > 5.02767 )
								if( ci <= -14.9031 )
									ret := 0.516129
								if( ci > -14.9031 )
									ret := -0.200000
						if( ci_wt2 > 31.4697 )
							if( esa <= 5.93532 )
								if( ci <= -6.83338 )
									ret := 0.947368 // buy
								if( ci > -6.83338 )
									ret := 0.250000
							if( esa > 5.93532 )
								ret := 0.000000
					if( wt2 > -41.2533 )
						if( esa <= 7.53783 )
							if( wt2 <= 43.0378 )
								if( wt2 <= -39.283 )
									ret := -0.243902
								if( wt2 > -39.283 )
									ret := 0.007446
							if( wt2 > 43.0378 )
								if( esa <= 6.55363 )
									ret := 0.142857
								if( esa > 6.55363 )
									ret := -0.271605
						if( esa > 7.53783 )
							if( tci <= -32.755 )
								if( tci <= -35.6317 )
									ret := -0.125000
								if( tci > -35.6317 )
									ret := -0.846154 // sell
							if( tci > -32.755 )
								if( ci <= -81.7852 )
									ret := -0.169014
								if( ci > -81.7852 )
									ret := 0.241935
				if( d_tci > 39.0344 )
					if( esa <= 6.17476 )
						if( ci_wt2 <= -50.7413 )
							if( d <= 0.009537 )
								if( ap <= 5.545 )
									ret := -0.052830
								if( ap > 5.545 )
									ret := 0.318182
							if( d > 0.009537 )
								if( d_tci <= 39.6719 )
									ret := -0.633333
								if( d_tci > 39.6719 )
									ret := -0.178414
						if( ci_wt2 > -50.7413 )
							if( ci_wt2 <= -39.5384 )
								if( ci_wt2 <= -43.0567 )
									ret := -0.017647
								if( ci_wt2 > -43.0567 )
									ret := 0.305085
							if( ci_wt2 > -39.5384 )
								if( esa <= 4.36113 )
									ret := 0.017271
								if( esa > 4.36113 )
									ret := -0.084819
					if( esa > 6.17476 )
						if( wt2 <= -47.867 )
							if( wt2 <= -51.3413 )
								if( tci <= -61.1284 )
									ret := -0.166667
								if( tci > -61.1284 )
									ret := 0.197674
							if( wt2 > -51.3413 )
								if( d_tci <= 44.8374 )
									ret := 0.894737 // buy
								if( d_tci > 44.8374 )
									ret := 0.456522
						if( wt2 > -47.867 )
							if( esa <= 8.03416 )
								if( ap <= 6.16523 )
									ret := 1.000000 // buy
								if( ap > 6.16523 )
									ret := 0.019553
							if( esa > 8.03416 )
								if( d_tci <= 40.883 )
									ret := -1.000000 // sell
								if( d_tci > 40.883 )
									ret := -0.444444
		if( d > 0.016088 )
			if( esa <= 11.0474 )
				if( d <= 0.10965 )
					if( wt2 <= 55.3675 )
						if( ci <= -236.378 )
							if( ci_wt2 <= -286.345 )
								ret := 0.250000
							if( ci_wt2 > -286.345 )
								if( ci <= -261.272 )
									ret := 1.000000 // buy
								if( ci > -261.272 )
									ret := 0.833333 // buy
						if( ci > -236.378 )
							if( ap <= 10.3884 )
								if( d <= 0.028664 )
									ret := 0.083315
								if( d > 0.028664 )
									ret := 0.139863
							if( ap > 10.3884 )
								if( ci_wt2 <= -131.305 )
									ret := 0.722222 // buy
								if( ci_wt2 > -131.305 )
									ret := -0.146226
					if( wt2 > 55.3675 )
						if( ci <= -91.0916 )
							if( tci <= 43.3375 )
								ret := -0.333333
							if( tci > 43.3375 )
								ret := -1.000000 // sell
						if( ci > -91.0916 )
							if( ap <= 8.63488 )
								if( d <= 0.04206 )
									ret := 0.418006
								if( d > 0.04206 )
									ret := 0.670103
							if( ap > 8.63488 )
								if( tci <= 50.7283 )
									ret := 0.500000
								if( tci > 50.7283 )
									ret := -0.354839
				if( d > 0.10965 )
					if( d_tci <= 29.9655 )
						if( wt2 <= 30.9637 )
							if( d_tci <= 18.3737 )
								if( ap <= 7.32167 )
									ret := 0.250000
								if( ap > 7.32167 )
									ret := -0.804348 // sell
							if( d_tci > 18.3737 )
								if( tci <= -28.8792 )
									ret := -1.000000 // sell
								if( tci > -28.8792 )
									ret := 0.081081
						if( wt2 > 30.9637 )
							if( ci_wt2 <= -70.5772 )
								if( d_tci <= -46.7902 )
									ret := 1.000000 // buy
								if( d_tci > -46.7902 )
									ret := -0.230769
							if( ci_wt2 > -70.5772 )
								ret := 1.000000 // buy
					if( d_tci > 29.9655 )
						if( esa <= 4.61083 )
							if( ci_wt2 <= 38.9526 )
								if( d <= 0.176338 )
									ret := -0.826087 // sell
								if( d > 0.176338 )
									ret := 0.000000
							if( ci_wt2 > 38.9526 )
								ret := 0.833333 // buy
						if( esa > 4.61083 )
							if( esa <= 7.17129 )
								if( d_tci <= 42.5709 )
									ret := -0.500000
								if( d_tci > 42.5709 )
									ret := 0.668770
							if( esa > 7.17129 )
								if( esa <= 10.4768 )
									ret := 0.229457
								if( esa > 10.4768 )
									ret := 0.618644
			if( esa > 11.0474 )
				if( esa <= 13.1018 )
					if( d_tci <= 18.1679 )
						if( tci <= 46.0597 )
							if( d_tci <= -19.5195 )
								if( esa <= 11.1114 )
									ret := -0.200000
								if( esa > 11.1114 )
									ret := -0.878049 // sell
							if( d_tci > -19.5195 )
								if( ci <= -98.5136 )
									ret := -0.043478
								if( ci > -98.5136 )
									ret := -0.547368
						if( tci > 46.0597 )
							if( ci <= -17.5799 )
								if( d <= 0.10668 )
									ret := 0.500000
								if( d > 0.10668 )
									ret := 1.000000 // buy
							if( ci > -17.5799 )
								ret := -0.750000 // sell
					if( d_tci > 18.1679 )
						if( ap <= 11.1028 )
							if( wt2 <= -26.8201 )
								if( d <= 0.206304 )
									ret := 0.685714
								if( d > 0.206304 )
									ret := -0.500000
							if( wt2 > -26.8201 )
								if( esa <= 11.1469 )
									ret := 0.200000
								if( esa > 11.1469 )
									ret := -0.666667
						if( ap > 11.1028 )
							if( d_tci <= 43.7337 )
								if( ci <= -65.0002 )
									ret := -0.204082
								if( ci > -65.0002 )
									ret := 0.333333
							if( d_tci > 43.7337 )
								if( tci <= -73.7017 )
									ret := 0.400000
								if( tci > -73.7017 )
									ret := -0.571429
				if( esa > 13.1018 )
					if( ci_wt2 <= -47.8623 )
						if( ci_wt2 <= -79.8087 )
							if( tci <= -44.2514 )
								if( tci <= -73.8328 )
									ret := 0.000000
								if( tci > -73.8328 )
									ret := -0.777778 // sell
							if( tci > -44.2514 )
								if( ci <= -62.7066 )
									ret := 0.106557
								if( ci > -62.7066 )
									ret := 0.608696
						if( ci_wt2 > -79.8087 )
							if( ap <= 13.4717 )
								if( d_tci <= 25.7729 )
									ret := 0.000000
								if( d_tci > 25.7729 )
									ret := 0.250000
							if( ap > 13.4717 )
								if( esa <= 13.9143 )
									ret := -1.000000 // sell
								if( esa > 13.9143 )
									ret := -0.469565
					if( ci_wt2 > -47.8623 )
						if( d_tci <= 42.986 )
							if( ci <= -23.9579 )
								if( esa <= 15.7904 )
									ret := 0.835165 // buy
								if( esa > 15.7904 )
									ret := 0.216216
							if( ci > -23.9579 )
								if( ci_wt2 <= -10.5031 )
									ret := -0.428571
								if( ci_wt2 > -10.5031 )
									ret := 0.166667
						if( d_tci > 42.986 )
							if( d <= 0.090396 )
								if( ap <= 15.5433 )
									ret := -0.689655
								if( ap > 15.5433 )
									ret := -0.194444
							if( d > 0.090396 )
								if( ci <= -118.6 )
									ret := -1.000000 // sell
								if( ci > -118.6 )
									ret := 0.254717
	if( ci > -2.26402 )
		if( ap <= 6.44251 )
			if( tci <= 81.7139 )
				if( d <= 0.016616 )
					if( ci_wt2 <= 181.425 )
						if( d <= 0.009831 )
							if( d_tci <= -25.4826 )
								if( tci <= 32.9166 )
									ret := 0.086207
								if( tci > 32.9166 )
									ret := 0.014350
							if( d_tci > -25.4826 )
								if( esa <= 4.01461 )
									ret := 0.080110
								if( esa > 4.01461 )
									ret := -0.028750
						if( d > 0.009831 )
							if( d <= 0.009837 )
								if( d <= 0.009834 )
									ret := 1.000000 // buy
								if( d > 0.009834 )
									ret := 0.500000
							if( d > 0.009837 )
								if( ci <= 201.182 )
									ret := 0.042170
								if( ci > 201.182 )
									ret := 0.833333 // buy
					if( ci_wt2 > 181.425 )
						if( ap <= 5.738 )
							if( ci_wt2 <= 188.652 )
								if( ap <= 4.37517 )
									ret := 0.000000
								if( ap > 4.37517 )
									ret := -0.733333 // sell
							if( ci_wt2 > 188.652 )
								if( ci <= 193.383 )
									ret := 0.166667
								if( ci > 193.383 )
									ret := -0.625000
						if( ap > 5.738 )
							if( d <= 0.013486 )
								if( wt2 <= -25.5856 )
									ret := -0.500000
								if( wt2 > -25.5856 )
									ret := 0.111111
							if( d > 0.013486 )
								ret := 0.500000
				if( d > 0.016616 )
					if( wt2 <= 62.3022 )
						if( tci <= -56.3933 )
							if( d <= 0.069015 )
								if( d_tci <= 61.8064 )
									ret := 0.648148
								if( d_tci > 61.8064 )
									ret := 0.071429
							if( d > 0.069015 )
								ret := -0.500000
						if( tci > -56.3933 )
							if( d_tci <= -61.3144 )
								if( d <= 0.034635 )
									ret := 0.129630
								if( d > 0.034635 )
									ret := 0.430380
							if( d_tci > -61.3144 )
								if( d_tci <= -45.902 )
									ret := 0.027005
								if( d_tci > -45.902 )
									ret := 0.123015
					if( wt2 > 62.3022 )
						if( ci_wt2 <= 66.6562 )
							if( d_tci <= -71.1901 )
								if( ci <= 40.4371 )
									ret := 0.366667
								if( ci > 40.4371 )
									ret := -0.209821
							if( d_tci > -71.1901 )
								if( wt2 <= 70.3159 )
									ret := -0.034286
								if( wt2 > 70.3159 )
									ret := 0.462428
						if( ci_wt2 > 66.6562 )
							if( wt2 <= 66.7492 )
								if( ci_wt2 <= 68.0913 )
									ret := 0.750000 // buy
								if( ci_wt2 > 68.0913 )
									ret := 1.000000 // buy
							if( wt2 > 66.7492 )
								ret := 0.500000
			if( tci > 81.7139 )
				if( tci <= 92.4054 )
					if( ci <= 66.1484 )
						if( ci_wt2 <= -26.6458 )
							ret := 0.714286 // buy
						if( ci_wt2 > -26.6458 )
							ret := -0.500000
					if( ci > 66.1484 )
						if( esa <= 4.86375 )
							ret := 0.166667
						if( esa > 4.86375 )
							if( d_tci <= -89.1696 )
								if( wt2 <= 80.0857 )
									ret := 0.000000
								if( wt2 > 80.0857 )
									ret := 1.000000 // buy
							if( d_tci > -89.1696 )
								if( ci <= 75.3023 )
									ret := 0.777778 // buy
								if( ci > 75.3023 )
									ret := 0.972222 // buy
				if( tci > 92.4054 )
					ret := -0.571429
		if( ap > 6.44251 )
			if( tci <= 81.3588 )
				if( ap <= 11.1128 )
					if( d <= 0.115021 )
						if( ci <= 48.1005 )
							if( d <= 0.044773 )
								if( wt2 <= 53.1126 )
									ret := -0.002944
								if( wt2 > 53.1126 )
									ret := -0.168807
							if( d > 0.044773 )
								if( esa <= 7.17747 )
									ret := 0.286000
								if( esa > 7.17747 )
									ret := 0.066282
						if( ci > 48.1005 )
							if( ap <= 8.59687 )
								if( ci <= 134.343 )
									ret := -0.032215
								if( ci > 134.343 )
									ret := 0.093551
							if( ap > 8.59687 )
								if( tci <= 58.2838 )
									ret := -0.079736
								if( tci > 58.2838 )
									ret := -0.352381
					if( d > 0.115021 )
						if( tci <= 57.2594 )
							if( d_tci <= -33.2855 )
								if( ci <= 166.903 )
									ret := 0.700000 // buy
								if( ci > 166.903 )
									ret := -1.000000 // sell
							if( d_tci > -33.2855 )
								if( ap <= 6.92481 )
									ret := -1.000000 // sell
								if( ap > 6.92481 )
									ret := 0.151351
						if( tci > 57.2594 )
							if( esa <= 8.93302 )
								if( d_tci <= -64.2743 )
									ret := 0.473214
								if( d_tci > -64.2743 )
									ret := -0.428571
							if( esa > 8.93302 )
								if( tci <= 74.3838 )
									ret := -0.189474
								if( tci > 74.3838 )
									ret := -0.785714 // sell
				if( ap > 11.1128 )
					if( d <= 0.031229 )
						if( d_tci <= -11.608 )
							if( ap <= 13.8257 )
								ret := -1.000000 // sell
							if( ap > 13.8257 )
								if( esa <= 16.4415 )
									ret := -0.142857
								if( esa > 16.4415 )
									ret := -1.000000 // sell
						if( d_tci > -11.608 )
							if( esa <= 16.9243 )
								if( ci_wt2 <= 37.9359 )
									ret := 0.187500
								if( ci_wt2 > 37.9359 )
									ret := 0.725000 // buy
							if( esa > 16.9243 )
								ret := -0.500000
					if( d > 0.031229 )
						if( ci_wt2 <= 167.278 )
							if( d_tci <= -58.1002 )
								if( d <= 0.083853 )
									ret := -0.333333
								if( d > 0.083853 )
									ret := -0.762712 // sell
							if( d_tci > -58.1002 )
								if( ci_wt2 <= 106.454 )
									ret := -0.106961
								if( ci_wt2 > 106.454 )
									ret := -0.549020
						if( ci_wt2 > 167.278 )
							if( wt2 <= 3.84025 )
								ret := 1.000000 // buy
							if( wt2 > 3.84025 )
								ret := 0.750000 // buy
			if( tci > 81.3588 )
				if( ap <= 7.12132 )
					if( wt2 <= 84.8557 )
						ret := 1.000000 // buy
					if( wt2 > 84.8557 )
						if( d <= 0.112451 )
							ret := 0.250000
						if( d > 0.112451 )
							if( ci <= 65.4013 )
								ret := 1.000000 // buy
							if( ci > 65.4013 )
								ret := 0.750000 // buy
				if( ap > 7.12132 )
					if( ap <= 7.68391 )
						if( ap <= 7.207 )
							if( d_tci <= -85.8221 )
								ret := 0.750000 // buy
							if( d_tci > -85.8221 )
								ret := 0.000000
						if( ap > 7.207 )
							if( esa <= 7.30502 )
								if( ap <= 7.31167 )
									ret := 0.000000
								if( ap > 7.31167 )
									ret := -1.000000 // sell
							if( esa > 7.30502 )
								if( esa <= 7.44145 )
									ret := 0.833333 // buy
								if( esa > 7.44145 )
									ret := -0.400000
					if( ap > 7.68391 )
						if( wt2 <= 87.2779 )
							if( d <= 0.105406 )
								ret := 0.000000
							if( d > 0.105406 )
								if( wt2 <= 85.4374 )
									ret := 0.958333 // buy
								if( wt2 > 85.4374 )
									ret := 0.687500
						if( wt2 > 87.2779 )
							if( ci <= 77.7808 )
								ret := 0.500000
							if( ci > 77.7808 )
								ret := -1.000000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator Wave_Trend_Calculation 
//@version=5
//indicator "WaveTrend [LazyBear]", shorttitle="WT_LB", overlay=false)

n1 = input.int(10, title="Channel Length")
n2 = input.int(21, title="Average Length")
obLevel1 = input.float(60, title="Over Bought Level 1")
obLevel2 = input.float(53, title="Over Bought Level 2")
osLevel1 = input.float(-60, title="Over Sold Level 1")
osLevel2 = input.float(-53, title="Over Sold Level 2")

ap = hlc3
esa = ta.ema(ap, n1)
d = ta.ema(math.abs(ap - esa), n1)
ci = (ap - esa) / (0.015 * d)
tci = ta.ema(ci, n2)

wt1 = tci
wt2 = ta.sma(wt1, 4)

d_tci = d-tci
ci_wt2 = ci - wt2

plot(0, color=color.gray)
plot(obLevel1, color=color.red)
plot(osLevel1, color=color.green)
plot(obLevel2, color=color.red, linewidth=2, style=plot.style_line, title="OB Level 2 (Dashed)", color=color.red)
plot(osLevel2, color=color.green, linewidth=2, style=plot.style_line, title="OS Level 2 (Dashed)", color=color.green)

plot(wt1, color=color.green, title="WT1")
plot(wt2, color=color.red, title="WT2", style=plot.style_line, linewidth=1)
plot(wt1 - wt2, color=color.new(color.blue, 80), title="WT1-WT2", style=plot.style_area)

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
float op_operation = decision_tree_0_DOTUSDT_15Min_ecd33707(d, esa, d_tci, ci_wt2, wt2, ci, ap, tci)

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


