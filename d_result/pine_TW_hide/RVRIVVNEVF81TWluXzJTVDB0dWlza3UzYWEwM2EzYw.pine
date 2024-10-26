//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Stochastic_RSI, L_Triple_EMA
// ID_model: ETHUSDT_5Min_2ST0_3aa03a3c Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ETHUSDT_5Min_2ST0_3aa03a3c", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ETHUSDT_5Min_3aa03a3c(d, d_k, smoothK_k, k, rsi1, smoothD_d, ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( ema12 <= -4.80066 )
		if( d_k <= -1.97078 )
			if( rsi1 <= 22.0463 )
				if( tema <= 3641.34 )
					if( ema3 <= 3044.63 )
						if( tema <= 2904.37 )
							if( ema3 <= 2962.05 )
								if( ema2 <= 2476 )
									ret := -0.034121
								if( ema2 > 2476 )
									ret := -0.399123
							if( ema3 > 2962.05 )
								ret := 0.904762 // buy
						if( tema > 2904.37 )
							if( ema13 <= -26.9166 )
								if( ema1 <= 2939.07 )
									ret := -0.888889 // sell
								if( ema1 > 2939.07 )
									ret := -1.000000 // sell
							if( ema13 > -26.9166 )
								if( d <= 7.45653 )
									ret := 1.000000 // buy
								if( d > 7.45653 )
									ret := -0.571429
					if( ema3 > 3044.63 )
						if( rsi1 <= 16.6055 )
							if( d_k <= -2.30652 )
								if( smoothK_k <= 11.5863 )
									ret := 0.573171
								if( smoothK_k > 11.5863 )
									ret := 1.000000 // buy
							if( d_k > -2.30652 )
								ret := -0.062500
						if( rsi1 > 16.6055 )
							if( tema <= 3197.95 )
								if( ema12 <= -7.64886 )
									ret := 0.686047
								if( ema12 > -7.64886 )
									ret := -0.857143 // sell
							if( tema > 3197.95 )
								if( d <= 11.3472 )
									ret := -0.285714
								if( d > 11.3472 )
									ret := 0.109489
				if( tema > 3641.34 )
					if( ema13 <= -30.0942 )
						if( smoothK_k <= 5.28461 )
							ret := -0.300000
						if( smoothK_k > 5.28461 )
							if( k <= 11.5228 )
								ret := -0.777778 // sell
							if( k > 11.5228 )
								ret := -1.000000 // sell
					if( ema13 > -30.0942 )
						if( ema12 <= -10.7799 )
							if( ema2 <= 3868.65 )
								ret := 0.500000
							if( ema2 > 3868.65 )
								ret := -1.000000 // sell
						if( ema12 > -10.7799 )
							ret := 1.000000 // buy
			if( rsi1 > 22.0463 )
				if( ema1 <= 3114.7 )
					if( smoothD_d <= -0.274503 )
						if( k <= 3.95778 )
							ret := 0.052632
						if( k > 3.95778 )
							if( smoothD_d <= -0.519036 )
								if( d_k <= -2.8967 )
									ret := 0.470588
								if( d_k > -2.8967 )
									ret := 0.947368 // buy
							if( smoothD_d > -0.519036 )
								if( ema13 <= -10.6785 )
									ret := 1.000000 // buy
								if( ema13 > -10.6785 )
									ret := 0.818182 // buy
					if( smoothD_d > -0.274503 )
						if( ema3 <= 2846.27 )
							if( ema2 <= 2624.69 )
								if( d <= 73.8937 )
									ret := 0.084827
								if( d > 73.8937 )
									ret := 0.442623
							if( ema2 > 2624.69 )
								if( d <= 62.0545 )
									ret := -0.337349
								if( d > 62.0545 )
									ret := 0.270270
						if( ema3 > 2846.27 )
							if( k <= 84.3128 )
								if( d_k <= -7.04251 )
									ret := 0.606589
								if( d_k > -7.04251 )
									ret := 0.225490
							if( k > 84.3128 )
								if( ema13 <= -15.6451 )
									ret := -0.353535
								if( ema13 > -15.6451 )
									ret := 0.600000
				if( ema1 > 3114.7 )
					if( rsi1 <= 49.1983 )
						if( ema2 <= 3662.01 )
							if( ema1 <= 3618.66 )
								if( k <= 79.4654 )
									ret := -0.069733
								if( k > 79.4654 )
									ret := 0.177500
							if( ema1 > 3618.66 )
								if( tema <= 3626.4 )
									ret := -0.951220 // sell
								if( tema > 3626.4 )
									ret := -0.275862
						if( ema2 > 3662.01 )
							if( ema2 <= 3740.96 )
								if( d_k <= -2.81296 )
									ret := 0.741176 // buy
								if( d_k > -2.81296 )
									ret := -0.363636
							if( ema2 > 3740.96 )
								if( ema12 <= -7.56678 )
									ret := 0.255422
								if( ema12 > -7.56678 )
									ret := -0.138138
					if( rsi1 > 49.1983 )
						if( ema3 <= 3491.14 )
							ret := 0.470588
						if( ema3 > 3491.14 )
							if( smoothD_d <= 73.5062 )
								ret := 1.000000 // buy
							if( smoothD_d > 73.5062 )
								ret := 0.933333 // buy
		if( d_k > -1.97078 )
			if( ema3 <= 1970.29 )
				if( k <= 3.88382 )
					if( d <= 4.51436 )
						if( d_k <= 0.0606 )
							if( tema <= 1623.24 )
								ret := 0.333333
							if( tema > 1623.24 )
								if( smoothK_k <= -2.9586 )
									ret := 0.750000 // buy
								if( smoothK_k > -2.9586 )
									ret := 1.000000 // buy
						if( d_k > 0.0606 )
							if( d_k <= 0.734864 )
								ret := -0.500000
							if( d_k > 0.734864 )
								ret := 0.809524 // buy
					if( d > 4.51436 )
						ret := -0.333333
				if( k > 3.88382 )
					if( ema2 <= 1637.17 )
						if( ema2 <= 1624.62 )
							if( ema13 <= -12.9265 )
								ret := 1.000000 // buy
							if( ema13 > -12.9265 )
								if( ema12 <= -6.38988 )
									ret := 0.800000 // buy
								if( ema12 > -6.38988 )
									ret := 0.500000
						if( ema2 > 1624.62 )
							ret := -0.250000
					if( ema2 > 1637.17 )
						if( tema <= 1777.11 )
							if( smoothK_k <= 5.33154 )
								ret := 1.000000 // buy
							if( smoothK_k > 5.33154 )
								if( ema2 <= 1774.54 )
									ret := 0.907407 // buy
								if( ema2 > 1774.54 )
									ret := 1.000000 // buy
						if( tema > 1777.11 )
							if( k <= 12.2994 )
								if( ema13 <= -11.3119 )
									ret := 1.000000 // buy
								if( ema13 > -11.3119 )
									ret := 0.888889 // buy
							if( k > 12.2994 )
								if( d <= 30.9075 )
									ret := 0.428571
								if( d > 30.9075 )
									ret := 0.818182 // buy
			if( ema3 > 1970.29 )
				if( tema <= 2944.28 )
					if( ema12 <= -8.23154 )
						if( ema1 <= 2295.08 )
							if( d_k <= 12.9504 )
								if( smoothK_k <= 0.349079 )
									ret := 0.207792
								if( smoothK_k > 0.349079 )
									ret := 0.787097 // buy
							if( d_k > 12.9504 )
								ret := -0.785714 // sell
						if( ema1 > 2295.08 )
							if( smoothD_d <= -1.07241 )
								if( ema2 <= 2582.12 )
									ret := 0.015267
								if( ema2 > 2582.12 )
									ret := 0.631579
							if( smoothD_d > -1.07241 )
								if( smoothD_d <= 93.7735 )
									ret := -0.106109
								if( smoothD_d > 93.7735 )
									ret := 0.807692 // buy
					if( ema12 > -8.23154 )
						if( tema <= 2508.78 )
							if( k <= 33.3843 )
								if( ema3 <= 2461.36 )
									ret := 0.307120
								if( ema3 > 2461.36 )
									ret := -0.395349
							if( k > 33.3843 )
								if( rsi1 <= 26.1431 )
									ret := -0.907895 // sell
								if( rsi1 > 26.1431 )
									ret := 0.127451
						if( tema > 2508.78 )
							if( smoothD_d <= 90.7954 )
								if( ema1 <= 2609.9 )
									ret := 0.664495
								if( ema1 > 2609.9 )
									ret := 0.416327
							if( smoothD_d > 90.7954 )
								if( smoothD_d <= 96.8339 )
									ret := -0.461538
								if( smoothD_d > 96.8339 )
									ret := 0.272727
				if( tema > 2944.28 )
					if( ema3 <= 3040.79 )
						if( smoothD_d <= 53.1797 )
							if( ema12 <= -16.5897 )
								if( ema2 <= 3023.26 )
									ret := 0.750000 // buy
								if( ema2 > 3023.26 )
									ret := 1.000000 // buy
							if( ema12 > -16.5897 )
								if( ema3 <= 2982.58 )
									ret := 0.125000
								if( ema3 > 2982.58 )
									ret := -0.498462
						if( smoothD_d > 53.1797 )
							if( k <= 57.2402 )
								ret := 1.000000 // buy
							if( k > 57.2402 )
								ret := 0.666667
					if( ema3 > 3040.79 )
						if( tema <= 3025.29 )
							if( smoothD_d <= 13.6931 )
								ret := 1.000000 // buy
							if( smoothD_d > 13.6931 )
								ret := -0.692308
						if( tema > 3025.29 )
							if( smoothK_k <= -2.22705 )
								if( ema2 <= 3803.26 )
									ret := -0.124571
								if( ema2 > 3803.26 )
									ret := 0.330769
							if( smoothK_k > -2.22705 )
								if( ema12 <= -7.03059 )
									ret := 0.214449
								if( ema12 > -7.03059 )
									ret := 0.080116
	if( ema12 > -4.80066 )
		if( ema2 <= 3492.43 )
			if( ema12 <= 2.54525 )
				if( d <= 12.2639 )
					if( ema13 <= 1.07625 )
						if( ema1 <= 2226.72 )
							if( d <= 1.8632 )
								if( ema3 <= 2228.41 )
									ret := 0.150880
								if( ema3 > 2228.41 )
									ret := 0.909091 // buy
							if( d > 1.8632 )
								if( tema <= 2126.84 )
									ret := -0.027418
								if( tema > 2126.84 )
									ret := 0.342672
						if( ema1 > 2226.72 )
							if( ema2 <= 2240.5 )
								if( rsi1 <= 33.5233 )
									ret := -0.727273 // sell
								if( rsi1 > 33.5233 )
									ret := -0.302158
							if( ema2 > 2240.5 )
								if( k <= 5.59746 )
									ret := 0.000366
								if( k > 5.59746 )
									ret := -0.077553
					if( ema13 > 1.07625 )
						if( ema2 <= 3477.19 )
							if( tema <= 3231.4 )
								if( ema3 <= 3208.61 )
									ret := -0.134761
								if( ema3 > 3208.61 )
									ret := -0.934783 // sell
							if( tema > 3231.4 )
								if( ema2 <= 3419.23 )
									ret := 0.267532
								if( ema2 > 3419.23 )
									ret := -0.251572
						if( ema2 > 3477.19 )
							if( ema12 <= 0.923034 )
								ret := -1.000000 // sell
							if( ema12 > 0.923034 )
								ret := -0.800000 // sell
				if( d > 12.2639 )
					if( ema3 <= 1557.49 )
						if( smoothK_k <= 92.2949 )
							if( smoothK_k <= 44.8835 )
								if( ema1 <= 1555.75 )
									ret := -0.075658
								if( ema1 > 1555.75 )
									ret := 0.571429
							if( smoothK_k > 44.8835 )
								if( d_k <= 3.01959 )
									ret := 0.431655
								if( d_k > 3.01959 )
									ret := -0.016949
						if( smoothK_k > 92.2949 )
							if( tema <= 1557.1 )
								if( d_k <= -1.98336 )
									ret := -0.163265
								if( d_k > -1.98336 )
									ret := 0.125000
							if( tema > 1557.1 )
								ret := -0.631579
					if( ema3 > 1557.49 )
						if( d <= 59.5722 )
							if( k <= 50.7988 )
								if( d <= 34.347 )
									ret := 0.033980
								if( d > 34.347 )
									ret := -0.015407
							if( k > 50.7988 )
								if( ema3 <= 2304.62 )
									ret := 0.124157
								if( ema3 > 2304.62 )
									ret := 0.025084
						if( d > 59.5722 )
							if( rsi1 <= 75.4329 )
								if( ema3 <= 2024.55 )
									ret := -0.050260
								if( ema3 > 2024.55 )
									ret := 0.015378
							if( rsi1 > 75.4329 )
								if( ema3 <= 1874.67 )
									ret := 0.027638
								if( ema3 > 1874.67 )
									ret := 0.227419
			if( ema12 > 2.54525 )
				if( rsi1 <= 87.0806 )
					if( k <= 2.69816 )
						if( d <= 2.66382 )
							if( smoothK_k <= -2.09378 )
								if( ema13 <= 22.4361 )
									ret := 0.626168
								if( ema13 > 22.4361 )
									ret := 0.961538 // buy
							if( smoothK_k > -2.09378 )
								if( k <= 1.12205 )
									ret := -0.454545
								if( k > 1.12205 )
									ret := 0.250000
						if( d > 2.66382 )
							if( d <= 20.0178 )
								if( d <= 4.18181 )
									ret := -0.435897
								if( d > 4.18181 )
									ret := 0.256158
							if( d > 20.0178 )
								if( ema3 <= 2991.94 )
									ret := -0.222222
								if( ema3 > 2991.94 )
									ret := -0.700000 // sell
					if( k > 2.69816 )
						if( ema3 <= 3402.78 )
							if( ema13 <= 61.0638 )
								if( smoothD_d <= 79.6731 )
									ret := -0.135904
								if( smoothD_d > 79.6731 )
									ret := -0.076615
							if( ema13 > 61.0638 )
								if( ema3 <= 2316.31 )
									ret := 1.000000 // buy
								if( ema3 > 2316.31 )
									ret := 0.538462
						if( ema3 > 3402.78 )
							if( d <= 97.9518 )
								if( k <= 36.9183 )
									ret := 0.475000
								if( k > 36.9183 )
									ret := 0.114255
							if( d > 97.9518 )
								if( tema <= 3441.95 )
									ret := 0.023256
								if( tema > 3441.95 )
									ret := -0.541985
				if( rsi1 > 87.0806 )
					if( ema1 <= 1817.27 )
						if( ema13 <= 5.30004 )
							ret := 0.789474 // buy
						if( ema13 > 5.30004 )
							if( smoothD_d <= 94.3376 )
								if( smoothK_k <= 92.0872 )
									ret := -0.230769
								if( smoothK_k > 92.0872 )
									ret := -1.000000 // sell
							if( smoothD_d > 94.3376 )
								if( smoothK_k <= 96.7477 )
									ret := -0.875000 // sell
								if( smoothK_k > 96.7477 )
									ret := 0.030303
					if( ema1 > 1817.27 )
						if( ema13 <= 4.99105 )
							ret := -0.666667
						if( ema13 > 4.99105 )
							if( ema2 <= 2992 )
								if( ema13 <= 40.1915 )
									ret := 0.419498
								if( ema13 > 40.1915 )
									ret := -0.321429
							if( ema2 > 2992 )
								if( d_k <= -15.7023 )
									ret := 0.928571 // buy
								if( d_k > -15.7023 )
									ret := -0.033846
		if( ema2 > 3492.43 )
			if( ema12 <= 29.0064 )
				if( rsi1 <= 54.06 )
					if( ema12 <= -3.71897 )
						if( ema1 <= 3497.26 )
							if( tema <= 3488.91 )
								if( d <= 5.46626 )
									ret := 0.900000 // buy
								if( d > 5.46626 )
									ret := -0.294118
							if( tema > 3488.91 )
								ret := 0.944444 // buy
						if( ema1 > 3497.26 )
							if( ema1 <= 4018.53 )
								if( d_k <= -4.83153 )
									ret := -0.063953
								if( d_k > -4.83153 )
									ret := -0.279221
							if( ema1 > 4018.53 )
								if( rsi1 <= 42.4573 )
									ret := 0.142857
								if( rsi1 > 42.4573 )
									ret := 0.900000 // buy
					if( ema12 > -3.71897 )
						if( tema <= 3549.05 )
							if( ema2 <= 3517.68 )
								if( d_k <= -17.369 )
									ret := -0.413793
								if( d_k > -17.369 )
									ret := 0.039203
							if( ema2 > 3517.68 )
								if( ema3 <= 3529.22 )
									ret := -0.438017
								if( ema3 > 3529.22 )
									ret := -0.099455
						if( tema > 3549.05 )
							if( ema2 <= 3867.03 )
								if( ema3 <= 3835.97 )
									ret := 0.036646
								if( ema3 > 3835.97 )
									ret := 0.274162
							if( ema2 > 3867.03 )
								if( ema1 <= 3883.54 )
									ret := -0.788889 // sell
								if( ema1 > 3883.54 )
									ret := -0.082511
				if( rsi1 > 54.06 )
					if( ema1 <= 3510.66 )
						if( ema12 <= 5.21858 )
							if( ema1 <= 3507.64 )
								if( d <= 8.72177 )
									ret := 0.826087 // buy
								if( d > 8.72177 )
									ret := -0.122984
							if( ema1 > 3507.64 )
								if( ema3 <= 3508.15 )
									ret := -0.535948
								if( ema3 > 3508.15 )
									ret := 0.083333
						if( ema12 > 5.21858 )
							if( k <= 91.0097 )
								if( ema1 <= 3509.73 )
									ret := -0.826923 // sell
								if( ema1 > 3509.73 )
									ret := 0.142857
							if( k > 91.0097 )
								if( rsi1 <= 72.48 )
									ret := 0.043478
								if( rsi1 > 72.48 )
									ret := -0.617647
					if( ema1 > 3510.66 )
						if( ema12 <= 15.2422 )
							if( ema2 <= 3738.59 )
								if( ema2 <= 3650.18 )
									ret := -0.114427
								if( ema2 > 3650.18 )
									ret := 0.176720
							if( ema2 > 3738.59 )
								if( smoothK_k <= 3.93451 )
									ret := -0.709302 // sell
								if( smoothK_k > 3.93451 )
									ret := -0.103112
						if( ema12 > 15.2422 )
							if( ema3 <= 3556.5 )
								if( ema12 <= 18.9123 )
									ret := -0.463415
								if( ema12 > 18.9123 )
									ret := 0.759259 // buy
							if( ema3 > 3556.5 )
								if( ema3 <= 3813.2 )
									ret := -0.675556
								if( ema3 > 3813.2 )
									ret := -0.145455
			if( ema12 > 29.0064 )
				if( k <= 70.5266 )
					if( rsi1 <= 82.2839 )
						ret := 1.000000 // buy
					if( rsi1 > 82.2839 )
						ret := 0.000000
				if( k > 70.5266 )
					if( ema3 <= 3874.24 )
						ret := 1.000000 // buy
					if( ema3 > 3874.24 )
						ret := 0.833333 // buy
	
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
float op_operation = decision_tree_0_ETHUSDT_5Min_3aa03a3c(d, d_k, smoothK_k, k, rsi1, smoothD_d, ema12, ema3, ema13, tema, ema1, ema2)

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


