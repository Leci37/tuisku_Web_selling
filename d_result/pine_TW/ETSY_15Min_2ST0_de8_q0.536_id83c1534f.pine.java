//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Triple_EMA
// ID_model: ETSY_15Min_2ST0_83c1534f Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ETSY_15Min_2ST0_83c1534f", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ETSY_15Min_83c1534f(d, d_k, smoothK_k, k, rsi1, smoothD_d, ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( d_k <= -2.07599 )
		if( ema12 <= 0.346026 )
			if( rsi1 <= 67.3676 )
				if( ema1 <= 243.26 )
					if( ema3 <= 229.377 )
						if( k <= 33.4529 )
							if( rsi1 <= 21.0305 )
								if( ema2 <= 157.141 )
									ret := 0.065891
								if( ema2 > 157.141 )
									ret := 0.560345
							if( rsi1 > 21.0305 )
								if( smoothK_k <= 27.9458 )
									ret := -0.068523
								if( smoothK_k > 27.9458 )
									ret := -0.209166
						if( k > 33.4529 )
							if( d <= 88.1649 )
								if( ema2 <= 128.651 )
									ret := 0.016669
								if( ema2 > 128.651 )
									ret := -0.063766
							if( d > 88.1649 )
								if( tema <= 12.3469 )
									ret := 0.470588
								if( tema > 12.3469 )
									ret := -0.168081
					if( ema3 > 229.377 )
						if( k <= 13.8141 )
							if( ema1 <= 231.715 )
								ret := 0.000000
							if( ema1 > 231.715 )
								ret := -0.666667
						if( k > 13.8141 )
							if( ema3 <= 240.412 )
								if( ema12 <= -0.513576 )
									ret := 0.121212
								if( ema12 > -0.513576 )
									ret := 0.580247
							if( ema3 > 240.412 )
								if( d_k <= -7.98116 )
									ret := 0.357143
								if( d_k > -7.98116 )
									ret := 0.961538 // buy
				if( ema1 > 243.26 )
					if( rsi1 <= 38.4565 )
						if( smoothK_k <= 54.6641 )
							if( ema2 <= 287.132 )
								if( ema12 <= -2.12922 )
									ret := 0.750000 // buy
								if( ema12 > -2.12922 )
									ret := 0.104167
							if( ema2 > 287.132 )
								ret := 0.846154 // buy
						if( smoothK_k > 54.6641 )
							ret := -0.529412
					if( rsi1 > 38.4565 )
						if( ema12 <= -0.806298 )
							if( smoothK_k <= 62.6902 )
								if( k <= 57.2533 )
									ret := -0.071429
								if( k > 57.2533 )
									ret := 0.375000
							if( smoothK_k > 62.6902 )
								ret := -0.444444
						if( ema12 > -0.806298 )
							if( ema3 <= 252.003 )
								if( ema13 <= -0.809526 )
									ret := -0.214286
								if( ema13 > -0.809526 )
									ret := -0.840000 // sell
							if( ema3 > 252.003 )
								if( ema3 <= 253.097 )
									ret := 0.181818
								if( ema3 > 253.097 )
									ret := -0.495413
			if( rsi1 > 67.3676 )
				if( ema13 <= 0.118701 )
					if( ema3 <= 43.5198 )
						if( d_k <= -9.09107 )
							if( d <= 73.3252 )
								if( d <= 70.8903 )
									ret := 0.282258
								if( d > 70.8903 )
									ret := 0.695652
							if( d > 73.3252 )
								if( smoothD_d <= 76.94 )
									ret := -0.294118
								if( smoothD_d > 76.94 )
									ret := 0.054054
						if( d_k > -9.09107 )
							if( k <= 80.8159 )
								if( ema3 <= 13.9075 )
									ret := -0.100000
								if( ema3 > 13.9075 )
									ret := 0.306122
							if( k > 80.8159 )
								if( d <= 97.2985 )
									ret := 0.632768
								if( d > 97.2985 )
									ret := -0.307692
					if( ema3 > 43.5198 )
						if( ema2 <= 147.841 )
							if( ema1 <= 49.1682 )
								if( ema12 <= 0.082983 )
									ret := 0.363636
								if( ema12 > 0.082983 )
									ret := -0.923077 // sell
							if( ema1 > 49.1682 )
								if( smoothK_k <= 96.3945 )
									ret := 0.121212
								if( smoothK_k > 96.3945 )
									ret := -0.104167
						if( ema2 > 147.841 )
							if( ema2 <= 170.935 )
								ret := -0.666667
							if( ema2 > 170.935 )
								ret := -0.238095
				if( ema13 > 0.118701 )
					if( ema1 <= 68.447 )
						if( ema1 <= 56.0451 )
							if( d <= 57.4565 )
								if( smoothD_d <= 48.8021 )
									ret := -0.137124
								if( smoothD_d > 48.8021 )
									ret := -0.636364
							if( d > 57.4565 )
								if( ema3 <= 51.7117 )
									ret := 0.118976
								if( ema3 > 51.7117 )
									ret := -0.206897
						if( ema1 > 56.0451 )
							if( k <= 75.5157 )
								if( ema2 <= 64.0427 )
									ret := 0.710280 // buy
								if( ema2 > 64.0427 )
									ret := 0.190476
							if( k > 75.5157 )
								if( d <= 67.1619 )
									ret := 0.775000 // buy
								if( d > 67.1619 )
									ret := 0.069853
					if( ema1 > 68.447 )
						if( tema <= 75.091 )
							if( ema13 <= 0.497524 )
								if( d_k <= -17.284 )
									ret := -0.956522 // sell
								if( d_k > -17.284 )
									ret := -0.528090
							if( ema13 > 0.497524 )
								ret := 0.000000
						if( tema > 75.091 )
							if( ema2 <= 83.8363 )
								if( ema2 <= 79.2535 )
									ret := 0.236842
								if( ema2 > 79.2535 )
									ret := 0.511905
							if( ema2 > 83.8363 )
								if( ema13 <= 0.493728 )
									ret := 0.063927
								if( ema13 > 0.493728 )
									ret := -0.207317
		if( ema12 > 0.346026 )
			if( tema <= 121.895 )
				if( tema <= 96.3193 )
					if( smoothK_k <= 39.7598 )
						if( smoothD_d <= 20.7001 )
							if( ema2 <= 68.0178 )
								ret := 0.450000
							if( ema2 > 68.0178 )
								if( ema12 <= 0.399879 )
									ret := 0.136364
								if( ema12 > 0.399879 )
									ret := -0.553191
						if( smoothD_d > 20.7001 )
							if( ema2 <= 78.0053 )
								if( d_k <= -3.18051 )
									ret := -0.861538 // sell
								if( d_k > -3.18051 )
									ret := -0.533333
							if( ema2 > 78.0053 )
								ret := -0.176471
					if( smoothK_k > 39.7598 )
						if( ema2 <= 85.5932 )
							if( ema1 <= 82.4535 )
								if( ema1 <= 59.2917 )
									ret := -0.163265
								if( ema1 > 59.2917 )
									ret := 0.071802
							if( ema1 > 82.4535 )
								if( tema <= 83.911 )
									ret := -0.181818
								if( tema > 83.911 )
									ret := -0.768293 // sell
						if( ema2 > 85.5932 )
							if( smoothD_d <= 87.2201 )
								if( d <= 72.6004 )
									ret := 0.098765
								if( d > 72.6004 )
									ret := 0.587629
							if( smoothD_d > 87.2201 )
								if( ema13 <= 0.811921 )
									ret := 0.823529 // buy
								if( ema13 > 0.811921 )
									ret := -0.641026
				if( tema > 96.3193 )
					if( tema <= 105.283 )
						if( rsi1 <= 83.8463 )
							if( k <= 99.3512 )
								if( rsi1 <= 70.3157 )
									ret := -0.495968
								if( rsi1 > 70.3157 )
									ret := -0.839695 // sell
							if( k > 99.3512 )
								if( smoothD_d <= 89.4114 )
									ret := 0.157895
								if( smoothD_d > 89.4114 )
									ret := -0.733333 // sell
						if( rsi1 > 83.8463 )
							ret := 0.500000
					if( tema > 105.283 )
						if( rsi1 <= 60.8386 )
							if( rsi1 <= 58.9357 )
								if( ema3 <= 107.034 )
									ret := 0.285714
								if( ema3 > 107.034 )
									ret := -0.582090
							if( rsi1 > 58.9357 )
								if( ema3 <= 109.731 )
									ret := -1.000000 // sell
								if( ema3 > 109.731 )
									ret := -0.636364
						if( rsi1 > 60.8386 )
							if( smoothK_k <= 30.7833 )
								if( ema2 <= 110.16 )
									ret := 1.000000 // buy
								if( ema2 > 110.16 )
									ret := 0.125000
							if( smoothK_k > 30.7833 )
								if( d <= 51.5729 )
									ret := -0.514286
								if( d > 51.5729 )
									ret := -0.192308
			if( tema > 121.895 )
				if( ema3 <= 124.154 )
					if( d <= 82.523 )
						if( smoothD_d <= 69.5334 )
							if( smoothK_k <= 48.2198 )
								if( ema2 <= 121.4 )
									ret := 1.000000 // buy
								if( ema2 > 121.4 )
									ret := 0.608696
							if( smoothK_k > 48.2198 )
								if( ema12 <= 1.45687 )
									ret := -0.314286
								if( ema12 > 1.45687 )
									ret := 0.937500 // buy
						if( smoothD_d > 69.5334 )
							if( ema2 <= 122.124 )
								ret := 0.700000 // buy
							if( ema2 > 122.124 )
								ret := 0.952381 // buy
					if( d > 82.523 )
						if( smoothD_d <= 86.8663 )
							ret := -0.800000 // sell
						if( smoothD_d > 86.8663 )
							if( ema3 <= 121.461 )
								ret := -0.153846
							if( ema3 > 121.461 )
								ret := 0.705882 // buy
				if( ema3 > 124.154 )
					if( ema12 <= 0.510514 )
						if( ema1 <= 169.34 )
							if( rsi1 <= 48.7408 )
								ret := 0.533333
							if( rsi1 > 48.7408 )
								if( ema1 <= 147.225 )
									ret := -0.136364
								if( ema1 > 147.225 )
									ret := -0.606897
						if( ema1 > 169.34 )
							if( d <= 92.1381 )
								if( ema1 <= 239.906 )
									ret := 0.061290
								if( ema1 > 239.906 )
									ret := -0.357143
							if( d > 92.1381 )
								if( smoothK_k <= 95.1771 )
									ret := -0.684211
								if( smoothK_k > 95.1771 )
									ret := -0.166667
					if( ema12 > 0.510514 )
						if( k <= 52.9121 )
							if( rsi1 <= 69.6364 )
								if( d <= 35.4976 )
									ret := 0.135048
								if( d > 35.4976 )
									ret := 0.721649 // buy
							if( rsi1 > 69.6364 )
								if( ema3 <= 196.947 )
									ret := 0.000000
								if( ema3 > 196.947 )
									ret := -0.390244
						if( k > 52.9121 )
							if( smoothD_d <= 32.9414 )
								if( ema12 <= 0.887419 )
									ret := -0.166667
								if( ema12 > 0.887419 )
									ret := -0.923077 // sell
							if( smoothD_d > 32.9414 )
								if( rsi1 <= 91.2892 )
									ret := -0.047646
								if( rsi1 > 91.2892 )
									ret := 0.703704 // buy
	if( d_k > -2.07599 )
		if( ema2 <= 220.188 )
			if( rsi1 <= 22.9394 )
				if( ema1 <= 183.511 )
					if( ema3 <= 116.307 )
						if( tema <= 13.7545 )
							if( d_k <= 8.67322 )
								if( ema13 <= -0.164839 )
									ret := -0.090909
								if( ema13 > -0.164839 )
									ret := 0.464000
							if( d_k > 8.67322 )
								if( ema1 <= 11.4327 )
									ret := 0.272727
								if( ema1 > 11.4327 )
									ret := 0.877551 // buy
						if( tema > 13.7545 )
							if( ema13 <= -1.21898 )
								if( ema3 <= 60.7569 )
									ret := 0.109649
								if( ema3 > 60.7569 )
									ret := 0.398243
							if( ema13 > -1.21898 )
								if( rsi1 <= 11.6144 )
									ret := 0.412429
								if( rsi1 > 11.6144 )
									ret := 0.088413
					if( ema3 > 116.307 )
						if( ema2 <= 132.245 )
							if( k <= 10.2853 )
								if( rsi1 <= 10.5642 )
									ret := 0.666667
								if( rsi1 > 10.5642 )
									ret := -0.727273 // sell
							if( k > 10.2853 )
								if( ema12 <= -1.26556 )
									ret := 0.882353 // buy
								if( ema12 > -1.26556 )
									ret := 0.166667
						if( ema2 > 132.245 )
							if( ema13 <= -1.99793 )
								if( smoothK_k <= -2.62431 )
									ret := -0.744681 // sell
								if( smoothK_k > -2.62431 )
									ret := -0.128713
							if( ema13 > -1.99793 )
								if( smoothK_k <= 26.3735 )
									ret := 0.539877
								if( smoothK_k > 26.3735 )
									ret := -0.363636
				if( ema1 > 183.511 )
					if( ema1 <= 207.465 )
						if( d <= 20.7487 )
							if( rsi1 <= 19.4635 )
								if( k <= 1.45019 )
									ret := 0.898990 // buy
								if( k > 1.45019 )
									ret := 0.678571
							if( rsi1 > 19.4635 )
								if( ema3 <= 189.918 )
									ret := 1.000000 // buy
								if( ema3 > 189.918 )
									ret := 0.254237
						if( d > 20.7487 )
							if( smoothK_k <= 29.5884 )
								ret := -0.266667
							if( smoothK_k > 29.5884 )
								ret := 0.555556
					if( ema1 > 207.465 )
						if( ema2 <= 215.969 )
							if( ema3 <= 212.307 )
								ret := -0.750000 // sell
							if( ema3 > 212.307 )
								if( tema <= 208.38 )
									ret := -0.611111
								if( tema > 208.38 )
									ret := 0.000000
						if( ema2 > 215.969 )
							if( d_k <= 0.023875 )
								ret := -0.333333
							if( d_k > 0.023875 )
								if( tema <= 213.08 )
									ret := 0.545455
								if( tema > 213.08 )
									ret := 0.891892 // buy
			if( rsi1 > 22.9394 )
				if( rsi1 <= 55.8404 )
					if( ema13 <= -0.416867 )
						if( smoothD_d <= -2.56878 )
							if( ema1 <= 56.3382 )
								if( ema13 <= -0.634892 )
									ret := -0.965517 // sell
								if( ema13 > -0.634892 )
									ret := -0.090909
							if( ema1 > 56.3382 )
								if( ema13 <= -1.35764 )
									ret := -0.428571
								if( ema13 > -1.35764 )
									ret := 0.078125
						if( smoothD_d > -2.56878 )
							if( ema2 <= 219.184 )
								if( rsi1 <= 29.9823 )
									ret := 0.045912
								if( rsi1 > 29.9823 )
									ret := -0.057078
							if( ema2 > 219.184 )
								if( rsi1 <= 41.5345 )
									ret := 0.452381
								if( rsi1 > 41.5345 )
									ret := 0.900000 // buy
					if( ema13 > -0.416867 )
						if( d <= 45.5925 )
							if( k <= 2.64387 )
								if( ema2 <= 43.1589 )
									ret := 0.028226
								if( ema2 > 43.1589 )
									ret := 0.169716
							if( k > 2.64387 )
								if( tema <= 218.805 )
									ret := 0.011565
								if( tema > 218.805 )
									ret := -0.525424
						if( d > 45.5925 )
							if( tema <= 210.268 )
								if( tema <= 195.737 )
									ret := 0.095939
								if( tema > 195.737 )
									ret := -0.184848
							if( tema > 210.268 )
								if( k <= 27.1733 )
									ret := -0.818182 // sell
								if( k > 27.1733 )
									ret := 0.613445
				if( rsi1 > 55.8404 )
					if( ema3 <= 108.136 )
						if( ema1 <= 100.689 )
							if( ema13 <= 2.92189 )
								if( smoothD_d <= 96.0134 )
									ret := -0.008325
								if( smoothD_d > 96.0134 )
									ret := -0.172257
							if( ema13 > 2.92189 )
								if( d_k <= 1.16619 )
									ret := 0.745098 // buy
								if( d_k > 1.16619 )
									ret := 0.219512
						if( ema1 > 100.689 )
							if( ema3 <= 101.955 )
								if( tema <= 101.478 )
									ret := 0.166667
								if( tema > 101.478 )
									ret := -0.576512
							if( ema3 > 101.955 )
								if( smoothK_k <= 94.728 )
									ret := -0.047896
								if( smoothK_k > 94.728 )
									ret := -0.460993
					if( ema3 > 108.136 )
						if( ema1 <= 212.692 )
							if( smoothD_d <= 81.5588 )
								if( tema <= 113.594 )
									ret := 0.422053
								if( tema > 113.594 )
									ret := -0.040532
							if( smoothD_d > 81.5588 )
								if( tema <= 198.227 )
									ret := 0.098575
								if( tema > 198.227 )
									ret := 0.429084
						if( ema1 > 212.692 )
							if( ema12 <= 2.17448 )
								if( ema3 <= 214.09 )
									ret := -0.305732
								if( ema3 > 214.09 )
									ret := 0.000000
							if( ema12 > 2.17448 )
								if( k <= 85.2666 )
									ret := 0.000000
								if( k > 85.2666 )
									ret := -0.868421 // sell
		if( ema2 > 220.188 )
			if( smoothD_d <= 95.311 )
				if( rsi1 <= 10.6686 )
					ret := 0.842105 // buy
				if( rsi1 > 10.6686 )
					if( ema12 <= -0.543537 )
						if( smoothD_d <= 56.6902 )
							if( ema2 <= 295.673 )
								if( ema3 <= 222.535 )
									ret := 0.226415
								if( ema3 > 222.535 )
									ret := -0.403279
							if( ema2 > 295.673 )
								ret := 0.647059
						if( smoothD_d > 56.6902 )
							if( smoothD_d <= 76.3073 )
								if( ema12 <= -0.854431 )
									ret := 0.760000 // buy
								if( ema12 > -0.854431 )
									ret := 0.161290
							if( smoothD_d > 76.3073 )
								if( smoothD_d <= 85.8172 )
									ret := -0.461538
								if( smoothD_d > 85.8172 )
									ret := -0.636364
					if( ema12 > -0.543537 )
						if( ema13 <= -0.804494 )
							if( ema13 <= -0.882328 )
								if( d_k <= 4.47548 )
									ret := -0.461538
								if( d_k > 4.47548 )
									ret := 0.724138 // buy
							if( ema13 > -0.882328 )
								if( ema13 <= -0.831068 )
									ret := 0.857143 // buy
								if( ema13 > -0.831068 )
									ret := 0.636364
						if( ema13 > -0.804494 )
							if( rsi1 <= 43.1934 )
								if( d_k <= 16.2009 )
									ret := -0.441989
								if( d_k > 16.2009 )
									ret := 0.294118
							if( rsi1 > 43.1934 )
								if( ema2 <= 290.808 )
									ret := -0.080721
								if( ema2 > 290.808 )
									ret := -0.666667
			if( smoothD_d > 95.311 )
				if( d <= 99.031 )
					if( d <= 98.4613 )
						ret := 1.000000 // buy
					if( d > 98.4613 )
						if( ema3 <= 246.296 )
							ret := 0.000000
						if( ema3 > 246.296 )
							if( ema12 <= 2.95742 )
								ret := 1.000000 // buy
							if( ema12 > 2.95742 )
								ret := 0.692308
				if( d > 99.031 )
					if( ema13 <= 2.65341 )
						if( tema <= 233.243 )
							ret := 0.166667
						if( tema > 233.243 )
							ret := -0.636364
					if( ema13 > 2.65341 )
						ret := 0.117647
	
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
float op_operation = decision_tree_0_ETSY_15Min_83c1534f(d, d_k, smoothK_k, k, rsi1, smoothD_d, ema12, ema3, ema13, tema, ema1, ema2)

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


