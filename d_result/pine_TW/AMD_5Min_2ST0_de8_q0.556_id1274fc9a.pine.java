//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Triple_EMA
// ID_model: AMD_5Min_2ST0_1274fc9a Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AMD_5Min_2ST0_1274fc9a", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AMD_5Min_1274fc9a(rsi1, smoothK_k, d_k, k, d, smoothD_d, ema3, tema, ema2, ema12, ema13, ema1)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ema3 <= 178.837 )
		if( ema12 <= -1.36035 )
			if( ema2 <= 167.975 )
				if( ema1 <= 160.11 )
					if( d <= 1.47609 )
						if( ema2 <= 156.296 )
							if( d_k <= -3.9e-05 )
								if( ema3 <= 130.704 )
									ret := 1.000000 // buy
								if( ema3 > 130.704 )
									ret := 0.750000 // buy
							if( d_k > -3.9e-05 )
								if( ema13 <= -3.02655 )
									ret := 1.000000 // buy
								if( ema13 > -3.02655 )
									ret := -0.428571
						if( ema2 > 156.296 )
							ret := -0.666667
					if( d > 1.47609 )
						if( d <= 44.8362 )
							if( rsi1 <= 25.5101 )
								if( smoothD_d <= 13.5299 )
									ret := -0.600000
								if( smoothD_d > 13.5299 )
									ret := 0.600000
							if( rsi1 > 25.5101 )
								if( d <= 25.4756 )
									ret := -0.500000
								if( d > 25.4756 )
									ret := -1.000000 // sell
						if( d > 44.8362 )
							ret := 0.833333 // buy
				if( ema1 > 160.11 )
					if( ema13 <= -2.6346 )
						if( ema12 <= -1.81066 )
							if( tema <= 161.032 )
								if( ema1 <= 162.8 )
									ret := 0.750000 // buy
								if( ema1 > 162.8 )
									ret := 1.000000 // buy
							if( tema > 161.032 )
								if( ema3 <= 168.727 )
									ret := -1.000000 // sell
								if( ema3 > 168.727 )
									ret := -0.500000
						if( ema12 > -1.81066 )
							if( ema12 <= -1.4586 )
								ret := 1.000000 // buy
							if( ema12 > -1.4586 )
								ret := 0.750000 // buy
					if( ema13 > -2.6346 )
						ret := -0.800000 // sell
			if( ema2 > 167.975 )
				if( rsi1 <= 9.59158 )
					if( smoothK_k <= -2.28075 )
						ret := 0.400000
					if( smoothK_k > -2.28075 )
						ret := -0.800000 // sell
				if( rsi1 > 9.59158 )
					if( d_k <= -10.4815 )
						if( ema1 <= 169.432 )
							ret := 0.750000 // buy
						if( ema1 > 169.432 )
							ret := -0.857143 // sell
					if( d_k > -10.4815 )
						if( ema13 <= -3.47475 )
							if( smoothK_k <= 78.2961 )
								ret := -0.500000
							if( smoothK_k > 78.2961 )
								ret := -0.833333 // sell
						if( ema13 > -3.47475 )
							if( d_k <= 4.5594 )
								if( rsi1 <= 14.8876 )
									ret := -0.916667 // sell
								if( rsi1 > 14.8876 )
									ret := -1.000000 // sell
							if( d_k > 4.5594 )
								ret := -0.750000 // sell
		if( ema12 > -1.36035 )
			if( ema13 <= 1.2895 )
				if( tema <= 174.668 )
					if( ema2 <= 167.171 )
						if( ema12 <= 0.058389 )
							if( d <= 1.84298 )
								if( ema13 <= -0.581588 )
									ret := 0.328221
								if( ema13 > -0.581588 )
									ret := 0.083051
							if( d > 1.84298 )
								if( d <= 6.52964 )
									ret := -0.049420
								if( d > 6.52964 )
									ret := 0.046355
						if( ema12 > 0.058389 )
							if( tema <= 164.307 )
								if( d <= 34.9076 )
									ret := 0.141316
								if( d > 34.9076 )
									ret := 0.059200
							if( tema > 164.307 )
								if( ema12 <= 0.45702 )
									ret := 0.267176
								if( ema12 > 0.45702 )
									ret := -0.072797
					if( ema2 > 167.171 )
						if( ema12 <= -0.825042 )
							if( rsi1 <= 22.7342 )
								if( ema1 <= 173.593 )
									ret := 0.025641
								if( ema1 > 173.593 )
									ret := -0.674419
							if( rsi1 > 22.7342 )
								if( ema3 <= 176.738 )
									ret := -0.847059 // sell
								if( ema3 > 176.738 )
									ret := 0.533333
						if( ema12 > -0.825042 )
							if( rsi1 <= 67.1088 )
								if( tema <= 170.082 )
									ret := 0.068287
								if( tema > 170.082 )
									ret := -0.040462
							if( rsi1 > 67.1088 )
								if( d_k <= -21.2583 )
									ret := 0.300000
								if( d_k > -21.2583 )
									ret := -0.233689
				if( tema > 174.668 )
					if( ema12 <= -0.105774 )
						if( rsi1 <= 8.33308 )
							if( ema13 <= -0.882986 )
								ret := -0.250000
							if( ema13 > -0.882986 )
								ret := -1.000000 // sell
						if( rsi1 > 8.33308 )
							if( ema1 <= 175.213 )
								if( smoothK_k <= 15.1388 )
									ret := -0.500000
								if( smoothK_k > 15.1388 )
									ret := 0.936170 // buy
							if( ema1 > 175.213 )
								if( ema13 <= -0.189946 )
									ret := 0.338286
								if( ema13 > -0.189946 )
									ret := -0.148649
					if( ema12 > -0.105774 )
						if( ema2 <= 174.901 )
							if( d_k <= 8.1199 )
								if( rsi1 <= 80.1901 )
									ret := 0.425926
								if( rsi1 > 80.1901 )
									ret := -0.750000 // sell
							if( d_k > 8.1199 )
								if( d <= 88.5476 )
									ret := 0.000000
								if( d > 88.5476 )
									ret := -1.000000 // sell
						if( ema2 > 174.901 )
							if( smoothD_d <= 7.27296 )
								if( ema13 <= -0.036801 )
									ret := -0.015152
								if( ema13 > -0.036801 )
									ret := 0.500000
							if( smoothD_d > 7.27296 )
								if( ema12 <= 0.633759 )
									ret := 0.016644
								if( ema12 > 0.633759 )
									ret := 0.590909
			if( ema13 > 1.2895 )
				if( ema3 <= 171.254 )
					if( ema1 <= 164.199 )
						if( ema3 <= 123.102 )
							if( tema <= 105.992 )
								if( smoothK_k <= 59.9225 )
									ret := -0.258065
								if( smoothK_k > 59.9225 )
									ret := 0.791667 // buy
							if( tema > 105.992 )
								if( ema1 <= 118.519 )
									ret := -0.076190
								if( ema1 > 118.519 )
									ret := -0.546667
						if( ema3 > 123.102 )
							if( ema13 <= 1.95799 )
								if( ema2 <= 159.56 )
									ret := 0.156915
								if( ema2 > 159.56 )
									ret := 0.627451
							if( ema13 > 1.95799 )
								if( smoothD_d <= 96.8574 )
									ret := 0.696629
								if( smoothD_d > 96.8574 )
									ret := -0.444444
					if( ema1 > 164.199 )
						if( d_k <= -1.83727 )
							if( tema <= 166.302 )
								if( d_k <= -14.0979 )
									ret := 0.750000 // buy
								if( d_k > -14.0979 )
									ret := 0.000000
							if( tema > 166.302 )
								if( d_k <= -5.88467 )
									ret := -0.913043 // sell
								if( d_k > -5.88467 )
									ret := -0.578947
						if( d_k > -1.83727 )
							if( ema3 <= 163.679 )
								if( rsi1 <= 71.2604 )
									ret := 0.000000
								if( rsi1 > 71.2604 )
									ret := -0.805556 // sell
							if( ema3 > 163.679 )
								if( ema13 <= 2.93203 )
									ret := 0.220430
								if( ema13 > 2.93203 )
									ret := -1.000000 // sell
				if( ema3 > 171.254 )
					if( smoothD_d <= 72.1927 )
						if( d_k <= -3.07925 )
							ret := 0.400000
						if( d_k > -3.07925 )
							if( smoothK_k <= 6.8444 )
								ret := 0.500000
							if( smoothK_k > 6.8444 )
								if( ema1 <= 177.196 )
									ret := 0.769231 // buy
								if( ema1 > 177.196 )
									ret := 1.000000 // buy
					if( smoothD_d > 72.1927 )
						if( smoothD_d <= 86.5158 )
							if( rsi1 <= 68.6073 )
								if( ema3 <= 177.694 )
									ret := -0.888889 // sell
								if( ema3 > 177.694 )
									ret := -0.250000
							if( rsi1 > 68.6073 )
								if( d_k <= -0.600051 )
									ret := -0.300000
								if( d_k > -0.600051 )
									ret := 0.818182 // buy
						if( smoothD_d > 86.5158 )
							if( k <= 96.475 )
								if( ema3 <= 178.091 )
									ret := 0.927536 // buy
								if( ema3 > 178.091 )
									ret := 0.333333
							if( k > 96.475 )
								if( smoothK_k <= 95.8865 )
									ret := -0.733333 // sell
								if( smoothK_k > 95.8865 )
									ret := 0.640000
	if( ema3 > 178.837 )
		if( ema3 <= 183.083 )
			if( smoothD_d <= 75.0546 )
				if( rsi1 <= 26.1872 )
					if( ema1 <= 179.96 )
						if( rsi1 <= 10.6487 )
							if( k <= 0.197958 )
								ret := 1.000000 // buy
							if( k > 0.197958 )
								ret := 0.000000
						if( rsi1 > 10.6487 )
							if( ema13 <= -2.26166 )
								ret := 1.000000 // buy
							if( ema13 > -2.26166 )
								if( ema3 <= 180.723 )
									ret := -0.312977
								if( ema3 > 180.723 )
									ret := -0.774194 // sell
					if( ema1 > 179.96 )
						if( smoothD_d <= -1.90357 )
							if( rsi1 <= 12.516 )
								ret := 0.857143 // buy
							if( rsi1 > 12.516 )
								if( smoothD_d <= -2.69215 )
									ret := -0.142857
								if( smoothD_d > -2.69215 )
									ret := -0.800000 // sell
						if( smoothD_d > -1.90357 )
							if( ema3 <= 182.795 )
								if( rsi1 <= 14.7542 )
									ret := -0.250000
								if( rsi1 > 14.7542 )
									ret := 0.702703 // buy
							if( ema3 > 182.795 )
								if( ema13 <= -0.37808 )
									ret := -0.250000
								if( ema13 > -0.37808 )
									ret := 0.000000
				if( rsi1 > 26.1872 )
					if( ema12 <= -0.444923 )
						if( ema13 <= -1.80921 )
							if( smoothD_d <= 32.798 )
								if( ema12 <= -1.10202 )
									ret := 0.400000
								if( ema12 > -1.10202 )
									ret := -0.800000 // sell
							if( smoothD_d > 32.798 )
								ret := 0.500000
						if( ema13 > -1.80921 )
							if( rsi1 <= 32.924 )
								if( d_k <= -10.0929 )
									ret := -0.904762 // sell
								if( d_k > -10.0929 )
									ret := -0.338462
							if( rsi1 > 32.924 )
								if( d <= 7.27668 )
									ret := -0.500000
								if( d > 7.27668 )
									ret := -0.902778 // sell
					if( ema12 > -0.444923 )
						if( ema3 <= 181.461 )
							if( tema <= 178.507 )
								if( smoothD_d <= 27.8022 )
									ret := -0.800000 // sell
								if( smoothD_d > 27.8022 )
									ret := 0.285714
							if( tema > 178.507 )
								if( ema12 <= 0.520734 )
									ret := -0.159091
								if( ema12 > 0.520734 )
									ret := 0.180723
						if( ema3 > 181.461 )
							if( smoothK_k <= 74.1645 )
								if( ema13 <= 1.03133 )
									ret := -0.398148
								if( ema13 > 1.03133 )
									ret := -0.861111 // sell
							if( smoothK_k > 74.1645 )
								if( ema12 <= 0.140016 )
									ret := 0.576923
								if( ema12 > 0.140016 )
									ret := -0.888889 // sell
			if( smoothD_d > 75.0546 )
				if( rsi1 <= 66.1673 )
					if( ema2 <= 181.773 )
						if( ema13 <= -0.418164 )
							if( ema12 <= -0.190234 )
								if( d <= 81.2623 )
									ret := 0.333333
								if( d > 81.2623 )
									ret := 0.837838 // buy
							if( ema12 > -0.190234 )
								ret := 0.000000
						if( ema13 > -0.418164 )
							if( rsi1 <= 45.2048 )
								if( ema3 <= 179.628 )
									ret := -0.090909
								if( ema3 > 179.628 )
									ret := -0.566667
							if( rsi1 > 45.2048 )
								if( smoothK_k <= 86.6775 )
									ret := 0.443396
								if( smoothK_k > 86.6775 )
									ret := -0.094017
					if( ema2 > 181.773 )
						if( ema3 <= 182.091 )
							if( d_k <= -3.7344 )
								ret := 0.750000 // buy
							if( d_k > -3.7344 )
								ret := 1.000000 // buy
						if( ema3 > 182.091 )
							if( d_k <= 17.545 )
								if( ema13 <= -0.062452 )
									ret := 0.071429
								if( ema13 > -0.062452 )
									ret := 0.605263
							if( d_k > 17.545 )
								ret := -0.500000
				if( rsi1 > 66.1673 )
					if( ema2 <= 182.998 )
						if( tema <= 181.047 )
							if( d <= 92.1388 )
								if( ema12 <= 0.412371 )
									ret := -0.258065
								if( ema12 > 0.412371 )
									ret := 0.833333 // buy
							if( d > 92.1388 )
								if( rsi1 <= 68.8954 )
									ret := -1.000000 // sell
								if( rsi1 > 68.8954 )
									ret := -0.529412
						if( tema > 181.047 )
							if( ema12 <= 0.85628 )
								if( ema3 <= 179.928 )
									ret := 0.740741 // buy
								if( ema3 > 179.928 )
									ret := -0.005952
							if( ema12 > 0.85628 )
								if( d_k <= 0.732765 )
									ret := -1.000000 // sell
								if( d_k > 0.732765 )
									ret := -0.600000
					if( ema2 > 182.998 )
						if( ema13 <= 0.753081 )
							ret := -0.333333
						if( ema13 > 0.753081 )
							if( tema <= 185.198 )
								ret := -1.000000 // sell
							if( tema > 185.198 )
								ret := -0.750000 // sell
		if( ema3 > 183.083 )
			if( k <= 21.1679 )
				if( ema1 <= 211.774 )
					if( ema12 <= 0.060966 )
						if( ema3 <= 194.803 )
							if( d_k <= 5.77625 )
								if( d <= 2.96808 )
									ret := 0.184211
								if( d > 2.96808 )
									ret := -0.457143
							if( d_k > 5.77625 )
								if( ema12 <= -0.518478 )
									ret := -0.277778
								if( ema12 > -0.518478 )
									ret := 0.344828
						if( ema3 > 194.803 )
							if( ema3 <= 201.605 )
								if( ema3 <= 195.736 )
									ret := 0.000000
								if( ema3 > 195.736 )
									ret := 0.615385
							if( ema3 > 201.605 )
								if( smoothD_d <= 10.4922 )
									ret := 0.171717
								if( smoothD_d > 10.4922 )
									ret := -0.413043
					if( ema12 > 0.060966 )
						if( ema3 <= 200.149 )
							if( smoothK_k <= 9.84415 )
								if( ema2 <= 186.021 )
									ret := -0.428571
								if( ema2 > 186.021 )
									ret := 0.324324
							if( smoothK_k > 9.84415 )
								if( tema <= 185.721 )
									ret := -0.083333
								if( tema > 185.721 )
									ret := -0.645161
						if( ema3 > 200.149 )
							if( tema <= 203.433 )
								if( rsi1 <= 55.614 )
									ret := -0.750000 // sell
								if( rsi1 > 55.614 )
									ret := -1.000000 // sell
							if( tema > 203.433 )
								if( ema2 <= 206.816 )
									ret := -0.275862
								if( ema2 > 206.816 )
									ret := -0.750000 // sell
				if( ema1 > 211.774 )
					if( ema12 <= -2.68907 )
						ret := 0.500000
					if( ema12 > -2.68907 )
						if( ema1 <= 212.871 )
							if( ema3 <= 212.614 )
								if( d_k <= 1.40388 )
									ret := -0.300000
								if( d_k > 1.40388 )
									ret := -0.882353 // sell
							if( ema3 > 212.614 )
								ret := 0.400000
						if( ema1 > 212.871 )
							if( ema3 <= 217.684 )
								ret := -0.500000
							if( ema3 > 217.684 )
								ret := -1.000000 // sell
			if( k > 21.1679 )
				if( ema13 <= -0.349344 )
					if( ema2 <= 191.125 )
						if( ema1 <= 186.425 )
							if( rsi1 <= 35.475 )
								if( ema2 <= 186.321 )
									ret := 0.678571
								if( ema2 > 186.321 )
									ret := 0.000000
							if( rsi1 > 35.475 )
								if( ema1 <= 185.088 )
									ret := -0.400000
								if( ema1 > 185.088 )
									ret := 0.333333
						if( ema1 > 186.425 )
							if( smoothD_d <= 79.5351 )
								if( k <= 56.6055 )
									ret := -0.550000
								if( k > 56.6055 )
									ret := 0.500000
							if( smoothD_d > 79.5351 )
								if( d_k <= -1.14899 )
									ret := -0.625000
								if( d_k > -1.14899 )
									ret := -1.000000 // sell
					if( ema2 > 191.125 )
						if( ema3 <= 210.407 )
							if( d <= 18.9999 )
								if( ema12 <= -0.431644 )
									ret := -0.888889 // sell
								if( ema12 > -0.431644 )
									ret := 0.111111
							if( d > 18.9999 )
								if( d <= 86.0006 )
									ret := 0.695513
								if( d > 86.0006 )
									ret := 0.046512
						if( ema3 > 210.407 )
							if( rsi1 <= 36.7707 )
								if( smoothK_k <= 75.0567 )
									ret := 0.620690
								if( smoothK_k > 75.0567 )
									ret := -0.750000 // sell
							if( rsi1 > 36.7707 )
								if( d_k <= 0.201247 )
									ret := -0.694444
								if( d_k > 0.201247 )
									ret := 0.750000 // buy
				if( ema13 > -0.349344 )
					if( ema1 <= 212.899 )
						if( tema <= 212.167 )
							if( k <= 89.5096 )
								if( d <= 78.4463 )
									ret := 0.044304
								if( d > 78.4463 )
									ret := 0.337349
							if( k > 89.5096 )
								if( tema <= 203.886 )
									ret := -0.146982
								if( tema > 203.886 )
									ret := 0.162162
						if( tema > 212.167 )
							if( ema12 <= 0.453378 )
								if( d_k <= 1.20682 )
									ret := -0.060606
								if( d_k > 1.20682 )
									ret := -0.488889
							if( ema12 > 0.453378 )
								if( ema1 <= 212.365 )
									ret := -1.000000 // sell
								if( ema1 > 212.365 )
									ret := -0.500000
					if( ema1 > 212.899 )
						if( ema3 <= 215.575 )
							if( d_k <= 0.0713 )
								ret := 1.000000 // buy
							if( d_k > 0.0713 )
								ret := 0.666667
						if( ema3 > 215.575 )
							ret := -1.000000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
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
float op_operation = decision_tree_0_AMD_5Min_1274fc9a(rsi1, smoothK_k, d_k, k, d, smoothD_d, ema3, tema, ema2, ema12, ema13, ema1)

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


