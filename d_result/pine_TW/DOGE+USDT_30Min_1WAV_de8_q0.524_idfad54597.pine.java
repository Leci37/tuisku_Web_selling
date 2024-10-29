//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: Wave_Trend_Calculation
// ID_model: DOGEUSDT_30Min_1WAV_fad54597 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_DOGEUSDT_30Min_1WAV_fad54597", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_DOGEUSDT_30Min_fad54597(d, esa, d_tci, ci_wt2, wt2, ci, ap, tci)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ci_wt2 <= -35.8288 )
		if( d <= 0.001456 )
			if( esa <= 0.058206 )
				if( d <= 1.5e-05 )
					if( ap <= 0.004026 )
						if( ap <= 0.003582 )
							if( ci_wt2 <= -36.3949 )
								if( ci <= -154.297 )
									ret := 0.166667
								if( ci > -154.297 )
									ret := 0.032297
							if( ci_wt2 > -36.3949 )
								ret := 0.500000
						if( ap > 0.003582 )
							ret := -0.500000
					if( ap > 0.004026 )
						if( d <= 1.1e-05 )
							ret := 1.000000 // buy
						if( d > 1.1e-05 )
							if( d_tci <= -17.5324 )
								ret := 0.750000 // buy
							if( d_tci > -17.5324 )
								ret := -0.200000
				if( d > 1.5e-05 )
					if( d <= 0.000578 )
						if( ci <= -58.9105 )
							if( ci <= -159.769 )
								if( d_tci <= 31.0178 )
									ret := 0.365854
								if( d_tci > 31.0178 )
									ret := 0.875000 // buy
							if( ci > -159.769 )
								if( wt2 <= -31.1764 )
									ret := 0.287097
								if( wt2 > -31.1764 )
									ret := 0.105263
						if( ci > -58.9105 )
							if( wt2 <= 75.492 )
								if( d_tci <= -44.0057 )
									ret := 0.604651
								if( d_tci > -44.0057 )
									ret := 0.339286
							if( wt2 > 75.492 )
								if( ci_wt2 <= -77.5855 )
									ret := 0.500000
								if( ci_wt2 > -77.5855 )
									ret := -0.650000
					if( d > 0.000578 )
						if( esa <= 0.055278 )
							if( d <= 0.000733 )
								if( ci <= 5.31903 )
									ret := 0.730337 // buy
								if( ci > 5.31903 )
									ret := -0.250000
							if( d > 0.000733 )
								if( d <= 0.00076 )
									ret := -0.250000
								if( d > 0.00076 )
									ret := 0.511811
						if( esa > 0.055278 )
							if( ci <= -94.9648 )
								if( tci <= -14.8728 )
									ret := 0.812500 // buy
								if( tci > -14.8728 )
									ret := 0.000000
							if( ci > -94.9648 )
								if( esa <= 0.05585 )
									ret := -0.538462
								if( esa > 0.05585 )
									ret := 0.187500
			if( esa > 0.058206 )
				if( d <= 0.000707 )
					if( ap <= 0.086196 )
						if( d <= 0.000516 )
							if( ci <= -88.9701 )
								if( ci_wt2 <= -127.742 )
									ret := 0.064841
								if( ci_wt2 > -127.742 )
									ret := -0.080270
							if( ci > -88.9701 )
								if( d <= 0.000205 )
									ret := 0.009315
								if( d > 0.000205 )
									ret := 0.081527
						if( d > 0.000516 )
							if( tci <= 55.7119 )
								if( ci_wt2 <= -96.8197 )
									ret := 0.045802
								if( ci_wt2 > -96.8197 )
									ret := 0.250485
							if( tci > 55.7119 )
								if( wt2 <= 65.3928 )
									ret := -0.791667 // sell
								if( wt2 > 65.3928 )
									ret := 0.040000
					if( ap > 0.086196 )
						if( ci <= -96.4016 )
							if( tci <= -36.1228 )
								if( ap <= 0.145956 )
									ret := 0.056511
								if( ap > 0.145956 )
									ret := -0.363636
							if( tci > -36.1228 )
								if( wt2 <= 15.7934 )
									ret := -0.123021
								if( wt2 > 15.7934 )
									ret := -0.297735
						if( ci > -96.4016 )
							if( tci <= -2.63801 )
								if( wt2 <= -5.05887 )
									ret := 0.009815
								if( wt2 > -5.05887 )
									ret := -0.182957
							if( tci > -2.63801 )
								if( ci_wt2 <= -111.412 )
									ret := -0.212121
								if( ci_wt2 > -111.412 )
									ret := 0.046619
				if( d > 0.000707 )
					if( ap <= 0.130949 )
						if( tci <= 31.5582 )
							if( ci <= -36.9031 )
								if( ci_wt2 <= -188.548 )
									ret := 0.735294 // buy
								if( ci_wt2 > -188.548 )
									ret := 0.222946
							if( ci > -36.9031 )
								if( ap <= 0.118914 )
									ret := 0.737705 // buy
								if( ap > 0.118914 )
									ret := 0.133333
						if( tci > 31.5582 )
							if( tci <= 31.6609 )
								ret := -1.000000 // sell
							if( tci > 31.6609 )
								if( ci_wt2 <= -39.8271 )
									ret := 0.032338
								if( ci_wt2 > -39.8271 )
									ret := 0.433333
					if( ap > 0.130949 )
						if( ci <= -49.0558 )
							if( d_tci <= 28.6281 )
								if( d <= 0.00096 )
									ret := 0.015848
								if( d > 0.00096 )
									ret := 0.171011
							if( d_tci > 28.6281 )
								if( ci_wt2 <= -123.864 )
									ret := -0.316456
								if( ci_wt2 > -123.864 )
									ret := 0.011480
						if( ci > -49.0558 )
							if( ci <= 21.9417 )
								if( ci_wt2 <= -50.6605 )
									ret := -0.225653
								if( ci_wt2 > -50.6605 )
									ret := 0.015974
							if( ci > 21.9417 )
								if( tci <= 65.8837 )
									ret := 1.000000 // buy
								if( tci > 65.8837 )
									ret := 0.250000
		if( d > 0.001456 )
			if( ap <= 0.239231 )
				if( wt2 <= -60.4542 )
					if( ci_wt2 <= -68.5118 )
						if( d_tci <= 77.3007 )
							if( d <= 0.00477 )
								if( d <= 0.00198 )
									ret := 0.400000
								if( d > 0.00198 )
									ret := -0.428571
							if( d > 0.00477 )
								ret := 1.000000 // buy
						if( d_tci > 77.3007 )
							if( ci_wt2 <= -94.4047 )
								ret := 1.000000 // buy
							if( ci_wt2 > -94.4047 )
								if( ap <= 0.107496 )
									ret := 1.000000 // buy
								if( ap > 0.107496 )
									ret := 0.500000
					if( ci_wt2 > -68.5118 )
						if( d <= 0.001771 )
							if( d <= 0.001527 )
								ret := 1.000000 // buy
							if( d > 0.001527 )
								if( ci <= -110.422 )
									ret := 0.111111
								if( ci > -110.422 )
									ret := 0.875000 // buy
						if( d > 0.001771 )
							if( d_tci <= 74.7038 )
								if( esa <= 0.162149 )
									ret := 0.826923 // buy
								if( esa > 0.162149 )
									ret := 0.967213 // buy
							if( d_tci > 74.7038 )
								if( wt2 <= -68.1467 )
									ret := 0.892857 // buy
								if( wt2 > -68.1467 )
									ret := 0.200000
				if( wt2 > -60.4542 )
					if( ci <= -2.64574 )
						if( ci_wt2 <= -114.327 )
							if( ci <= -57.4929 )
								if( ap <= 0.145035 )
									ret := 0.708333 // buy
								if( ap > 0.145035 )
									ret := 0.435583
							if( ci > -57.4929 )
								if( d <= 0.007785 )
									ret := -1.000000 // sell
								if( d > 0.007785 )
									ret := 0.000000
						if( ci_wt2 > -114.327 )
							if( ci <= -140.49 )
								if( esa <= 0.136349 )
									ret := -0.714286 // sell
								if( esa > 0.136349 )
									ret := 0.103448
							if( ci > -140.49 )
								if( ap <= 0.136602 )
									ret := 0.427128
								if( ap > 0.136602 )
									ret := 0.282882
					if( ci > -2.64574 )
						if( ci_wt2 <= -63.6582 )
							if( ap <= 0.133057 )
								ret := -1.000000 // sell
							if( ap > 0.133057 )
								if( wt2 <= 76.1394 )
									ret := -0.517241
								if( wt2 > 76.1394 )
									ret := 1.000000 // buy
						if( ci_wt2 > -63.6582 )
							if( ci <= 30.4928 )
								if( d_tci <= -74.4221 )
									ret := 0.961538 // buy
								if( d_tci > -74.4221 )
									ret := 0.119835
							if( ci > 30.4928 )
								if( ci_wt2 <= -41.2704 )
									ret := -0.611111
								if( ci_wt2 > -41.2704 )
									ret := 0.205128
			if( ap > 0.239231 )
				if( d <= 0.012661 )
					if( esa <= 0.341345 )
						if( d <= 0.002799 )
							if( tci <= 31.289 )
								if( d_tci <= -21.0649 )
									ret := 0.476923
								if( d_tci > -21.0649 )
									ret := 0.051429
							if( tci > 31.289 )
								if( tci <= 32.1976 )
									ret := -1.000000 // sell
								if( tci > 32.1976 )
									ret := -0.117117
						if( d > 0.002799 )
							if( d_tci <= -44.7285 )
								if( d_tci <= -49.4165 )
									ret := 0.170455
								if( d_tci > -49.4165 )
									ret := -0.571429
							if( d_tci > -44.7285 )
								if( d_tci <= -0.448348 )
									ret := 0.516279
								if( d_tci > -0.448348 )
									ret := 0.227882
					if( esa > 0.341345 )
						if( ci_wt2 <= -41.9164 )
							if( d <= 0.004389 )
								if( wt2 <= 24.2289 )
									ret := -0.523810
								if( wt2 > 24.2289 )
									ret := -0.035088
							if( d > 0.004389 )
								if( wt2 <= 24.0242 )
									ret := -0.057269
								if( wt2 > 24.0242 )
									ret := 0.336735
						if( ci_wt2 > -41.9164 )
							if( ci_wt2 <= -38.6236 )
								if( wt2 <= -27.1409 )
									ret := 0.500000
								if( wt2 > -27.1409 )
									ret := 0.869565 // buy
							if( ci_wt2 > -38.6236 )
								if( d_tci <= 45.31 )
									ret := -0.347826
								if( d_tci > 45.31 )
									ret := 1.000000 // buy
				if( d > 0.012661 )
					if( ci <= 26.8779 )
						if( tci <= -70.3203 )
							if( d_tci <= 74.7449 )
								ret := -1.000000 // sell
							if( d_tci > 74.7449 )
								ret := 1.000000 // buy
						if( tci > -70.3203 )
							if( d <= 0.015479 )
								if( d <= 0.013836 )
									ret := 0.960000 // buy
								if( d > 0.013836 )
									ret := 0.250000
							if( d > 0.015479 )
								if( ap <= 0.64285 )
									ret := 0.936508 // buy
								if( ap > 0.64285 )
									ret := 0.500000
					if( ci > 26.8779 )
						ret := -1.000000 // sell
	if( ci_wt2 > -35.8288 )
		if( ap <= 0.310535 )
			if( ci_wt2 <= 51.444 )
				if( d_tci <= 68.6326 )
					if( esa <= 0.058374 )
						if( ci <= -17.3019 )
							if( ci <= -30.7079 )
								if( d <= 0.001063 )
									ret := 0.037383
								if( d > 0.001063 )
									ret := 0.388889
							if( ci > -30.7079 )
								if( ci <= -24.6598 )
									ret := -0.373333
								if( ci > -24.6598 )
									ret := -0.108108
						if( ci > -17.3019 )
							if( esa <= 0.013159 )
								if( tci <= 80.0779 )
									ret := 0.037904
								if( tci > 80.0779 )
									ret := 0.480769
							if( esa > 0.013159 )
								if( d_tci <= 32.7538 )
									ret := 0.234568
								if( d_tci > 32.7538 )
									ret := 0.752809 // buy
					if( esa > 0.058374 )
						if( d_tci <= -78.5953 )
							if( esa <= 0.209679 )
								if( ci <= 98.1837 )
									ret := -0.393939
								if( ci > 98.1837 )
									ret := 0.225806
							if( esa > 0.209679 )
								if( esa <= 0.216694 )
									ret := -0.733333 // sell
								if( esa > 0.216694 )
									ret := -0.944444 // sell
						if( d_tci > -78.5953 )
							if( d <= 0.000333 )
								if( ci <= -18.4053 )
									ret := -0.090952
								if( ci > -18.4053 )
									ret := 0.019825
							if( d > 0.000333 )
								if( ci_wt2 <= 47.6719 )
									ret := 0.045444
								if( ci_wt2 > 47.6719 )
									ret := 0.188967
				if( d_tci > 68.6326 )
					if( d <= 0.00164 )
						if( ci <= -32.7781 )
							if( ci_wt2 <= 30.5111 )
								if( d <= 0.000601 )
									ret := -0.119718
								if( d > 0.000601 )
									ret := 0.154110
							if( ci_wt2 > 30.5111 )
								if( ci_wt2 <= 35.3378 )
									ret := -0.629630
								if( ci_wt2 > 35.3378 )
									ret := -0.241379
						if( ci > -32.7781 )
							if( esa <= 0.057963 )
								ret := -0.500000
							if( esa > 0.057963 )
								if( ci <= -25.5206 )
									ret := 0.842105 // buy
								if( ci > -25.5206 )
									ret := 0.000000
					if( d > 0.00164 )
						if( ci <= -87.1393 )
							if( ci_wt2 <= -30.0086 )
								if( d <= 0.002599 )
									ret := 0.736842 // buy
								if( d > 0.002599 )
									ret := 1.000000 // buy
							if( ci_wt2 > -30.0086 )
								if( ap <= 0.26876 )
									ret := 0.621053
								if( ap > 0.26876 )
									ret := -0.750000 // sell
						if( ci > -87.1393 )
							if( esa <= 0.204232 )
								if( ci_wt2 <= -11.6501 )
									ret := -0.333333
								if( ci_wt2 > -11.6501 )
									ret := 0.405145
							if( esa > 0.204232 )
								if( wt2 <= -72.0138 )
									ret := -0.151515
								if( wt2 > -72.0138 )
									ret := 0.666667
			if( ci_wt2 > 51.444 )
				if( esa <= 0.16908 )
					if( tci <= 77.1368 )
						if( ci_wt2 <= 117.438 )
							if( wt2 <= 3.20233 )
								if( ci_wt2 <= 111.185 )
									ret := -0.014035
								if( ci_wt2 > 111.185 )
									ret := 0.180723
							if( wt2 > 3.20233 )
								if( wt2 <= 13.4826 )
									ret := 0.191011
								if( wt2 > 13.4826 )
									ret := 0.017381
						if( ci_wt2 > 117.438 )
							if( ap <= 0.062413 )
								if( wt2 <= -32.6486 )
									ret := 0.058824
								if( wt2 > -32.6486 )
									ret := -0.279483
							if( ap > 0.062413 )
								if( tci <= -6.33229 )
									ret := -0.135570
								if( tci > -6.33229 )
									ret := 0.072727
					if( tci > 77.1368 )
						if( d <= 0.001037 )
							if( tci <= 83.0493 )
								if( wt2 <= 71.1955 )
									ret := -0.722222 // sell
								if( wt2 > 71.1955 )
									ret := 1.000000 // buy
							if( tci > 83.0493 )
								if( tci <= 88.4539 )
									ret := 1.000000 // buy
								if( tci > 88.4539 )
									ret := 0.500000
						if( d > 0.001037 )
							if( ci <= 130.258 )
								ret := 0.500000
							if( ci > 130.258 )
								if( wt2 <= 78.843 )
									ret := -0.796610 // sell
								if( wt2 > 78.843 )
									ret := 0.250000
				if( esa > 0.16908 )
					if( ci <= 40.9999 )
						if( wt2 <= -78.2617 )
							if( ci <= -23.3604 )
								ret := 0.500000
							if( ci > -23.3604 )
								ret := -1.000000 // sell
						if( wt2 > -78.2617 )
							if( d_tci <= 35.9598 )
								if( wt2 <= -25.2485 )
									ret := -0.120253
								if( wt2 > -25.2485 )
									ret := 0.510204
							if( d_tci > 35.9598 )
								if( d <= 0.001332 )
									ret := -0.038961
								if( d > 0.001332 )
									ret := 0.460526
					if( ci > 40.9999 )
						if( wt2 <= 35.3831 )
							if( d <= 0.0008 )
								if( ci <= 120.236 )
									ret := -0.035806
								if( ci > 120.236 )
									ret := 0.294118
							if( d > 0.0008 )
								if( d <= 0.006641 )
									ret := -0.206701
								if( d > 0.006641 )
									ret := 0.149425
						if( wt2 > 35.3831 )
							if( ci_wt2 <= 100.157 )
								if( wt2 <= 45.6252 )
									ret := -0.215686
								if( wt2 > 45.6252 )
									ret := 0.150754
							if( ci_wt2 > 100.157 )
								if( ci <= 160.576 )
									ret := 0.786885 // buy
								if( ci > 160.576 )
									ret := -0.068182
		if( ap > 0.310535 )
			if( tci <= 73.6927 )
				if( wt2 <= 46.9596 )
					if( ci <= -72.8643 )
						if( d <= 0.01385 )
							if( ci <= -91.3004 )
								ret := -0.666667
							if( ci > -91.3004 )
								if( esa <= 0.376541 )
									ret := 0.523810
								if( esa > 0.376541 )
									ret := 0.900000 // buy
						if( d > 0.01385 )
							if( ci <= -105.792 )
								ret := 1.000000 // buy
							if( ci > -105.792 )
								if( ci <= -89.0067 )
									ret := -0.200000
								if( ci > -89.0067 )
									ret := -1.000000 // sell
					if( ci > -72.8643 )
						if( esa <= 0.489878 )
							if( ci <= 105.812 )
								if( ci_wt2 <= 123.404 )
									ret := -0.124378
								if( ci_wt2 > 123.404 )
									ret := -0.615385
							if( ci > 105.812 )
								if( d <= 0.012808 )
									ret := -0.350877
								if( d > 0.012808 )
									ret := -1.000000 // sell
						if( esa > 0.489878 )
							if( d_tci <= -45.9022 )
								if( esa <= 0.548569 )
									ret := 1.000000 // buy
								if( esa > 0.548569 )
									ret := 0.000000
							if( d_tci > -45.9022 )
								if( ci <= 146.017 )
									ret := -0.427586
								if( ci > 146.017 )
									ret := 0.428571
				if( wt2 > 46.9596 )
					if( ci <= 119.35 )
						if( ci_wt2 <= 17.4468 )
							if( ci <= 46.6437 )
								if( wt2 <= 55.0109 )
									ret := 0.393939
								if( wt2 > 55.0109 )
									ret := -0.372093
							if( ci > 46.6437 )
								if( ap <= 0.347005 )
									ret := 0.276596
								if( ap > 0.347005 )
									ret := 0.676471
						if( ci_wt2 > 17.4468 )
							if( d_tci <= -52.1809 )
								if( d_tci <= -65.6579 )
									ret := 0.250000
								if( d_tci > -65.6579 )
									ret := -0.478261
							if( d_tci > -52.1809 )
								if( ci_wt2 <= 21.7058 )
									ret := 1.000000 // buy
								if( ci_wt2 > 21.7058 )
									ret := 0.000000
					if( ci > 119.35 )
						if( ci <= 129.547 )
							if( ap <= 0.606238 )
								ret := 1.000000 // buy
							if( ap > 0.606238 )
								ret := 0.750000 // buy
						if( ci > 129.547 )
							if( d_tci <= -66.1736 )
								if( wt2 <= 58.1625 )
									ret := -0.800000 // sell
								if( wt2 > 58.1625 )
									ret := 0.500000
							if( d_tci > -66.1736 )
								ret := 1.000000 // buy
			if( tci > 73.6927 )
				if( wt2 <= 72.2697 )
					if( wt2 <= 70.9104 )
						ret := -0.666667
					if( wt2 > 70.9104 )
						ret := 1.000000 // buy
				if( wt2 > 72.2697 )
					if( ci <= 72.765 )
						if( ci_wt2 <= -7.88302 )
							if( d <= 0.010733 )
								ret := -0.750000 // sell
							if( d > 0.010733 )
								ret := -1.000000 // sell
						if( ci_wt2 > -7.88302 )
							ret := -0.500000
					if( ci > 72.765 )
						ret := -1.000000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_DOGEUSDT_30Min_fad54597(d, esa, d_tci, ci_wt2, wt2, ci, ap, tci)

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


