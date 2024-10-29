//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Vortex_Indicator
// ID_model: UPST_1Min_2SV0_aecc186e Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_UPST_1Min_2SV0_aecc186e", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_UPST_1Min_aecc186e(rsi1, d, k, smoothD_d, d_k, smoothK_k, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( rsi1 <= 54.9092 )
		if( VIP_VIM <= 0.073255 )
			if( rsi1 <= 46.4784 )
				if( VIM <= 1.60074 )
					if( VIP <= 0.978938 )
						if( d <= 98.6266 )
							if( k <= 13.7122 )
								if( d_k <= 0.439542 )
									ret := -0.102782
								if( d_k > 0.439542 )
									ret := 0.008234
							if( k > 13.7122 )
								if( VIM <= 1.43519 )
									ret := 0.006927
								if( VIM > 1.43519 )
									ret := 0.261236
						if( d > 98.6266 )
							if( VIP <= 0.877102 )
								if( VIP_VIM <= -0.323216 )
									ret := -0.750000 // sell
								if( VIP_VIM > -0.323216 )
									ret := -1.000000 // sell
							if( VIP > 0.877102 )
								if( VIP_VIM <= -0.218519 )
									ret := 0.384615
								if( VIP_VIM > -0.218519 )
									ret := -0.840000 // sell
					if( VIP > 0.978938 )
						if( VIM <= 1.30774 )
							if( d_k <= -19.8219 )
								if( smoothK_k <= 66.9124 )
									ret := 0.808511 // buy
								if( smoothK_k > 66.9124 )
									ret := -0.142857
							if( d_k > -19.8219 )
								if( VIP <= 0.980665 )
									ret := 0.434343
								if( VIP > 0.980665 )
									ret := 0.074404
						if( VIM > 1.30774 )
							if( d <= 43.2418 )
								if( d_k <= 9.89815 )
									ret := 0.257851
								if( d_k > 9.89815 )
									ret := -0.121429
							if( d > 43.2418 )
								if( k <= 36.619 )
									ret := -0.157895
								if( k > 36.619 )
									ret := 0.459384
				if( VIM > 1.60074 )
					if( d_k <= 7.39641 )
						if( smoothD_d <= 33.223 )
							if( VIP <= 8.26267 )
								if( d <= 21.0264 )
									ret := 0.109153
								if( d > 21.0264 )
									ret := -0.102253
							if( VIP > 8.26267 )
								if( smoothK_k <= 4.91614 )
									ret := 0.552941
								if( smoothK_k > 4.91614 )
									ret := 0.245763
						if( smoothD_d > 33.223 )
							if( d <= 37.0724 )
								if( rsi1 <= 40.8866 )
									ret := 0.813953 // buy
								if( rsi1 > 40.8866 )
									ret := 0.428571
							if( d > 37.0724 )
								if( rsi1 <= 39.7245 )
									ret := 0.421277
								if( rsi1 > 39.7245 )
									ret := 0.065350
					if( d_k > 7.39641 )
						if( k <= 65.3572 )
							if( smoothD_d <= 11.3582 )
								if( smoothD_d <= 7.30487 )
									ret := 0.840909 // buy
								if( smoothD_d > 7.30487 )
									ret := 0.642857
							if( smoothD_d > 11.3582 )
								if( VIM <= 3.09786 )
									ret := 0.108815
								if( VIM > 3.09786 )
									ret := 0.326829
						if( k > 65.3572 )
							if( rsi1 <= 37.9103 )
								ret := 0.277778
							if( rsi1 > 37.9103 )
								if( rsi1 <= 43.5716 )
									ret := 0.925373 // buy
								if( rsi1 > 43.5716 )
									ret := 0.653846
			if( rsi1 > 46.4784 )
				if( k <= 10.1304 )
					if( d_k <= 13.4368 )
						if( smoothK_k <= 6.70565 )
							if( VIP_VIM <= 0.020085 )
								if( smoothK_k <= -2.98372 )
									ret := 0.068627
								if( smoothK_k > -2.98372 )
									ret := -0.228669
							if( VIP_VIM > 0.020085 )
								if( k <= 9.20138 )
									ret := 0.112245
								if( k > 9.20138 )
									ret := 0.500000
						if( smoothK_k > 6.70565 )
							if( d <= 5.7537 )
								if( smoothD_d <= 2.18644 )
									ret := -0.888889 // sell
								if( smoothD_d > 2.18644 )
									ret := -1.000000 // sell
							if( d > 5.7537 )
								if( d <= 10.9439 )
									ret := -0.058824
								if( d > 10.9439 )
									ret := -0.583333
					if( d_k > 13.4368 )
						if( d <= 26.2629 )
							if( d_k <= 14.8586 )
								if( smoothD_d <= 12.7125 )
									ret := -0.842105 // sell
								if( smoothD_d > 12.7125 )
									ret := -0.600000
							if( d_k > 14.8586 )
								if( VIM <= 0.979391 )
									ret := 0.571429
								if( VIM > 0.979391 )
									ret := -0.222222
						if( d > 26.2629 )
							if( VIP <= 1.04602 )
								if( VIP_VIM <= -0.001769 )
									ret := -0.576923
								if( VIP_VIM > -0.001769 )
									ret := -0.920000 // sell
							if( VIP > 1.04602 )
								ret := 0.411765
				if( k > 10.1304 )
					if( d_k <= -14.3554 )
						if( VIM <= 0.949014 )
							ret := 0.571429
						if( VIM > 0.949014 )
							if( k <= 73.3608 )
								if( rsi1 <= 46.8465 )
									ret := 0.333333
								if( rsi1 > 46.8465 )
									ret := -0.255524
							if( k > 73.3608 )
								if( rsi1 <= 51.9098 )
									ret := 0.159919
								if( rsi1 > 51.9098 )
									ret := -0.274419
					if( d_k > -14.3554 )
						if( smoothD_d <= 72.4219 )
							if( VIM <= 1.0351 )
								if( smoothK_k <= 14.018 )
									ret := -0.098361
								if( smoothK_k > 14.018 )
									ret := 0.182356
							if( VIM > 1.0351 )
								if( k <= 14.3198 )
									ret := 0.188854
								if( k > 14.3198 )
									ret := -0.038444
						if( smoothD_d > 72.4219 )
							if( VIM <= 1.94841 )
								if( VIP <= 1.05567 )
									ret := -0.155934
								if( VIP > 1.05567 )
									ret := 0.063098
							if( VIM > 1.94841 )
								if( smoothK_k <= 83.9271 )
									ret := 0.351562
								if( smoothK_k > 83.9271 )
									ret := -0.034247
		if( VIP_VIM > 0.073255 )
			if( d_k <= 0.296997 )
				if( rsi1 <= 54.6712 )
					if( VIP <= 1.00343 )
						ret := -0.944444 // sell
					if( VIP > 1.00343 )
						if( rsi1 <= 36.4532 )
							if( smoothK_k <= -1.84554 )
								ret := 0.666667
							if( smoothK_k > -1.84554 )
								if( VIP_VIM <= 0.70062 )
									ret := 0.144928
								if( VIP_VIM > 0.70062 )
									ret := 0.525000
						if( rsi1 > 36.4532 )
							if( smoothD_d <= 93.3918 )
								if( d <= 50.089 )
									ret := -0.072497
								if( d > 50.089 )
									ret := 0.070356
							if( smoothD_d > 93.3918 )
								if( d <= 97.6288 )
									ret := -0.925926 // sell
								if( d > 97.6288 )
									ret := 0.000000
				if( rsi1 > 54.6712 )
					if( k <= 56.0658 )
						if( VIM <= 0.94555 )
							ret := -0.647059
						if( VIM > 0.94555 )
							if( rsi1 <= 54.8703 )
								if( VIM <= 1.07803 )
									ret := 0.625000
								if( VIM > 1.07803 )
									ret := -0.115385
							if( rsi1 > 54.8703 )
								ret := 0.857143 // buy
					if( k > 56.0658 )
						if( VIP <= 1.07955 )
							if( smoothD_d <= 73.7258 )
								ret := 1.000000 // buy
							if( smoothD_d > 73.7258 )
								ret := 0.600000
						if( VIP > 1.07955 )
							if( rsi1 <= 54.7496 )
								ret := 0.444444
							if( rsi1 > 54.7496 )
								if( rsi1 <= 54.8135 )
									ret := -0.272727
								if( rsi1 > 54.8135 )
									ret := 0.428571
			if( d_k > 0.296997 )
				if( VIM <= 0.923931 )
					if( smoothD_d <= 84.3413 )
						if( smoothD_d <= 83.3609 )
							if( VIM <= 0.90228 )
								if( smoothD_d <= 23.9774 )
									ret := 0.156250
								if( smoothD_d > 23.9774 )
									ret := 0.547872
							if( VIM > 0.90228 )
								if( VIM <= 0.919491 )
									ret := 0.039773
								if( VIM > 0.919491 )
									ret := 0.500000
						if( smoothD_d > 83.3609 )
							ret := -0.800000 // sell
					if( smoothD_d > 84.3413 )
						if( VIM <= 0.859755 )
							ret := 0.111111
						if( VIM > 0.859755 )
							if( d_k <= 3.08451 )
								if( rsi1 <= 53.1035 )
									ret := 0.937500 // buy
								if( rsi1 > 53.1035 )
									ret := 0.900000 // buy
							if( d_k > 3.08451 )
								if( d <= 89.8553 )
									ret := 0.793103 // buy
								if( d > 89.8553 )
									ret := 0.488889
				if( VIM > 0.923931 )
					if( VIP_VIM <= 2.00761 )
						if( rsi1 <= 49.2226 )
							if( d_k <= 19.2652 )
								if( rsi1 <= 27.6008 )
									ret := -0.222222
								if( rsi1 > 27.6008 )
									ret := 0.323358
							if( d_k > 19.2652 )
								if( rsi1 <= 33.8152 )
									ret := -1.000000 // sell
								if( rsi1 > 33.8152 )
									ret := 0.111650
						if( rsi1 > 49.2226 )
							if( smoothK_k <= 30.8678 )
								if( smoothK_k <= 4.94509 )
									ret := 0.167832
								if( smoothK_k > 4.94509 )
									ret := -0.152893
							if( smoothK_k > 30.8678 )
								if( d_k <= 16.8784 )
									ret := 0.181208
								if( d_k > 16.8784 )
									ret := -0.048128
					if( VIP_VIM > 2.00761 )
						if( d_k <= 5.17793 )
							ret := 0.500000
						if( d_k > 5.17793 )
							if( d_k <= 10.8146 )
								ret := -1.000000 // sell
							if( d_k > 10.8146 )
								ret := 0.000000
	if( rsi1 > 54.9092 )
		if( VIP <= 1.45274 )
			if( VIP_VIM <= 0.508954 )
				if( VIM <= 1.00467 )
					if( rsi1 <= 77.1174 )
						if( k <= 0.421397 )
							if( d_k <= 0.350862 )
								ret := -0.375000
							if( d_k > 0.350862 )
								if( VIP <= 1.10032 )
									ret := 0.852941 // buy
								if( VIP > 1.10032 )
									ret := 0.365591
						if( k > 0.421397 )
							if( smoothK_k <= 0.123523 )
								if( rsi1 <= 62.0504 )
									ret := -0.480176
								if( rsi1 > 62.0504 )
									ret := 0.158730
							if( smoothK_k > 0.123523 )
								if( d <= 2.93043 )
									ret := 0.909091 // buy
								if( d > 2.93043 )
									ret := -0.003571
					if( rsi1 > 77.1174 )
						if( VIM <= 0.816674 )
							if( VIM <= 0.764274 )
								if( rsi1 <= 80.2553 )
									ret := -0.272727
								if( rsi1 > 80.2553 )
									ret := -0.804348 // sell
							if( VIM > 0.764274 )
								if( VIP <= 1.28457 )
									ret := -0.041667
								if( VIP > 1.28457 )
									ret := 0.500000
						if( VIM > 0.816674 )
							if( VIP_VIM <= 0.466005 )
								if( VIM <= 0.82531 )
									ret := -1.000000 // sell
								if( VIM > 0.82531 )
									ret := -0.730769 // sell
							if( VIP_VIM > 0.466005 )
								ret := -0.222222
				if( VIM > 1.00467 )
					if( k <= 41.8442 )
						if( smoothD_d <= 45.8247 )
							if( smoothK_k <= 35.0963 )
								if( VIP_VIM <= 0.2409 )
									ret := -0.259016
								if( VIP_VIM > 0.2409 )
									ret := 0.428571
							if( smoothK_k > 35.0963 )
								if( rsi1 <= 58.3219 )
									ret := 0.222222
								if( rsi1 > 58.3219 )
									ret := 0.888889 // buy
						if( smoothD_d > 45.8247 )
							if( VIP_VIM <= 0.074559 )
								ret := -0.500000
							if( VIP_VIM > 0.074559 )
								if( rsi1 <= 58.1819 )
									ret := 1.000000 // buy
								if( rsi1 > 58.1819 )
									ret := 0.500000
					if( k > 41.8442 )
						if( rsi1 <= 61.8194 )
							if( k <= 98.2439 )
								if( smoothD_d <= 40.6989 )
									ret := 0.042254
								if( smoothD_d > 40.6989 )
									ret := -0.272272
							if( k > 98.2439 )
								if( VIM <= 1.14482 )
									ret := 0.000000
								if( VIM > 1.14482 )
									ret := 0.892857 // buy
						if( rsi1 > 61.8194 )
							if( smoothD_d <= 83.7805 )
								if( k <= 82.4575 )
									ret := -0.570175
								if( k > 82.4575 )
									ret := -0.020408
							if( smoothD_d > 83.7805 )
								if( d_k <= 6.14355 )
									ret := -0.740000 // sell
								if( d_k > 6.14355 )
									ret := 0.333333
			if( VIP_VIM > 0.508954 )
				if( d <= 79.8178 )
					if( smoothK_k <= 66.4043 )
						if( d_k <= -6.30192 )
							if( smoothK_k <= 62.1697 )
								if( smoothD_d <= 42.3395 )
									ret := 0.106383
								if( smoothD_d > 42.3395 )
									ret := 0.625000
							if( smoothK_k > 62.1697 )
								if( VIP <= 1.30506 )
									ret := 0.333333
								if( VIP > 1.30506 )
									ret := 0.909091 // buy
						if( d_k > -6.30192 )
							if( smoothD_d <= 10.9971 )
								if( smoothK_k <= -0.949825 )
									ret := 0.900000 // buy
								if( smoothK_k > -0.949825 )
									ret := 0.533333
							if( smoothD_d > 10.9971 )
								if( d_k <= -2.40372 )
									ret := -0.550000
								if( d_k > -2.40372 )
									ret := 0.048673
					if( smoothK_k > 66.4043 )
						if( smoothD_d <= 67.356 )
							if( smoothD_d <= 59.4989 )
								if( d <= 58.0483 )
									ret := -0.439024
								if( d > 58.0483 )
									ret := 0.378378
							if( smoothD_d > 59.4989 )
								if( VIP <= 1.36892 )
									ret := -0.658537
								if( VIP > 1.36892 )
									ret := -0.222222
						if( smoothD_d > 67.356 )
							if( smoothD_d <= 68.9733 )
								if( d <= 70.6081 )
									ret := 0.916667 // buy
								if( d > 70.6081 )
									ret := 0.270270
							if( smoothD_d > 68.9733 )
								if( VIM <= 0.837664 )
									ret := -0.253731
								if( VIM > 0.837664 )
									ret := 0.296296
				if( d > 79.8178 )
					if( smoothK_k <= 58.2579 )
						ret := -0.916667 // sell
					if( smoothK_k > 58.2579 )
						if( smoothD_d <= 79.2562 )
							if( smoothK_k <= 82.2872 )
								if( smoothK_k <= 78.8478 )
									ret := 0.398438
								if( smoothK_k > 78.8478 )
									ret := 0.914286 // buy
							if( smoothK_k > 82.2872 )
								if( smoothD_d <= 78.2521 )
									ret := 0.228571
								if( smoothD_d > 78.2521 )
									ret := -0.458333
						if( smoothD_d > 79.2562 )
							if( d <= 97.1115 )
								if( VIP_VIM <= 0.722009 )
									ret := 0.059543
								if( VIP_VIM > 0.722009 )
									ret := 0.215894
							if( d > 97.1115 )
								if( VIP <= 1.41245 )
									ret := -0.050887
								if( VIP > 1.41245 )
									ret := 0.177358
		if( VIP > 1.45274 )
			if( smoothD_d <= 13.9706 )
				if( smoothK_k <= 1.5326 )
					if( d_k <= 2.27425 )
						ret := 0.384615
					if( d_k > 2.27425 )
						ret := -0.062500
				if( smoothK_k > 1.5326 )
					if( d <= 6.66112 )
						ret := 0.125000
					if( d > 6.66112 )
						if( k <= 13.8093 )
							if( d_k <= -2.13388 )
								ret := -0.400000
							if( d_k > -2.13388 )
								if( smoothK_k <= 6.37722 )
									ret := -0.750000 // sell
								if( smoothK_k > 6.37722 )
									ret := -0.984848 // sell
						if( k > 13.8093 )
							if( k <= 27.1632 )
								if( smoothD_d <= 7.83004 )
									ret := 0.218750
								if( smoothD_d > 7.83004 )
									ret := -0.490566
							if( k > 27.1632 )
								if( VIP_VIM <= 0.020928 )
									ret := -0.545455
								if( VIP_VIM > 0.020928 )
									ret := -0.959184 // sell
			if( smoothD_d > 13.9706 )
				if( rsi1 <= 64.2794 )
					if( smoothK_k <= 83.4648 )
						if( smoothD_d <= 84.7864 )
							if( k <= 13.9817 )
								if( smoothD_d <= 16.5374 )
									ret := 0.125000
								if( smoothD_d > 16.5374 )
									ret := 0.740741 // buy
							if( k > 13.9817 )
								if( d_k <= 12.7992 )
									ret := -0.113100
								if( d_k > 12.7992 )
									ret := 0.188679
						if( smoothD_d > 84.7864 )
							if( rsi1 <= 57.4875 )
								if( smoothK_k <= 81.2103 )
									ret := 0.476190
								if( smoothK_k > 81.2103 )
									ret := -0.600000
							if( rsi1 > 57.4875 )
								if( smoothK_k <= 75.203 )
									ret := -0.500000
								if( smoothK_k > 75.203 )
									ret := 0.777778 // buy
					if( smoothK_k > 83.4648 )
						if( smoothD_d <= 96.0911 )
							if( VIP <= 1.52743 )
								if( VIM <= 1.12563 )
									ret := 0.769231 // buy
								if( VIM > 1.12563 )
									ret := 0.142857
							if( VIP > 1.52743 )
								if( VIP <= 3.78366 )
									ret := -0.383333
								if( VIP > 3.78366 )
									ret := -0.160338
						if( smoothD_d > 96.0911 )
							if( smoothD_d <= 96.4942 )
								ret := 0.642857
							if( smoothD_d > 96.4942 )
								ret := 0.533333
				if( rsi1 > 64.2794 )
					if( VIP <= 11.4635 )
						if( d <= 23.3509 )
							if( VIP_VIM <= 0.656172 )
								ret := -0.384615
							if( VIP_VIM > 0.656172 )
								if( d <= 19.6996 )
									ret := 0.300000
								if( d > 19.6996 )
									ret := 1.000000 // buy
						if( d > 23.3509 )
							if( d_k <= 4.12266 )
								if( rsi1 <= 85.4526 )
									ret := -0.114736
								if( rsi1 > 85.4526 )
									ret := -0.353057
							if( d_k > 4.12266 )
								if( smoothD_d <= 29.6951 )
									ret := 0.363636
								if( smoothD_d > 29.6951 )
									ret := -0.377614
					if( VIP > 11.4635 )
						if( smoothK_k <= 96.4781 )
							if( VIM <= 22.1172 )
								if( VIP_VIM <= 1.79191 )
									ret := -0.780702 // sell
								if( VIP_VIM > 1.79191 )
									ret := -0.157895
							if( VIM > 22.1172 )
								if( VIP_VIM <= 1.33766 )
									ret := -0.202247
								if( VIP_VIM > 1.33766 )
									ret := -0.785714 // sell
						if( smoothK_k > 96.4781 )
							ret := -0.058824
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Stochastic_RSI 
//@version=5
//indicator title="Stochastic RSI", shorttitle="Stoch RSI", format=format.price, precision=2, timeframe="", timeframe_gaps=true)
smoothK = input.int(3, "K", minval=1)
smoothD = input.int(3, "D", minval=1)
lengthRSI = input.int(14, "RSI Length", minval=1)
lengthStoch = input.int(14, "Stochastic Length", minval=1)
src = input(close, title="RSI Source")
rsi1 = ta.rsi(src, lengthRSI)
k = ta.sma(ta.stoch(rsi1, rsi1, rsi1, lengthStoch), smoothK)
d = ta.sma(k, smoothD)
plot(k, "K", color=#2962FF)
plot(d, "D", color=#FF6D00)

d_k = d - k
smoothD_d = d - smoothD
smoothK_k = k - smoothK

h0 = hline(80, "Upper Band", color=#787B86)
hline(50, "Middle Band", color=color.new(#787B86, 50))
h1 = hline(20, "Lower Band", color=#787B86)
fill(h0, h1, color=color.rgb(33, 150, 243, 90), title="Background")

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
float op_operation = decision_tree_0_UPST_1Min_aecc186e(rsi1, d, k, smoothD_d, d_k, smoothK_k, VIP, VIP_VIM, VIM)

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


