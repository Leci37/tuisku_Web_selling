//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Triple_EMA
// ID_model: META_1Min_2ST0_6b64803b Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_META_1Min_2ST0_6b64803b", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_META_1Min_6b64803b(d, d_k, smoothK_k, k, rsi1, smoothD_d, ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( ema12 <= 0.471886 )
		if( d_k <= -1.40746 )
			if( rsi1 <= 65.8517 )
				if( tema <= 461.774 )
					if( ema13 <= -1.76193 )
						if( tema <= 415.239 )
							if( rsi1 <= 29.5223 )
								ret := 1.000000 // buy
							if( rsi1 > 29.5223 )
								ret := 0.800000 // buy
						if( tema > 415.239 )
							if( ema2 <= 460.681 )
								if( d <= 4.17198 )
									ret := 0.681818
								if( d > 4.17198 )
									ret := -0.477848
							if( ema2 > 460.681 )
								if( ema1 <= 455.698 )
									ret := -1.000000 // sell
								if( ema1 > 455.698 )
									ret := 0.696429
					if( ema13 > -1.76193 )
						if( ema2 <= 427.929 )
							if( tema <= 418.242 )
								if( k <= 86.5495 )
									ret := -0.025424
								if( k > 86.5495 )
									ret := 0.826087 // buy
							if( tema > 418.242 )
								if( ema1 <= 425.739 )
									ret := -0.870130 // sell
								if( ema1 > 425.739 )
									ret := -0.211111
						if( ema2 > 427.929 )
							if( tema <= 457.433 )
								if( ema3 <= 457.679 )
									ret := 0.137139
								if( ema3 > 457.679 )
									ret := -0.480000
							if( tema > 457.433 )
								if( d_k <= -24.2995 )
									ret := -0.771429 // sell
								if( d_k > -24.2995 )
									ret := 0.382906
				if( tema > 461.774 )
					if( rsi1 <= 56.733 )
						if( tema <= 504.338 )
							if( ema2 <= 463.767 )
								if( ema12 <= 0.070811 )
									ret := -0.150134
								if( ema12 > 0.070811 )
									ret := -0.569620
							if( ema2 > 463.767 )
								if( ema2 <= 505.534 )
									ret := 0.020984
								if( ema2 > 505.534 )
									ret := 0.714286 // buy
						if( tema > 504.338 )
							if( ema1 <= 514.775 )
								if( k <= 7.93771 )
									ret := 0.211538
								if( k > 7.93771 )
									ret := -0.224952
							if( ema1 > 514.775 )
								if( k <= 73.3798 )
									ret := -0.037031
								if( k > 73.3798 )
									ret := 0.125250
					if( rsi1 > 56.733 )
						if( ema3 <= 587.058 )
							if( d_k <= -24.6326 )
								if( d_k <= -25.4611 )
									ret := 0.188034
								if( d_k > -25.4611 )
									ret := 0.465517
							if( d_k > -24.6326 )
								if( rsi1 <= 58.6514 )
									ret := -0.234495
								if( rsi1 > 58.6514 )
									ret := -0.102371
						if( ema3 > 587.058 )
							if( ema2 <= 592.591 )
								if( smoothK_k <= 94.6982 )
									ret := 0.466216
								if( smoothK_k > 94.6982 )
									ret := 0.000000
							if( ema2 > 592.591 )
								if( d <= 91.7264 )
									ret := -0.169492
								if( d > 91.7264 )
									ret := 0.727273 // buy
			if( rsi1 > 65.8517 )
				if( smoothD_d <= 19.3521 )
					if( k <= 10.5347 )
						if( ema13 <= 0.726157 )
							ret := 0.500000
						if( ema13 > 0.726157 )
							ret := 0.636364
					if( k > 10.5347 )
						if( rsi1 <= 71.4365 )
							if( ema2 <= 441.516 )
								ret := -1.000000 // sell
							if( ema2 > 441.516 )
								if( ema1 <= 493.173 )
									ret := 0.138889
								if( ema1 > 493.173 )
									ret := -0.346154
						if( rsi1 > 71.4365 )
							if( k <= 26.1006 )
								ret := -0.954545 // sell
							if( k > 26.1006 )
								if( tema <= 493.384 )
									ret := -0.416667
								if( tema > 493.384 )
									ret := -0.666667
				if( smoothD_d > 19.3521 )
					if( ema2 <= 470.491 )
						if( d_k <= -8.74701 )
							if( ema12 <= 0.106876 )
								if( ema3 <= 452.055 )
									ret := -0.722222 // sell
								if( ema3 > 452.055 )
									ret := 0.166667
							if( ema12 > 0.106876 )
								if( tema <= 467.956 )
									ret := 0.316294
								if( tema > 467.956 )
									ret := 0.711538 // buy
						if( d_k > -8.74701 )
							if( d <= 93.8484 )
								if( k <= 58.6811 )
									ret := 0.566667
								if( k > 58.6811 )
									ret := -0.098639
							if( d > 93.8484 )
								if( d <= 95.1272 )
									ret := 0.648148
								if( d > 95.1272 )
									ret := 0.224490
					if( ema2 > 470.491 )
						if( d_k <= -1.8139 )
							if( ema2 <= 526.378 )
								if( ema2 <= 525.155 )
									ret := 0.034830
								if( ema2 > 525.155 )
									ret := -0.338983
							if( ema2 > 526.378 )
								if( d <= 95.6777 )
									ret := 0.268966
								if( d > 95.6777 )
									ret := -0.312500
						if( d_k > -1.8139 )
							if( ema2 <= 500.987 )
								if( ema2 <= 478.912 )
									ret := -0.368421
								if( ema2 > 478.912 )
									ret := -0.806452 // sell
							if( ema2 > 500.987 )
								if( ema13 <= 0.393745 )
									ret := -0.305085
								if( ema13 > 0.393745 )
									ret := -0.055556
		if( d_k > -1.40746 )
			if( ema12 <= -0.091948 )
				if( tema <= 541.111 )
					if( ema3 <= 478.183 )
						if( ema1 <= 430.851 )
							if( k <= 20.1312 )
								if( ema1 <= 429.932 )
									ret := 0.759358 // buy
								if( ema1 > 429.932 )
									ret := 0.287500
							if( k > 20.1312 )
								if( ema2 <= 429.002 )
									ret := -0.280576
								if( ema2 > 429.002 )
									ret := 0.636364
						if( ema1 > 430.851 )
							if( tema <= 463.05 )
								if( ema12 <= -0.552613 )
									ret := -0.138501
								if( ema12 > -0.552613 )
									ret := 0.074617
							if( tema > 463.05 )
								if( ema1 <= 464.523 )
									ret := 0.468619
								if( ema1 > 464.523 )
									ret := 0.128323
					if( ema3 > 478.183 )
						if( ema1 <= 478.988 )
							if( tema <= 474.811 )
								if( smoothK_k <= 3.31523 )
									ret := 1.000000 // buy
								if( smoothK_k > 3.31523 )
									ret := 0.090909
							if( tema > 474.811 )
								if( ema12 <= -0.414926 )
									ret := -0.639535
								if( ema12 > -0.414926 )
									ret := -0.250000
						if( ema1 > 478.988 )
							if( ema12 <= -2.23937 )
								if( tema <= 494.96 )
									ret := 0.032258
								if( tema > 494.96 )
									ret := -1.000000 // sell
							if( ema12 > -2.23937 )
								if( k <= 0.775664 )
									ret := -0.060818
								if( k > 0.775664 )
									ret := 0.056622
				if( tema > 541.111 )
					if( k <= 27.3919 )
						if( ema12 <= -0.654635 )
							if( ema2 <= 590.542 )
								if( rsi1 <= 36.9217 )
									ret := 0.728643 // buy
								if( rsi1 > 36.9217 )
									ret := -0.333333
							if( ema2 > 590.542 )
								if( ema1 <= 592.313 )
									ret := -1.000000 // sell
								if( ema1 > 592.313 )
									ret := 0.130435
						if( ema12 > -0.654635 )
							if( ema3 <= 587.113 )
								if( smoothD_d <= 33.7959 )
									ret := -0.040038
								if( smoothD_d > 33.7959 )
									ret := 0.462500
							if( ema3 > 587.113 )
								if( ema1 <= 593.876 )
									ret := 0.297994
								if( ema1 > 593.876 )
									ret := -0.247191
					if( k > 27.3919 )
						if( ema2 <= 559.226 )
							if( ema3 <= 558.854 )
								if( k <= 51.5694 )
									ret := -0.409091
								if( k > 51.5694 )
									ret := 0.400000
							if( ema3 > 558.854 )
								if( d <= 81.3641 )
									ret := -0.583333
								if( d > 81.3641 )
									ret := -1.000000 // sell
						if( ema2 > 559.226 )
							if( ema2 <= 586.157 )
								if( tema <= 568.076 )
									ret := 0.637405
								if( tema > 568.076 )
									ret := 0.391781
							if( ema2 > 586.157 )
								if( d_k <= -0.642758 )
									ret := -0.555556
								if( d_k > -0.642758 )
									ret := 0.051020
			if( ema12 > -0.091948 )
				if( k <= 98.2207 )
					if( smoothK_k <= 91.9039 )
						if( k <= 52.4846 )
							if( ema3 <= 585.925 )
								if( d <= 74.9159 )
									ret := -0.011733
								if( d > 74.9159 )
									ret := -0.706667 // sell
							if( ema3 > 585.925 )
								if( ema1 <= 596.215 )
									ret := -0.274583
								if( ema1 > 596.215 )
									ret := -0.918919 // sell
						if( k > 52.4846 )
							if( d <= 57.2424 )
								if( rsi1 <= 62.7651 )
									ret := 0.425806
								if( rsi1 > 62.7651 )
									ret := -0.083333
							if( d > 57.2424 )
								if( tema <= 463.629 )
									ret := 0.155292
								if( tema > 463.629 )
									ret := -0.001043
					if( smoothK_k > 91.9039 )
						if( ema2 <= 456.472 )
							if( smoothK_k <= 94.2257 )
								if( ema13 <= 0.185556 )
									ret := 0.333333
								if( ema13 > 0.185556 )
									ret := 0.800000 // buy
							if( smoothK_k > 94.2257 )
								if( rsi1 <= 68.8639 )
									ret := -0.354839
								if( rsi1 > 68.8639 )
									ret := 0.750000 // buy
						if( ema2 > 456.472 )
							if( tema <= 472.953 )
								if( tema <= 471.434 )
									ret := -0.109589
								if( tema > 471.434 )
									ret := -0.689655
							if( tema > 472.953 )
								if( ema12 <= 0.312176 )
									ret := 0.099227
								if( ema12 > 0.312176 )
									ret := 0.381132
				if( k > 98.2207 )
					if( ema12 <= 0.032782 )
						if( ema1 <= 439.763 )
							ret := 0.473684
						if( ema1 > 439.763 )
							if( smoothD_d <= 95.2382 )
								ret := 0.545455
							if( smoothD_d > 95.2382 )
								if( ema13 <= -0.279139 )
									ret := -0.804348 // sell
								if( ema13 > -0.279139 )
									ret := -0.309278
					if( ema12 > 0.032782 )
						if( ema13 <= 0.164251 )
							if( ema13 <= -0.288439 )
								ret := -0.714286 // sell
							if( ema13 > -0.288439 )
								if( d_k <= 0.525225 )
									ret := 0.088825
								if( d_k > 0.525225 )
									ret := 0.882353 // buy
						if( ema13 > 0.164251 )
							if( ema3 <= 503.593 )
								if( d <= 98.2155 )
									ret := -0.795918 // sell
								if( d > 98.2155 )
									ret := -0.240826
							if( ema3 > 503.593 )
								if( ema1 <= 537.303 )
									ret := 0.175373
								if( ema1 > 537.303 )
									ret := -0.391813
	if( ema12 > 0.471886 )
		if( d <= 41.8789 )
			if( smoothD_d <= 6.63072 )
				if( ema12 <= 0.861364 )
					if( ema2 <= 518.47 )
						if( ema3 <= 507.533 )
							if( smoothK_k <= 0.192751 )
								if( ema12 <= 0.605127 )
									ret := 0.000000
								if( ema12 > 0.605127 )
									ret := -0.733333 // sell
							if( smoothK_k > 0.192751 )
								if( ema1 <= 484.75 )
									ret := -0.388889
								if( ema1 > 484.75 )
									ret := 0.775000 // buy
						if( ema3 > 507.533 )
							ret := -0.764706 // sell
					if( ema2 > 518.47 )
						if( ema3 <= 520.261 )
							ret := 1.000000 // buy
						if( ema3 > 520.261 )
							ret := 0.388889
				if( ema12 > 0.861364 )
					if( smoothK_k <= 2.21213 )
						if( ema2 <= 484.613 )
							ret := -0.545455
						if( ema2 > 484.613 )
							ret := -1.000000 // sell
					if( smoothK_k > 2.21213 )
						ret := -0.235294
			if( smoothD_d > 6.63072 )
				if( tema <= 482.291 )
					if( d <= 15.0329 )
						if( k <= 9.63207 )
							ret := -0.277778
						if( k > 9.63207 )
							if( ema3 <= 443.908 )
								ret := -1.000000 // sell
							if( ema3 > 443.908 )
								ret := -0.600000
					if( d > 15.0329 )
						if( ema13 <= 1.72407 )
							if( smoothK_k <= 20.3128 )
								if( smoothD_d <= 15.0299 )
									ret := 0.769231 // buy
								if( smoothD_d > 15.0299 )
									ret := -0.437500
							if( smoothK_k > 20.3128 )
								if( d <= 30.3644 )
									ret := 0.565789
								if( d > 30.3644 )
									ret := 0.038961
						if( ema13 > 1.72407 )
							if( k <= 14.9021 )
								ret := -0.055556
							if( k > 14.9021 )
								if( ema12 <= 1.46217 )
									ret := -0.800000 // sell
								if( ema12 > 1.46217 )
									ret := -0.846154 // sell
				if( tema > 482.291 )
					if( ema1 <= 487.148 )
						if( smoothD_d <= 21.1644 )
							ret := -0.466667
						if( smoothD_d > 21.1644 )
							if( ema12 <= 0.73769 )
								if( ema1 <= 483.425 )
									ret := -0.928571 // sell
								if( ema1 > 483.425 )
									ret := -1.000000 // sell
							if( ema12 > 0.73769 )
								ret := -0.666667
					if( ema1 > 487.148 )
						if( ema13 <= 1.42296 )
							if( smoothK_k <= 3.77903 )
								ret := 0.470588
							if( smoothK_k > 3.77903 )
								if( ema2 <= 500.052 )
									ret := -0.670330
								if( ema2 > 500.052 )
									ret := -0.185668
						if( ema13 > 1.42296 )
							if( ema2 <= 494.044 )
								if( d_k <= 6.61102 )
									ret := -0.708333 // sell
								if( d_k > 6.61102 )
									ret := 0.714286 // buy
							if( ema2 > 494.044 )
								if( ema12 <= 0.915561 )
									ret := -0.484127
								if( ema12 > 0.915561 )
									ret := -0.921053 // sell
		if( d > 41.8789 )
			if( rsi1 <= 89.535 )
				if( ema12 <= 1.10872 )
					if( k <= 97.2023 )
						if( tema <= 439.967 )
							if( ema13 <= 1.75019 )
								if( k <= 42.2226 )
									ret := 0.964286 // buy
								if( k > 42.2226 )
									ret := 0.207668
							if( ema13 > 1.75019 )
								if( d_k <= 6.22613 )
									ret := -0.812500 // sell
								if( d_k > 6.22613 )
									ret := -0.238095
						if( tema > 439.967 )
							if( ema1 <= 440.842 )
								if( tema <= 440.659 )
									ret := -0.760000 // sell
								if( tema > 440.659 )
									ret := -0.953488 // sell
							if( ema1 > 440.842 )
								if( smoothD_d <= 92.9542 )
									ret := -0.087930
								if( smoothD_d > 92.9542 )
									ret := 0.121514
					if( k > 97.2023 )
						if( d_k <= -16.0728 )
							if( tema <= 468.894 )
								if( ema2 <= 451.759 )
									ret := 0.250000
								if( ema2 > 451.759 )
									ret := 1.000000 // buy
							if( tema > 468.894 )
								if( smoothK_k <= 96.4656 )
									ret := -0.466667
								if( smoothK_k > 96.4656 )
									ret := 0.608696
						if( d_k > -16.0728 )
							if( ema1 <= 468.444 )
								if( ema1 <= 436.013 )
									ret := -0.752212 // sell
								if( ema1 > 436.013 )
									ret := -0.455782
							if( ema1 > 468.444 )
								if( tema <= 482.662 )
									ret := 0.210280
								if( tema > 482.662 )
									ret := -0.201459
				if( ema12 > 1.10872 )
					if( tema <= 497.293 )
						if( tema <= 424.209 )
							ret := -0.764706 // sell
						if( tema > 424.209 )
							if( ema3 <= 487.32 )
								if( ema13 <= 3.35299 )
									ret := 0.157712
								if( ema13 > 3.35299 )
									ret := 0.560606
							if( ema3 > 487.32 )
								if( rsi1 <= 69.6563 )
									ret := 0.272727
								if( rsi1 > 69.6563 )
									ret := 0.830508 // buy
					if( tema > 497.293 )
						if( ema12 <= 2.33566 )
							if( ema1 <= 571.191 )
								if( ema2 <= 502.746 )
									ret := -0.548780
								if( ema2 > 502.746 )
									ret := 0.135870
							if( ema1 > 571.191 )
								if( ema2 <= 591.364 )
									ret := -0.875000 // sell
								if( ema2 > 591.364 )
									ret := 0.071429
						if( ema12 > 2.33566 )
							if( smoothK_k <= 92.4838 )
								ret := -1.000000 // sell
							if( smoothK_k > 92.4838 )
								ret := -0.583333
			if( rsi1 > 89.535 )
				if( ema3 <= 481.914 )
					if( d_k <= -3.95581 )
						if( smoothK_k <= 86.1496 )
							ret := 1.000000 // buy
						if( smoothK_k > 86.1496 )
							ret := 0.363636
					if( d_k > -3.95581 )
						if( ema2 <= 468.869 )
							if( rsi1 <= 92.4787 )
								if( ema3 <= 456.965 )
									ret := -0.200000
								if( ema3 > 456.965 )
									ret := 0.777778 // buy
							if( rsi1 > 92.4787 )
								if( smoothD_d <= 92.2392 )
									ret := -1.000000 // sell
								if( smoothD_d > 92.2392 )
									ret := 0.526316
						if( ema2 > 468.869 )
							if( d <= 90.4095 )
								ret := -0.166667
							if( d > 90.4095 )
								if( ema2 <= 471.875 )
									ret := -1.000000 // sell
								if( ema2 > 471.875 )
									ret := -0.730769 // sell
				if( ema3 > 481.914 )
					if( ema12 <= 0.867699 )
						if( ema1 <= 529.321 )
							if( d <= 99.5146 )
								if( d <= 95.1174 )
									ret := 0.641026
								if( d > 95.1174 )
									ret := 0.175000
							if( d > 99.5146 )
								ret := -0.583333
						if( ema1 > 529.321 )
							if( smoothK_k <= 96.9335 )
								if( ema13 <= 0.925159 )
									ret := 0.200000
								if( ema13 > 0.925159 )
									ret := -0.745098 // sell
							if( smoothK_k > 96.9335 )
								ret := 0.076923
					if( ema12 > 0.867699 )
						if( smoothK_k <= 91.4014 )
							if( ema13 <= 2.58932 )
								if( smoothK_k <= 88.2344 )
									ret := -0.166667
								if( smoothK_k > 88.2344 )
									ret := 0.777778 // buy
							if( ema13 > 2.58932 )
								if( ema2 <= 531.091 )
									ret := -0.888889 // sell
								if( ema2 > 531.091 )
									ret := -0.200000
						if( smoothK_k > 91.4014 )
							if( ema13 <= 2.08821 )
								if( ema1 <= 536.115 )
									ret := 0.428571
								if( ema1 > 536.115 )
									ret := 0.968254 // buy
							if( ema13 > 2.08821 )
								if( smoothD_d <= 94.7891 )
									ret := -0.346154
								if( smoothD_d > 94.7891 )
									ret := 0.766667 // buy
	
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
float op_operation = decision_tree_0_META_1Min_6b64803b(d, d_k, smoothK_k, k, rsi1, smoothD_d, ema12, ema3, ema13, tema, ema1, ema2)

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


