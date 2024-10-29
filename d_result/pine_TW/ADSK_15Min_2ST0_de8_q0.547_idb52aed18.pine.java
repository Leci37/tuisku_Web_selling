//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Triple_EMA
// ID_model: ADSK_15Min_2ST0_b52aed18 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ADSK_15Min_2ST0_b52aed18", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ADSK_15Min_b52aed18(rsi1, smoothK_k, d_k, k, d, smoothD_d, ema3, tema, ema2, ema12, ema13, ema1)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( ema3 <= 198.755 )
		if( rsi1 <= 34.9792 )
			if( d <= 85.2071 )
				if( ema12 <= -3.52817 )
					if( tema <= 153.923 )
						if( ema13 <= -7.93819 )
							if( tema <= 129.592 )
								ret := 1.000000 // buy
							if( tema > 129.592 )
								ret := 0.888889 // buy
						if( ema13 > -7.93819 )
							ret := 0.473684
					if( tema > 153.923 )
						ret := 1.000000 // buy
				if( ema12 > -3.52817 )
					if( ema1 <= 135.9 )
						if( d_k <= 0.445709 )
							if( ema13 <= -1.77711 )
								if( k <= 0.115734 )
									ret := -0.902439 // sell
								if( k > 0.115734 )
									ret := -0.217712
							if( ema13 > -1.77711 )
								if( rsi1 <= 7.21114 )
									ret := 0.964286 // buy
								if( rsi1 > 7.21114 )
									ret := -0.012384
						if( d_k > 0.445709 )
							if( ema12 <= -0.310708 )
								if( ema13 <= -1.13236 )
									ret := 0.422170
								if( ema13 > -1.13236 )
									ret := 0.136480
							if( ema12 > -0.310708 )
								if( tema <= 81.1556 )
									ret := -0.411765
								if( tema > 81.1556 )
									ret := -0.027972
					if( ema1 > 135.9 )
						if( ema3 <= 140.714 )
							if( d <= 31.0663 )
								if( d <= 7.77171 )
									ret := 0.338583
								if( d > 7.77171 )
									ret := -0.050000
							if( d > 31.0663 )
								if( d_k <= -11.4618 )
									ret := 0.272727
								if( d_k > -11.4618 )
									ret := 0.866071 // buy
						if( ema3 > 140.714 )
							if( smoothD_d <= -2.50972 )
								if( ema2 <= 182.006 )
									ret := 0.370079
								if( ema2 > 182.006 )
									ret := 0.735294 // buy
							if( smoothD_d > -2.50972 )
								if( ema1 <= 144.2 )
									ret := -0.163009
								if( ema1 > 144.2 )
									ret := 0.163192
			if( d > 85.2071 )
				if( ema13 <= -0.912766 )
					if( k <= 93.6956 )
						if( ema3 <= 149.769 )
							ret := -0.333333
						if( ema3 > 149.769 )
							if( smoothD_d <= 83.4322 )
								ret := -1.000000 // sell
							if( smoothD_d > 83.4322 )
								if( smoothK_k <= 82.3952 )
									ret := -0.541667
								if( smoothK_k > 82.3952 )
									ret := -0.930233 // sell
					if( k > 93.6956 )
						if( ema2 <= 108.023 )
							ret := -1.000000 // sell
						if( ema2 > 108.023 )
							if( d <= 95.3678 )
								if( smoothK_k <= 92.4637 )
									ret := -0.181818
								if( smoothK_k > 92.4637 )
									ret := -0.600000
							if( d > 95.3678 )
								ret := 0.200000
				if( ema13 > -0.912766 )
					if( rsi1 <= 32.9025 )
						ret := -0.230769
					if( rsi1 > 32.9025 )
						ret := 0.833333 // buy
		if( rsi1 > 34.9792 )
			if( d <= 47.528 )
				if( rsi1 <= 49.1763 )
					if( tema <= 194.496 )
						if( ema13 <= 0.255781 )
							if( d <= 9.6074 )
								if( d <= 0.300122 )
									ret := 0.289855
								if( d > 0.300122 )
									ret := -0.208209
							if( d > 9.6074 )
								if( k <= 4.91869 )
									ret := -0.284830
								if( k > 4.91869 )
									ret := 0.014929
						if( ema13 > 0.255781 )
							if( ema2 <= 159.197 )
								if( ema12 <= 0.414091 )
									ret := 0.085603
								if( ema12 > 0.414091 )
									ret := -0.916667 // sell
							if( ema2 > 159.197 )
								if( smoothD_d <= 6.77978 )
									ret := 0.632653
								if( smoothD_d > 6.77978 )
									ret := 0.058442
					if( tema > 194.496 )
						if( smoothK_k <= 14.0809 )
							if( ema3 <= 196.976 )
								if( tema <= 195.134 )
									ret := 0.289474
								if( tema > 195.134 )
									ret := -0.338028
							if( ema3 > 196.976 )
								if( ema12 <= -0.360467 )
									ret := 0.823529 // buy
								if( ema12 > -0.360467 )
									ret := 0.269231
						if( smoothK_k > 14.0809 )
							if( ema3 <= 194.987 )
								ret := -0.272727
							if( ema3 > 194.987 )
								if( k <= 51.3235 )
									ret := 0.637584
								if( k > 51.3235 )
									ret := -0.461538
				if( rsi1 > 49.1763 )
					if( ema1 <= 198.1 )
						if( rsi1 <= 61.4559 )
							if( ema12 <= 0.308736 )
								if( ema1 <= 78.6546 )
									ret := 0.333333
								if( ema1 > 78.6546 )
									ret := -0.168809
							if( ema12 > 0.308736 )
								if( rsi1 <= 59.3026 )
									ret := 0.177986
								if( rsi1 > 59.3026 )
									ret := -0.201299
						if( rsi1 > 61.4559 )
							if( smoothD_d <= 40.1671 )
								if( ema13 <= 3.49336 )
									ret := 0.028334
								if( ema13 > 3.49336 )
									ret := -0.904762 // sell
							if( smoothD_d > 40.1671 )
								if( ema13 <= 0.111764 )
									ret := 0.692308
								if( ema13 > 0.111764 )
									ret := -0.302632
					if( ema1 > 198.1 )
						if( ema13 <= 1.71195 )
							if( ema12 <= 0.245426 )
								if( k <= 22.5329 )
									ret := 0.652174
								if( k > 22.5329 )
									ret := -0.666667
							if( ema12 > 0.245426 )
								if( smoothD_d <= 5.32828 )
									ret := 0.900000 // buy
								if( smoothD_d > 5.32828 )
									ret := 0.520408
						if( ema13 > 1.71195 )
							if( k <= 25.8298 )
								ret := -0.266667
							if( k > 25.8298 )
								ret := 0.166667
			if( d > 47.528 )
				if( ema13 <= 1.47181 )
					if( ema1 <= 194.537 )
						if( ema2 <= 191.249 )
							if( ema1 <= 190.216 )
								if( k <= 95.9958 )
									ret := 0.058181
								if( k > 95.9958 )
									ret := -0.050821
							if( ema1 > 190.216 )
								if( smoothK_k <= 93.8132 )
									ret := -0.194969
								if( smoothK_k > 93.8132 )
									ret := -0.721519 // sell
						if( ema2 > 191.249 )
							if( ema12 <= -0.255565 )
								if( smoothD_d <= 53.183 )
									ret := 1.000000 // buy
								if( smoothD_d > 53.183 )
									ret := -0.158273
							if( ema12 > -0.255565 )
								if( rsi1 <= 64.1842 )
									ret := 0.526316
								if( rsi1 > 64.1842 )
									ret := 0.220588
					if( ema1 > 194.537 )
						if( smoothD_d <= 67.3315 )
							if( d_k <= -0.853083 )
								if( k <= 63.0955 )
									ret := -0.584906
								if( k > 63.0955 )
									ret := 0.207729
							if( d_k > -0.853083 )
								if( tema <= 195.33 )
									ret := 0.736842 // buy
								if( tema > 195.33 )
									ret := 0.116402
						if( smoothD_d > 67.3315 )
							if( d <= 82.8315 )
								if( ema1 <= 196.535 )
									ret := -0.565789
								if( ema1 > 196.535 )
									ret := -0.101796
							if( d > 82.8315 )
								if( tema <= 199.448 )
									ret := -0.153710
								if( tema > 199.448 )
									ret := 0.400000
				if( ema13 > 1.47181 )
					if( ema13 <= 4.50638 )
						if( tema <= 79.1482 )
							ret := -0.625000
						if( tema > 79.1482 )
							if( tema <= 110.222 )
								if( ema13 <= 2.28423 )
									ret := 0.833333 // buy
								if( ema13 > 2.28423 )
									ret := 1.000000 // buy
							if( tema > 110.222 )
								if( smoothK_k <= 95.5165 )
									ret := 0.133896
								if( smoothK_k > 95.5165 )
									ret := 0.317254
					if( ema13 > 4.50638 )
						if( rsi1 <= 89.5063 )
							if( tema <= 133.12 )
								ret := 0.533333
							if( tema > 133.12 )
								if( ema12 <= 2.84717 )
									ret := -0.840000 // sell
								if( ema12 > 2.84717 )
									ret := 0.045455
						if( rsi1 > 89.5063 )
							if( ema1 <= 158.738 )
								ret := -0.461538
							if( ema1 > 158.738 )
								ret := -0.954545 // sell
	if( ema3 > 198.755 )
		if( ema12 <= -0.674377 )
			if( ema1 <= 264.369 )
				if( k <= 0.000704 )
					if( rsi1 <= 8.34402 )
						if( ema13 <= -3.57009 )
							ret := 1.000000 // buy
						if( ema13 > -3.57009 )
							if( tema <= 203.475 )
								ret := 0.700000 // buy
							if( tema > 203.475 )
								ret := 0.272727
					if( rsi1 > 8.34402 )
						if( ema3 <= 202.962 )
							if( ema3 <= 202.345 )
								ret := 0.363636
							if( ema3 > 202.345 )
								ret := 0.866667 // buy
						if( ema3 > 202.962 )
							if( d <= 3.40919 )
								if( d <= 1.13128 )
									ret := 0.146552
								if( d > 1.13128 )
									ret := -0.508772
							if( d > 3.40919 )
								if( ema2 <= 246.832 )
									ret := 0.378378
								if( ema2 > 246.832 )
									ret := 0.700000 // buy
				if( k > 0.000704 )
					if( ema1 <= 255.005 )
						if( tema <= 245.963 )
							if( d <= 87.9789 )
								if( ema1 <= 198.049 )
									ret := 0.078534
								if( ema1 > 198.049 )
									ret := -0.188688
							if( d > 87.9789 )
								if( ema2 <= 244.271 )
									ret := 0.525641
								if( ema2 > 244.271 )
									ret := -0.928571 // sell
						if( tema > 245.963 )
							if( ema13 <= -2.90738 )
								if( ema3 <= 258.56 )
									ret := -0.504762
								if( ema3 > 258.56 )
									ret := 0.800000 // buy
							if( ema13 > -2.90738 )
								if( tema <= 246.972 )
									ret := 0.688525
								if( tema > 246.972 )
									ret := 0.186508
					if( ema1 > 255.005 )
						if( rsi1 <= 20.7931 )
							if( tema <= 252.299 )
								ret := 1.000000 // buy
							if( tema > 252.299 )
								if( d <= 2.90909 )
									ret := 0.526316
								if( d > 2.90909 )
									ret := 0.025000
						if( rsi1 > 20.7931 )
							if( d <= 9.87621 )
								if( d <= 6.9484 )
									ret := -0.495413
								if( d > 6.9484 )
									ret := 0.482759
							if( d > 9.87621 )
								if( ema2 <= 260.564 )
									ret := -0.738220 // sell
								if( ema2 > 260.564 )
									ret := -0.394366
			if( ema1 > 264.369 )
				if( rsi1 <= 32.1735 )
					if( k <= 8.27687 )
						if( rsi1 <= 21.7077 )
							if( rsi1 <= 17.7839 )
								if( tema <= 282.248 )
									ret := 0.170886
								if( tema > 282.248 )
									ret := -0.490566
							if( rsi1 > 17.7839 )
								if( ema3 <= 274.788 )
									ret := 0.850000 // buy
								if( ema3 > 274.788 )
									ret := 0.035211
						if( rsi1 > 21.7077 )
							if( rsi1 <= 29.4297 )
								if( d <= 3.24573 )
									ret := -0.217391
								if( d > 3.24573 )
									ret := -0.601227
							if( rsi1 > 29.4297 )
								if( ema12 <= -0.871794 )
									ret := 0.290909
								if( ema12 > -0.871794 )
									ret := -0.450000
					if( k > 8.27687 )
						if( ema3 <= 274.192 )
							if( smoothD_d <= 5.75642 )
								ret := 0.454545
							if( smoothD_d > 5.75642 )
								if( d_k <= -7.06052 )
									ret := 0.722222 // buy
								if( d_k > -7.06052 )
									ret := 0.936937 // buy
						if( ema3 > 274.192 )
							if( d <= 40.3365 )
								if( ema1 <= 320.384 )
									ret := 0.301181
								if( ema1 > 320.384 )
									ret := -0.333333
							if( d > 40.3365 )
								if( ema2 <= 286.359 )
									ret := 0.421875
								if( ema2 > 286.359 )
									ret := -0.252252
				if( rsi1 > 32.1735 )
					if( smoothK_k <= 79.2974 )
						if( rsi1 <= 40.9799 )
							if( d <= 5.19545 )
								if( d <= 3.53134 )
									ret := -0.238095
								if( d > 3.53134 )
									ret := 0.620690
							if( d > 5.19545 )
								if( ema12 <= -1.46865 )
									ret := 0.159091
								if( ema12 > -1.46865 )
									ret := -0.355460
						if( rsi1 > 40.9799 )
							if( smoothK_k <= 54.5721 )
								if( d_k <= 12.3147 )
									ret := 0.301887
								if( d_k > 12.3147 )
									ret := 0.821429 // buy
							if( smoothK_k > 54.5721 )
								if( smoothK_k <= 58.0005 )
									ret := -1.000000 // sell
								if( smoothK_k > 58.0005 )
									ret := -0.378378
					if( smoothK_k > 79.2974 )
						if( ema2 <= 281.245 )
							if( smoothD_d <= 74.2944 )
								ret := -0.333333
							if( smoothD_d > 74.2944 )
								if( smoothD_d <= 79.0619 )
									ret := 0.909091 // buy
								if( smoothD_d > 79.0619 )
									ret := 0.545455
						if( ema2 > 281.245 )
							if( d_k <= 0.080097 )
								if( smoothD_d <= 68.3611 )
									ret := -0.545455
								if( smoothD_d > 68.3611 )
									ret := -0.901408 // sell
							if( d_k > 0.080097 )
								if( d <= 98.0821 )
									ret := -0.882353 // sell
								if( d > 98.0821 )
									ret := 0.555556
		if( ema12 > -0.674377 )
			if( tema <= 208.778 )
				if( ema1 <= 199.568 )
					if( d <= 58.8917 )
						if( ema13 <= 0.109901 )
							if( smoothK_k <= 7.25127 )
								if( smoothK_k <= -1.18582 )
									ret := 0.272727
								if( smoothK_k > -1.18582 )
									ret := -0.881356 // sell
							if( smoothK_k > 7.25127 )
								if( smoothD_d <= 17.3302 )
									ret := 0.470588
								if( smoothD_d > 17.3302 )
									ret := -0.145299
						if( ema13 > 0.109901 )
							if( smoothD_d <= 16.7413 )
								if( d <= 12.9257 )
									ret := 0.444444
								if( d > 12.9257 )
									ret := 1.000000 // buy
							if( smoothD_d > 16.7413 )
								ret := 0.277778
					if( d > 58.8917 )
						if( d <= 94.2681 )
							if( smoothD_d <= 78.3869 )
								if( rsi1 <= 43.6135 )
									ret := -0.723404 // sell
								if( rsi1 > 43.6135 )
									ret := 0.000000
							if( smoothD_d > 78.3869 )
								if( smoothD_d <= 85.784 )
									ret := -1.000000 // sell
								if( smoothD_d > 85.784 )
									ret := -0.781250 // sell
						if( d > 94.2681 )
							if( d_k <= 1.38083 )
								if( k <= 98.2876 )
									ret := -1.000000 // sell
								if( k > 98.2876 )
									ret := -0.461538
							if( d_k > 1.38083 )
								ret := 0.739130 // buy
				if( ema1 > 199.568 )
					if( ema12 <= -0.6073 )
						if( ema2 <= 200.777 )
							ret := -0.187500
						if( ema2 > 200.777 )
							if( ema13 <= -1.43382 )
								if( rsi1 <= 34.0827 )
									ret := 0.153846
								if( rsi1 > 34.0827 )
									ret := 0.913043 // buy
							if( ema13 > -1.43382 )
								if( k <= 19.8733 )
									ret := 0.540984
								if( k > 19.8733 )
									ret := -0.022222
					if( ema12 > -0.6073 )
						if( smoothD_d <= 95.4816 )
							if( d <= 31.2828 )
								if( k <= 14.3886 )
									ret := -0.147771
								if( k > 14.3886 )
									ret := 0.166667
							if( d > 31.2828 )
								if( d_k <= 21.3973 )
									ret := -0.132321
								if( d_k > 21.3973 )
									ret := 0.362745
						if( smoothD_d > 95.4816 )
							if( ema3 <= 204.365 )
								if( smoothK_k <= 93.9078 )
									ret := -1.000000 // sell
								if( smoothK_k > 93.9078 )
									ret := -0.054688
							if( ema3 > 204.365 )
								if( tema <= 206.678 )
									ret := -0.333333
								if( tema > 206.678 )
									ret := -0.822917 // sell
			if( tema > 208.778 )
				if( k <= 31.3437 )
					if( ema3 <= 235.981 )
						if( ema1 <= 231.097 )
							if( ema1 <= 213.768 )
								if( k <= 14.9544 )
									ret := 0.420495
								if( k > 14.9544 )
									ret := 0.063830
							if( ema1 > 213.768 )
								if( rsi1 <= 42.566 )
									ret := 0.118949
								if( rsi1 > 42.566 )
									ret := -0.144309
						if( ema1 > 231.097 )
							if( ema3 <= 229.763 )
								ret := -0.600000
							if( ema3 > 229.763 )
								if( tema <= 231.679 )
									ret := 0.866667 // buy
								if( tema > 231.679 )
									ret := 0.519380
					if( ema3 > 235.981 )
						if( ema1 <= 236.383 )
							ret := -1.000000 // sell
						if( ema1 > 236.383 )
							if( ema3 <= 284.035 )
								if( ema1 <= 277.674 )
									ret := 0.026564
								if( ema1 > 277.674 )
									ret := -0.326754
							if( ema3 > 284.035 )
								if( d <= 1.50753 )
									ret := -0.459770
								if( d > 1.50753 )
									ret := 0.115183
				if( k > 31.3437 )
					if( k <= 32.236 )
						if( ema13 <= -0.657137 )
							if( d <= 36.4838 )
								ret := -0.823529 // sell
							if( d > 36.4838 )
								ret := -1.000000 // sell
						if( ema13 > -0.657137 )
							if( d_k <= -13.4759 )
								ret := -1.000000 // sell
							if( d_k > -13.4759 )
								if( d_k <= -7.13866 )
									ret := 0.333333
								if( d_k > -7.13866 )
									ret := -0.434426
					if( k > 32.236 )
						if( rsi1 <= 42.6934 )
							if( ema12 <= -0.501722 )
								if( ema2 <= 216.103 )
									ret := -0.383178
								if( ema2 > 216.103 )
									ret := -0.063725
							if( ema12 > -0.501722 )
								if( ema2 <= 283.428 )
									ret := 0.099740
								if( ema2 > 283.428 )
									ret := 0.425781
						if( rsi1 > 42.6934 )
							if( d <= 19.3754 )
								if( ema3 <= 228.931 )
									ret := -0.895833 // sell
								if( ema3 > 228.931 )
									ret := -0.255556
							if( d > 19.3754 )
								if( ema2 <= 288.328 )
									ret := -0.005165
								if( ema2 > 288.328 )
									ret := -0.117277
	
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
float op_operation = decision_tree_0_ADSK_15Min_b52aed18(rsi1, smoothK_k, d_k, k, d, smoothD_d, ema3, tema, ema2, ema12, ema13, ema1)

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


