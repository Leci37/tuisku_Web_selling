//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Triple_EMA
// ID_model: UBER_15Min_2ST0_462a5ff3 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_UBER_15Min_2ST0_462a5ff3", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_UBER_15Min_462a5ff3(rsi1, d, k, smoothD_d, d_k, smoothK_k, ema2, ema1, ema12, ema3, ema13, tema)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=0.7, min_samples_leaf=7,min_samples_split=10, random_state=843828734)
	if( rsi1 <= 38.6876 )
		if( tema <= 31.6397 )
			if( ema12 <= -0.383654 )
				if( rsi1 <= 6.54969 )
					if( d <= 0.079556 )
						ret := -1.000000 // sell
					if( d > 0.079556 )
						ret := -0.777778 // sell
				if( rsi1 > 6.54969 )
					if( ema12 <= -0.52899 )
						if( d_k <= 0.081515 )
							if( ema2 <= 28.6385 )
								if( ema1 <= 21.2804 )
									ret := 0.181818
								if( ema1 > 21.2804 )
									ret := 0.956522 // buy
							if( ema2 > 28.6385 )
								ret := 0.263158
						if( d_k > 0.081515 )
							ret := 1.000000 // buy
					if( ema12 > -0.52899 )
						if( ema2 <= 28.8554 )
							if( d_k <= -6.41895 )
								ret := 0.117647
							if( d_k > -6.41895 )
								if( ema1 <= 25.0006 )
									ret := 0.951220 // buy
								if( ema1 > 25.0006 )
									ret := 0.576923
						if( ema2 > 28.8554 )
							if( ema1 <= 31.1274 )
								if( ema2 <= 31.0706 )
									ret := 0.063830
								if( ema2 > 31.0706 )
									ret := -0.900000 // sell
							if( ema1 > 31.1274 )
								if( ema12 <= -0.405676 )
									ret := 0.736842 // buy
								if( ema12 > -0.405676 )
									ret := 0.214286
			if( ema12 > -0.383654 )
				if( ema1 <= 19.801 )
					if( smoothK_k <= 69.0787 )
						if( ema2 <= 16.8671 )
							ret := 0.076923
						if( ema2 > 16.8671 )
							if( smoothD_d <= 46.7262 )
								ret := -1.000000 // sell
							if( smoothD_d > 46.7262 )
								ret := -0.636364
					if( smoothK_k > 69.0787 )
						ret := 0.888889 // buy
				if( ema1 > 19.801 )
					if( d <= 12.3895 )
						if( ema3 <= 30.4463 )
							if( d_k <= 7.60968 )
								if( smoothD_d <= 2.6623 )
									ret := 0.258307
								if( smoothD_d > 2.6623 )
									ret := 0.036943
							if( d_k > 7.60968 )
								if( ema3 <= 26.0126 )
									ret := 0.100000
								if( ema3 > 26.0126 )
									ret := 0.708861 // buy
						if( ema3 > 30.4463 )
							if( d <= 7.51793 )
								if( tema <= 30.2511 )
									ret := 0.731707 // buy
								if( tema > 30.2511 )
									ret := 0.196581
							if( d > 7.51793 )
								if( ema12 <= -0.151366 )
									ret := 0.822222 // buy
								if( ema12 > -0.151366 )
									ret := 0.439655
					if( d > 12.3895 )
						if( ema2 <= 31.7543 )
							if( rsi1 <= 17.1721 )
								if( ema3 <= 31.4869 )
									ret := 0.689655
								if( ema3 > 31.4869 )
									ret := -0.100000
							if( rsi1 > 17.1721 )
								if( ema12 <= -0.233312 )
									ret := -0.114362
								if( ema12 > -0.233312 )
									ret := 0.106439
						if( ema2 > 31.7543 )
							if( d_k <= -14.3046 )
								if( d <= 21.4451 )
									ret := -0.846154 // sell
								if( d > 21.4451 )
									ret := -0.090909
							if( d_k > -14.3046 )
								if( ema3 <= 32.0821 )
									ret := 0.752688 // buy
								if( ema3 > 32.0821 )
									ret := 0.380952
		if( tema > 31.6397 )
			if( d_k <= 19.286 )
				if( rsi1 <= 27.9439 )
					if( k <= 27.1469 )
						if( rsi1 <= 21.9368 )
							if( d_k <= -0.052317 )
								if( smoothD_d <= -1.14445 )
									ret := -0.145062
								if( smoothD_d > -1.14445 )
									ret := 0.119225
							if( d_k > -0.052317 )
								if( ema12 <= -0.975117 )
									ret := 1.000000 // buy
								if( ema12 > -0.975117 )
									ret := 0.181279
						if( rsi1 > 21.9368 )
							if( smoothK_k <= -2.37203 )
								if( ema3 <= 70.0318 )
									ret := -0.173077
								if( ema3 > 70.0318 )
									ret := -0.772152 // sell
							if( smoothK_k > -2.37203 )
								if( rsi1 <= 22.5064 )
									ret := -0.270718
								if( rsi1 > 22.5064 )
									ret := 0.069066
					if( k > 27.1469 )
						if( ema12 <= -0.109541 )
							if( ema1 <= 60.565 )
								if( d_k <= -12.3599 )
									ret := 0.023256
								if( d_k > -12.3599 )
									ret := -0.347744
							if( ema1 > 60.565 )
								if( d <= 76.2656 )
									ret := 0.028571
								if( d > 76.2656 )
									ret := 0.684211
						if( ema12 > -0.109541 )
							if( d <= 34.0191 )
								if( d <= 25.5166 )
									ret := 0.210526
								if( d > 25.5166 )
									ret := 0.678571
							if( d > 34.0191 )
								if( k <= 56.2956 )
									ret := -0.130435
								if( k > 56.2956 )
									ret := 0.333333
				if( rsi1 > 27.9439 )
					if( k <= 5.84807 )
						if( ema2 <= 34.9678 )
							if( ema3 <= 33.5701 )
								if( smoothK_k <= 1.4179 )
									ret := 0.173611
								if( smoothK_k > 1.4179 )
									ret := -0.433333
							if( ema3 > 33.5701 )
								if( d_k <= 4.99107 )
									ret := -0.631579
								if( d_k > 4.99107 )
									ret := -0.090909
						if( ema2 > 34.9678 )
							if( ema3 <= 44.277 )
								if( ema2 <= 44.0572 )
									ret := 0.153846
								if( ema2 > 44.0572 )
									ret := 0.717949 // buy
							if( ema3 > 44.277 )
								if( d_k <= 16.9265 )
									ret := -0.008889
								if( d_k > 16.9265 )
									ret := -0.727273 // sell
					if( k > 5.84807 )
						if( d_k <= -19.7432 )
							if( smoothK_k <= 42.5096 )
								if( ema3 <= 51.6851 )
									ret := -1.000000 // sell
								if( ema3 > 51.6851 )
									ret := -0.700000 // sell
							if( smoothK_k > 42.5096 )
								if( d <= 27.7545 )
									ret := 0.692308
								if( d > 27.7545 )
									ret := -0.158824
						if( d_k > -19.7432 )
							if( ema12 <= -0.181297 )
								if( ema13 <= -0.907309 )
									ret := -0.172414
								if( ema13 > -0.907309 )
									ret := 0.251232
							if( ema12 > -0.181297 )
								if( ema13 <= 0.060227 )
									ret := 0.087205
								if( ema13 > 0.060227 )
									ret := -0.390244
			if( d_k > 19.286 )
				if( ema13 <= -0.187514 )
					if( rsi1 <= 12.5496 )
						ret := -0.666667
					if( rsi1 > 12.5496 )
						if( tema <= 37.264 )
							if( k <= 50.6925 )
								if( smoothD_d <= 31.7553 )
									ret := 0.666667
								if( smoothD_d > 31.7553 )
									ret := 0.916667 // buy
							if( k > 50.6925 )
								ret := 0.400000
						if( tema > 37.264 )
							if( rsi1 <= 30.6005 )
								if( ema1 <= 66.9506 )
									ret := 0.557377
								if( ema1 > 66.9506 )
									ret := 0.230769
							if( rsi1 > 30.6005 )
								if( k <= 15.3683 )
									ret := -0.404762
								if( k > 15.3683 )
									ret := 0.250000
				if( ema13 > -0.187514 )
					if( smoothK_k <= 25.7883 )
						if( d <= 54.395 )
							if( ema1 <= 32.998 )
								if( rsi1 <= 30.018 )
									ret := -0.500000
								if( rsi1 > 30.018 )
									ret := 0.833333 // buy
							if( ema1 > 32.998 )
								if( smoothK_k <= 22.5549 )
									ret := -0.151515
								if( smoothK_k > 22.5549 )
									ret := 0.684211
						if( d > 54.395 )
							if( ema13 <= -0.052781 )
								ret := -1.000000 // sell
							if( ema13 > -0.052781 )
								ret := -0.454545
					if( smoothK_k > 25.7883 )
						if( ema3 <= 53.1144 )
							if( tema <= 32.58 )
								ret := -0.533333
							if( tema > 32.58 )
								if( tema <= 42.2325 )
									ret := 0.191489
								if( tema > 42.2325 )
									ret := 0.517544
						if( ema3 > 53.1144 )
							if( ema12 <= -0.04198 )
								if( ema12 <= -0.071942 )
									ret := -0.294118
								if( ema12 > -0.071942 )
									ret := -0.785714 // sell
							if( ema12 > -0.04198 )
								ret := 0.333333
	if( rsi1 > 38.6876 )
		if( smoothK_k <= 94.7191 )
			if( ema2 <= 22.8664 )
				if( ema13 <= -0.003062 )
					if( ema12 <= -0.094766 )
						if( ema13 <= -0.184874 )
							if( smoothK_k <= 32.3598 )
								if( k <= 28.83 )
									ret := 0.941176 // buy
								if( k > 28.83 )
									ret := -0.916667 // sell
							if( smoothK_k > 32.3598 )
								if( ema2 <= 21.2455 )
									ret := 0.920000 // buy
								if( ema2 > 21.2455 )
									ret := 0.185185
						if( ema13 > -0.184874 )
							if( rsi1 <= 42.0907 )
								ret := 0.000000
							if( rsi1 > 42.0907 )
								ret := -0.470588
					if( ema12 > -0.094766 )
						if( ema3 <= 22.5263 )
							if( ema13 <= -0.241611 )
								ret := -0.777778 // sell
							if( ema13 > -0.241611 )
								if( ema12 <= -0.058411 )
									ret := 0.238806
								if( ema12 > -0.058411 )
									ret := -0.193798
						if( ema3 > 22.5263 )
							if( k <= 81.9648 )
								if( d <= 54.205 )
									ret := 0.270833
								if( d > 54.205 )
									ret := -0.411765
							if( k > 81.9648 )
								if( smoothD_d <= 88.7552 )
									ret := 0.625000
								if( smoothD_d > 88.7552 )
									ret := 1.000000 // buy
				if( ema13 > -0.003062 )
					if( tema <= 15.2626 )
						ret := -1.000000 // sell
					if( tema > 15.2626 )
						if( smoothK_k <= 82.894 )
							if( rsi1 <= 45.9175 )
								if( ema2 <= 20.9464 )
									ret := -0.733333 // sell
								if( ema2 > 20.9464 )
									ret := -0.060606
							if( rsi1 > 45.9175 )
								if( ema3 <= 22.0768 )
									ret := 0.466981
								if( ema3 > 22.0768 )
									ret := 0.185897
						if( smoothK_k > 82.894 )
							if( rsi1 <= 77.8422 )
								if( tema <= 21.5829 )
									ret := 0.270833
								if( tema > 21.5829 )
									ret := -0.246575
							if( rsi1 > 77.8422 )
								if( ema12 <= 0.166672 )
									ret := 0.000000
								if( ema12 > 0.166672 )
									ret := 0.906250 // buy
			if( ema2 > 22.8664 )
				if( d_k <= -4.66799 )
					if( rsi1 <= 55.2359 )
						if( ema12 <= -0.07935 )
							if( tema <= 62.1245 )
								if( k <= 28.1486 )
									ret := 0.099274
								if( k > 28.1486 )
									ret := -0.146185
							if( tema > 62.1245 )
								if( d <= 27.1059 )
									ret := -0.093333
								if( d > 27.1059 )
									ret := 0.333333
						if( ema12 > -0.07935 )
							if( ema12 <= 0.137852 )
								if( k <= 61.9734 )
									ret := 0.030065
								if( k > 61.9734 )
									ret := 0.113908
							if( ema12 > 0.137852 )
								if( ema3 <= 51.141 )
									ret := -0.672727
								if( ema3 > 51.141 )
									ret := 0.209302
					if( rsi1 > 55.2359 )
						if( ema3 <= 56.5057 )
							if( ema2 <= 53.1741 )
								if( tema <= 52.8188 )
									ret := -0.054742
								if( tema > 52.8188 )
									ret := 0.616667
							if( ema2 > 53.1741 )
								if( rsi1 <= 75.7765 )
									ret := -0.280255
								if( rsi1 > 75.7765 )
									ret := -0.773585 // sell
						if( ema3 > 56.5057 )
							if( rsi1 <= 63.6571 )
								if( smoothK_k <= 31.0905 )
									ret := 0.340426
								if( smoothK_k > 31.0905 )
									ret := -0.091592
							if( rsi1 > 63.6571 )
								if( d_k <= -5.58357 )
									ret := 0.221494
								if( d_k > -5.58357 )
									ret := -0.246914
				if( d_k > -4.66799 )
					if( ema12 <= 0.159307 )
						if( ema3 <= 43.6765 )
							if( tema <= 37.2393 )
								if( ema3 <= 36.8272 )
									ret := 0.043282
								if( ema3 > 36.8272 )
									ret := -0.170868
							if( tema > 37.2393 )
								if( ema13 <= -0.287004 )
									ret := -0.446809
								if( ema13 > -0.287004 )
									ret := 0.113415
						if( ema3 > 43.6765 )
							if( ema2 <= 47.9305 )
								if( ema13 <= -0.280344 )
									ret := 0.596154
								if( ema13 > -0.280344 )
									ret := -0.081685
							if( ema2 > 47.9305 )
								if( ema2 <= 60.4363 )
									ret := 0.075638
								if( ema2 > 60.4363 )
									ret := -0.017894
					if( ema12 > 0.159307 )
						if( d <= 9.17516 )
							if( ema1 <= 32.1875 )
								ret := -0.578947
							if( ema1 > 32.1875 )
								if( tema <= 47.4895 )
									ret := 0.327273
								if( tema > 47.4895 )
									ret := 0.800000 // buy
						if( d > 9.17516 )
							if( rsi1 <= 60.3359 )
								if( ema3 <= 31.9782 )
									ret := 0.612903
								if( ema3 > 31.9782 )
									ret := 0.185315
							if( rsi1 > 60.3359 )
								if( d <= 30.7296 )
									ret := -0.165217
								if( d > 30.7296 )
									ret := 0.102687
		if( smoothK_k > 94.7191 )
			if( ema13 <= 0.498182 )
				if( d_k <= -17.9034 )
					if( tema <= 33.0464 )
						if( smoothD_d <= 78.0848 )
							if( ema3 <= 30.9349 )
								if( d <= 78.2422 )
									ret := -0.465116
								if( d > 78.2422 )
									ret := -0.933333 // sell
							if( ema3 > 30.9349 )
								if( ema13 <= 0.035744 )
									ret := -1.000000 // sell
								if( ema13 > 0.035744 )
									ret := -0.454545
						if( smoothD_d > 78.0848 )
							ret := -0.333333
					if( tema > 33.0464 )
						if( d <= 71.4722 )
							ret := -0.777778 // sell
						if( d > 71.4722 )
							if( d_k <= -19.3971 )
								if( d_k <= -24.1691 )
									ret := -0.076923
								if( d_k > -24.1691 )
									ret := 0.169492
							if( d_k > -19.3971 )
								if( ema13 <= 0.061064 )
									ret := -0.214286
								if( ema13 > 0.061064 )
									ret := -0.545455
				if( d_k > -17.9034 )
					if( rsi1 <= 77.4926 )
						if( rsi1 <= 62.1218 )
							if( tema <= 79.8745 )
								if( smoothD_d <= 81.5817 )
									ret := -0.271605
								if( smoothD_d > 81.5817 )
									ret := 0.087175
							if( tema > 79.8745 )
								ret := -0.833333 // sell
						if( rsi1 > 62.1218 )
							if( d_k <= -13.7638 )
								if( d_k <= -15.2159 )
									ret := 0.145833
								if( d_k > -15.2159 )
									ret := 0.793103 // buy
							if( d_k > -13.7638 )
								if( ema3 <= 22.2257 )
									ret := -0.847826 // sell
								if( ema3 > 22.2257 )
									ret := -0.159371
					if( rsi1 > 77.4926 )
						if( d_k <= -5.95481 )
							if( ema1 <= 35.2088 )
								if( tema <= 31.4271 )
									ret := -0.228571
								if( tema > 31.4271 )
									ret := -0.695652
							if( ema1 > 35.2088 )
								if( ema12 <= 0.236421 )
									ret := -0.107143
								if( ema12 > 0.236421 )
									ret := 0.407407
						if( d_k > -5.95481 )
							if( tema <= 23.4062 )
								if( ema3 <= 22.0439 )
									ret := 0.333333
								if( ema3 > 22.0439 )
									ret := 0.952381 // buy
							if( tema > 23.4062 )
								if( ema3 <= 24.5219 )
									ret := -0.522727
								if( ema3 > 24.5219 )
									ret := 0.177054
			if( ema13 > 0.498182 )
				if( rsi1 <= 89.7075 )
					if( k <= 99.8699 )
						if( ema12 <= 0.551094 )
							if( d_k <= 0.212907 )
								if( d <= 98.5262 )
									ret := -0.318182
								if( d > 98.5262 )
									ret := -0.752688 // sell
							if( d_k > 0.212907 )
								if( ema12 <= 0.365387 )
									ret := -0.470588
								if( ema12 > 0.365387 )
									ret := 0.232558
						if( ema12 > 0.551094 )
							if( ema2 <= 48.4239 )
								if( ema12 <= 0.706624 )
									ret := -1.000000 // sell
								if( ema12 > 0.706624 )
									ret := -0.700000 // sell
							if( ema2 > 48.4239 )
								if( smoothD_d <= 95.1157 )
									ret := -0.133333
								if( smoothD_d > 95.1157 )
									ret := -0.812500 // sell
					if( k > 99.8699 )
						if( smoothK_k <= 96.897 )
							ret := 0.916667 // buy
						if( smoothK_k > 96.897 )
							if( d_k <= -1.32075 )
								if( ema1 <= 41.7484 )
									ret := -0.363636
								if( ema1 > 41.7484 )
									ret := 0.217391
							if( d_k > -1.32075 )
								if( ema2 <= 39.8374 )
									ret := -0.047619
								if( ema2 > 39.8374 )
									ret := -0.676923
				if( rsi1 > 89.7075 )
					if( ema2 <= 27.8222 )
						ret := 1.000000 // buy
					if( ema2 > 27.8222 )
						if( ema1 <= 69.5099 )
							if( ema12 <= 0.628901 )
								if( tema <= 43.7349 )
									ret := 0.289474
								if( tema > 43.7349 )
									ret := -0.386364
							if( ema12 > 0.628901 )
								ret := -0.850000 // sell
						if( ema1 > 69.5099 )
							if( smoothD_d <= 96.0248 )
								if( ema12 <= 0.743791 )
									ret := 0.666667
								if( ema12 > 0.743791 )
									ret := 1.000000 // buy
							if( smoothD_d > 96.0248 )
								ret := 0.000000
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
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

//CODE associated with the technical indicator L_Triple_EMA 
//@version=5
//indicator title="Triple EMA", shorttitle="TEMA", overlay=true, timeframe="", timeframe_gaps=true)
length_TEMA = input.int(9, minval=1)
ema1 = ta.ema(close, length_TEMA)
ema2 = ta.ema(ema1, length_TEMA)
ema3 = ta.ema(ema2, length_TEMA)
tema = 3 * (ema1 - ema2) + ema3
plot(tema, "TEMA", color=#2962FF)

ema12 = ema1 - ema2
ema13 = ema1 - ema3


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
float op_operation = decision_tree_0_UBER_15Min_462a5ff3(rsi1, d, k, smoothD_d, d_k, smoothK_k, ema2, ema1, ema12, ema3, ema13, tema)

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


