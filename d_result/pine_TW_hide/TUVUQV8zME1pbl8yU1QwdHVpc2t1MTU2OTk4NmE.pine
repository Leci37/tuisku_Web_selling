//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Triple_EMA
// ID_model: META_30Min_2ST0_1569986a Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_META_30Min_2ST0_1569986a", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_META_30Min_1569986a(d, d_k, smoothK_k, k, rsi1, smoothD_d, ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( d_k <= -1.75623 )
		if( tema <= 168.138 )
			if( k <= 29.5548 )
				if( ema2 <= 167.154 )
					if( d_k <= -5.00172 )
						if( ema1 <= 130.776 )
							if( d_k <= -7.30987 )
								if( rsi1 <= 41.556 )
									ret := 0.282258
								if( rsi1 > 41.556 )
									ret := -0.017544
							if( d_k > -7.30987 )
								if( smoothD_d <= 10.9622 )
									ret := 0.006623
								if( smoothD_d > 10.9622 )
									ret := -0.328244
						if( ema1 > 130.776 )
							if( rsi1 <= 27.1119 )
								if( ema1 <= 137.563 )
									ret := 0.700000 // buy
								if( ema1 > 137.563 )
									ret := -0.062500
							if( rsi1 > 27.1119 )
								if( ema3 <= 134.978 )
									ret := -0.644737
								if( ema3 > 134.978 )
									ret := -0.237603
					if( d_k > -5.00172 )
						if( ema12 <= -1.81501 )
							if( d_k <= -2.65706 )
								ret := -1.000000 // sell
							if( d_k > -2.65706 )
								ret := -0.500000
						if( ema12 > -1.81501 )
							if( ema2 <= 95.4694 )
								if( ema3 <= 94.2959 )
									ret := 1.000000 // buy
								if( ema3 > 94.2959 )
									ret := 0.500000
							if( ema2 > 95.4694 )
								if( ema2 <= 97.8109 )
									ret := -0.617647
								if( ema2 > 97.8109 )
									ret := 0.049261
				if( ema2 > 167.154 )
					if( d_k <= -5.22086 )
						if( d <= 6.67206 )
							if( ema13 <= 0.048957 )
								ret := 0.000000
							if( ema13 > 0.048957 )
								ret := 1.000000 // buy
						if( d > 6.67206 )
							if( ema1 <= 167.299 )
								ret := 0.500000
							if( ema1 > 167.299 )
								if( rsi1 <= 26.9419 )
									ret := -0.800000 // sell
								if( rsi1 > 26.9419 )
									ret := -0.230769
					if( d_k > -5.22086 )
						if( smoothD_d <= -0.413022 )
							ret := 0.000000
						if( smoothD_d > -0.413022 )
							if( tema <= 166.983 )
								if( ema13 <= -1.74633 )
									ret := 1.000000 // buy
								if( ema13 > -1.74633 )
									ret := 0.307692
							if( tema > 166.983 )
								if( tema <= 167.744 )
									ret := 1.000000 // buy
								if( tema > 167.744 )
									ret := 0.857143 // buy
			if( k > 29.5548 )
				if( ema13 <= -1.88901 )
					if( d <= 67.424 )
						if( tema <= 116.355 )
							if( k <= 40.5682 )
								ret := -0.750000 // sell
							if( k > 40.5682 )
								ret := 0.000000
						if( tema > 116.355 )
							if( rsi1 <= 22.2774 )
								if( ema13 <= -2.24194 )
									ret := 0.000000
								if( ema13 > -2.24194 )
									ret := 0.714286 // buy
							if( rsi1 > 22.2774 )
								if( ema3 <= 171.749 )
									ret := 0.789474 // buy
								if( ema3 > 171.749 )
									ret := -0.500000
					if( d > 67.424 )
						if( smoothK_k <= 94.6682 )
							if( ema12 <= -0.95282 )
								if( rsi1 <= 34.1016 )
									ret := 0.250000
								if( rsi1 > 34.1016 )
									ret := -0.714286 // sell
							if( ema12 > -0.95282 )
								if( ema12 <= -0.845263 )
									ret := -1.000000 // sell
								if( ema12 > -0.845263 )
									ret := -0.333333
						if( smoothK_k > 94.6682 )
							if( ema3 <= 166.777 )
								if( tema <= 153.523 )
									ret := 0.333333
								if( tema > 153.523 )
									ret := 1.000000 // buy
							if( ema3 > 166.777 )
								ret := -1.000000 // sell
				if( ema13 > -1.88901 )
					if( tema <= 100.15 )
						if( ema13 <= -0.026053 )
							if( smoothK_k <= 39.2865 )
								if( d_k <= -14.8848 )
									ret := 0.750000 // buy
								if( d_k > -14.8848 )
									ret := 0.250000
							if( smoothK_k > 39.2865 )
								if( d_k <= -3.42717 )
									ret := -0.573529
								if( d_k > -3.42717 )
									ret := 0.363636
						if( ema13 > -0.026053 )
							if( k <= 59.7927 )
								if( d_k <= -16.4034 )
									ret := -0.166667
								if( d_k > -16.4034 )
									ret := 0.742857 // buy
							if( k > 59.7927 )
								if( tema <= 95.4703 )
									ret := 0.642857
								if( tema > 95.4703 )
									ret := -0.133333
					if( tema > 100.15 )
						if( ema3 <= 110.766 )
							if( ema13 <= -0.944149 )
								if( ema1 <= 103.768 )
									ret := -0.500000
								if( ema1 > 103.768 )
									ret := -0.857143 // sell
							if( ema13 > -0.944149 )
								if( smoothD_d <= 83.0726 )
									ret := 0.229008
								if( smoothD_d > 83.0726 )
									ret := 0.627451
						if( ema3 > 110.766 )
							if( ema12 <= -0.108737 )
								if( ema3 <= 167.33 )
									ret := 0.211318
								if( ema3 > 167.33 )
									ret := -0.378788
							if( ema12 > -0.108737 )
								if( ema1 <= 161.085 )
									ret := -0.006781
								if( ema1 > 161.085 )
									ret := 0.171742
		if( tema > 168.138 )
			if( ema3 <= 167.885 )
				if( ema13 <= 0.963599 )
					if( ema2 <= 167.622 )
						if( d <= 90.573 )
							if( rsi1 <= 72.3021 )
								ret := 1.000000 // buy
							if( rsi1 > 72.3021 )
								ret := 0.750000 // buy
						if( d > 90.573 )
							ret := -0.250000
					if( ema2 > 167.622 )
						if( ema1 <= 168.096 )
							if( k <= 64.2795 )
								ret := -1.000000 // sell
							if( k > 64.2795 )
								ret := -0.333333
						if( ema1 > 168.096 )
							if( ema2 <= 168.055 )
								if( ema1 <= 168.207 )
									ret := 0.000000
								if( ema1 > 168.207 )
									ret := 0.250000
							if( ema2 > 168.055 )
								ret := -0.500000
				if( ema13 > 0.963599 )
					if( ema3 <= 166.101 )
						if( ema12 <= 1.6729 )
							if( smoothK_k <= 46.3854 )
								ret := -0.714286 // sell
							if( smoothK_k > 46.3854 )
								if( rsi1 <= 77.9643 )
									ret := 0.875000 // buy
								if( rsi1 > 77.9643 )
									ret := -0.142857
						if( ema12 > 1.6729 )
							if( k <= 99.8348 )
								ret := -1.000000 // sell
							if( k > 99.8348 )
								ret := -0.400000
					if( ema3 > 166.101 )
						if( ema3 <= 167.288 )
							if( ema1 <= 167.787 )
								if( k <= 61.711 )
									ret := -0.400000
								if( k > 61.711 )
									ret := -0.800000 // sell
							if( ema1 > 167.787 )
								if( ema2 <= 167.495 )
									ret := -1.000000 // sell
								if( ema2 > 167.495 )
									ret := -0.866667 // sell
						if( ema3 > 167.288 )
							if( ema1 <= 169.114 )
								if( ema1 <= 168.789 )
									ret := -0.555556
								if( ema1 > 168.789 )
									ret := 0.166667
							if( ema1 > 169.114 )
								ret := -1.000000 // sell
			if( ema3 > 167.885 )
				if( ema13 <= -2.78852 )
					if( ema2 <= 309.166 )
						if( ema3 <= 276.171 )
							if( tema <= 233.56 )
								if( tema <= 190.494 )
									ret := 0.060606
								if( tema > 190.494 )
									ret := -0.500000
							if( tema > 233.56 )
								if( ema12 <= -3.46846 )
									ret := -0.857143 // sell
								if( ema12 > -3.46846 )
									ret := 0.358491
						if( ema3 > 276.171 )
							if( ema1 <= 276.986 )
								if( d_k <= -4.78508 )
									ret := -0.931818 // sell
								if( d_k > -4.78508 )
									ret := -0.571429
							if( ema1 > 276.986 )
								if( ema1 <= 282.327 )
									ret := 0.116279
								if( ema1 > 282.327 )
									ret := -0.446970
					if( ema2 > 309.166 )
						if( tema <= 326.751 )
							if( rsi1 <= 39.1088 )
								if( rsi1 <= 19.871 )
									ret := 0.866667 // buy
								if( rsi1 > 19.871 )
									ret := 0.371429
							if( rsi1 > 39.1088 )
								if( rsi1 <= 39.7957 )
									ret := -1.000000 // sell
								if( rsi1 > 39.7957 )
									ret := 0.000000
						if( tema > 326.751 )
							if( smoothD_d <= 36.9258 )
								if( rsi1 <= 16.2089 )
									ret := 0.555556
								if( rsi1 > 16.2089 )
									ret := -0.249057
							if( smoothD_d > 36.9258 )
								if( ema12 <= -6.64266 )
									ret := -1.000000 // sell
								if( ema12 > -6.64266 )
									ret := 0.288462
				if( ema13 > -2.78852 )
					if( rsi1 <= 44.5558 )
						if( ema1 <= 172.356 )
							if( d_k <= -13.3238 )
								if( smoothK_k <= 45.1026 )
									ret := -0.133333
								if( smoothK_k > 45.1026 )
									ret := 0.314815
							if( d_k > -13.3238 )
								if( ema2 <= 171.588 )
									ret := -0.145161
								if( ema2 > 171.588 )
									ret := -0.456311
						if( ema1 > 172.356 )
							if( ema3 <= 319.076 )
								if( d_k <= -14.4839 )
									ret := -0.066770
								if( d_k > -14.4839 )
									ret := 0.132831
							if( ema3 > 319.076 )
								if( tema <= 499.335 )
									ret := -0.083990
								if( tema > 499.335 )
									ret := 0.275362
					if( rsi1 > 44.5558 )
						if( rsi1 <= 63.8698 )
							if( ema13 <= 0.476191 )
								if( k <= 12.02 )
									ret := 0.207921
								if( k > 12.02 )
									ret := -0.022099
							if( ema13 > 0.476191 )
								if( ema13 <= 0.76846 )
									ret := -0.219715
								if( ema13 > 0.76846 )
									ret := -0.069282
						if( rsi1 > 63.8698 )
							if( tema <= 303.639 )
								if( ema1 <= 232.712 )
									ret := 0.045574
								if( ema1 > 232.712 )
									ret := -0.144513
							if( tema > 303.639 )
								if( ema1 <= 326.823 )
									ret := 0.278846
								if( ema1 > 326.823 )
									ret := 0.085535
	if( d_k > -1.75623 )
		if( rsi1 <= 6.04828 )
			if( tema <= 193.003 )
				if( rsi1 <= 3.03654 )
					if( ema12 <= -1.00085 )
						if( ema1 <= 178.795 )
							ret := 1.000000 // buy
						if( ema1 > 178.795 )
							ret := 0.666667
					if( ema12 > -1.00085 )
						ret := -0.400000
				if( rsi1 > 3.03654 )
					if( smoothD_d <= -2.13665 )
						if( tema <= 160.455 )
							if( ema1 <= 158.512 )
								if( smoothD_d <= -2.85068 )
									ret := -1.000000 // sell
								if( smoothD_d > -2.85068 )
									ret := -0.666667
							if( ema1 > 158.512 )
								ret := 0.000000
						if( tema > 160.455 )
							ret := -1.000000 // sell
					if( smoothD_d > -2.13665 )
						if( ema2 <= 188.315 )
							if( ema13 <= -3.9959 )
								if( smoothK_k <= 1.94061 )
									ret := -1.000000 // sell
								if( smoothK_k > 1.94061 )
									ret := -0.750000 // sell
							if( ema13 > -3.9959 )
								if( tema <= 114.74 )
									ret := 0.600000
								if( tema > 114.74 )
									ret := -0.272727
						if( ema2 > 188.315 )
							ret := 1.000000 // buy
			if( tema > 193.003 )
				if( d <= 0.953008 )
					if( ema2 <= 331.506 )
						if( ema2 <= 312.913 )
							if( d <= 0.320584 )
								if( smoothD_d <= -2.98023 )
									ret := 0.250000
								if( smoothD_d > -2.98023 )
									ret := -0.250000
							if( d > 0.320584 )
								ret := 1.000000 // buy
						if( ema2 > 312.913 )
							ret := 1.000000 // buy
					if( ema2 > 331.506 )
						ret := 0.000000
				if( d > 0.953008 )
					if( rsi1 <= 5.16972 )
						if( k <= 2.90717 )
							ret := -0.250000
						if( k > 2.90717 )
							ret := 0.333333
					if( rsi1 > 5.16972 )
						ret := -1.000000 // sell
		if( rsi1 > 6.04828 )
			if( ema12 <= -2.37361 )
				if( smoothK_k <= 4.57395 )
					if( d <= 0.393195 )
						if( ema1 <= 193.254 )
							if( tema <= 167.014 )
								ret := 0.250000
							if( tema > 167.014 )
								ret := 1.000000 // buy
						if( ema1 > 193.254 )
							if( rsi1 <= 30.8615 )
								if( smoothK_k <= -2.59038 )
									ret := -0.192308
								if( smoothK_k > -2.59038 )
									ret := -0.750000 // sell
							if( rsi1 > 30.8615 )
								if( ema13 <= -3.68231 )
									ret := 1.000000 // buy
								if( ema13 > -3.68231 )
									ret := 0.000000
					if( d > 0.393195 )
						if( ema3 <= 175.244 )
							if( tema <= 152.304 )
								if( ema1 <= 135.315 )
									ret := -0.500000
								if( ema1 > 135.315 )
									ret := 1.000000 // buy
							if( tema > 152.304 )
								if( rsi1 <= 11.155 )
									ret := -1.000000 // sell
								if( rsi1 > 11.155 )
									ret := 0.250000
						if( ema3 > 175.244 )
							if( ema2 <= 306.524 )
								if( rsi1 <= 22.9166 )
									ret := 0.752066 // buy
								if( rsi1 > 22.9166 )
									ret := 0.166667
							if( ema2 > 306.524 )
								if( tema <= 341.592 )
									ret := 0.082192
								if( tema > 341.592 )
									ret := 0.566038
				if( smoothK_k > 4.57395 )
					if( tema <= 289.842 )
						if( ema12 <= -4.58677 )
							if( smoothK_k <= 6.71736 )
								ret := 0.500000
							if( smoothK_k > 6.71736 )
								if( ema3 <= 295.836 )
									ret := -1.000000 // sell
								if( ema3 > 295.836 )
									ret := -0.750000 // sell
						if( ema12 > -4.58677 )
							if( d <= 16.2889 )
								if( ema13 <= -5.41734 )
									ret := -0.428571
								if( ema13 > -5.41734 )
									ret := -1.000000 // sell
							if( d > 16.2889 )
								if( rsi1 <= 19.5484 )
									ret := 0.571429
								if( rsi1 > 19.5484 )
									ret := -0.060606
					if( tema > 289.842 )
						if( tema <= 462.451 )
							if( ema3 <= 454.956 )
								if( d <= 54.854 )
									ret := 0.269231
								if( d > 54.854 )
									ret := 0.785714 // buy
							if( ema3 > 454.956 )
								if( rsi1 <= 24.8341 )
									ret := 1.000000 // buy
								if( rsi1 > 24.8341 )
									ret := 0.846154 // buy
						if( tema > 462.451 )
							if( tema <= 478.03 )
								if( smoothK_k <= 25.1621 )
									ret := -0.944444 // sell
								if( smoothK_k > 25.1621 )
									ret := 0.000000
							if( tema > 478.03 )
								if( rsi1 <= 30.2928 )
									ret := 0.348837
								if( rsi1 > 30.2928 )
									ret := -0.500000
			if( ema12 > -2.37361 )
				if( ema2 <= 118.194 )
					if( d <= 96.5139 )
						if( k <= 91.0706 )
							if( smoothD_d <= 69.6341 )
								if( smoothD_d <= 5.67239 )
									ret := 0.296928
								if( smoothD_d > 5.67239 )
									ret := 0.013158
							if( smoothD_d > 69.6341 )
								if( ema13 <= 1.38324 )
									ret := 0.229759
								if( ema13 > 1.38324 )
									ret := 0.657534
						if( k > 91.0706 )
							if( ema12 <= -0.584191 )
								ret := -1.000000 // sell
							if( ema12 > -0.584191 )
								if( smoothD_d <= 91.4881 )
									ret := -0.473684
								if( smoothD_d > 91.4881 )
									ret := 0.054545
					if( d > 96.5139 )
						if( rsi1 <= 90.4647 )
							if( tema <= 118.048 )
								if( ema3 <= 94.0285 )
									ret := -0.250000
								if( ema3 > 94.0285 )
									ret := 0.357143
							if( tema > 118.048 )
								if( smoothK_k <= 96.9758 )
									ret := 0.824561 // buy
								if( smoothK_k > 96.9758 )
									ret := 0.250000
						if( rsi1 > 90.4647 )
							if( tema <= 118.964 )
								if( tema <= 110.123 )
									ret := -0.666667
								if( tema > 110.123 )
									ret := 0.000000
							if( tema > 118.964 )
								ret := -1.000000 // sell
				if( ema2 > 118.194 )
					if( tema <= 117.767 )
						if( ema12 <= -1.24206 )
							ret := 1.000000 // buy
						if( ema12 > -1.24206 )
							if( d <= 0.599224 )
								ret := 0.333333
							if( d > 0.599224 )
								if( ema12 <= -0.441306 )
									ret := -1.000000 // sell
								if( ema12 > -0.441306 )
									ret := -0.300000
					if( tema > 117.767 )
						if( ema2 <= 591.394 )
							if( ema13 <= 9.93971 )
								if( rsi1 <= 52.9896 )
									ret := 0.078640
								if( rsi1 > 52.9896 )
									ret := 0.038755
							if( ema13 > 9.93971 )
								if( tema <= 321.985 )
									ret := -0.170732
								if( tema > 321.985 )
									ret := 0.720000 // buy
						if( ema2 > 591.394 )
							if( ema3 <= 594.151 )
								if( ema13 <= 1.44935 )
									ret := -0.500000
								if( ema13 > 1.44935 )
									ret := 0.000000
							if( ema3 > 594.151 )
								ret := -1.000000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_META_30Min_1569986a(d, d_k, smoothK_k, k, rsi1, smoothD_d, ema12, ema3, ema13, tema, ema1, ema2)

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


