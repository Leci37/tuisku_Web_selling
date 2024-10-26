//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA
// ID_model: DOTUSDT_15Min_1T00_a9b315ca Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_DOTUSDT_15Min_1T00_a9b315ca", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_DOTUSDT_15Min_a9b315ca(ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ema13 <= -0.043937 )
		if( tema <= 7.14241 )
			if( ema12 <= -0.060368 )
				if( ema13 <= -0.317207 )
					if( ema3 <= 5.57963 )
						ret := 0.500000
					if( ema3 > 5.57963 )
						ret := 1.000000 // buy
				if( ema13 > -0.317207 )
					if( tema <= 6.6901 )
						if( tema <= 5.52746 )
							if( ema1 <= 5.35139 )
								if( tema <= 4.26946 )
									ret := -0.297297
								if( tema > 4.26946 )
									ret := 0.636943
							if( ema1 > 5.35139 )
								if( ema1 <= 5.44834 )
									ret := -0.833333 // sell
								if( ema1 > 5.44834 )
									ret := -0.114754
						if( tema > 5.52746 )
							if( tema <= 5.9042 )
								if( ema12 <= -0.109026 )
									ret := 0.977778 // buy
								if( ema12 > -0.109026 )
									ret := 0.787500 // buy
							if( tema > 5.9042 )
								if( ema2 <= 6.1043 )
									ret := -0.600000
								if( ema2 > 6.1043 )
									ret := 0.487751
					if( tema > 6.6901 )
						if( tema <= 6.81787 )
							if( tema <= 6.72025 )
								if( ema2 <= 7.01951 )
									ret := -0.250000
								if( ema2 > 7.01951 )
									ret := 0.750000 // buy
							if( tema > 6.72025 )
								if( ema12 <= -0.071662 )
									ret := -0.912281 // sell
								if( ema12 > -0.071662 )
									ret := -0.050000
						if( tema > 6.81787 )
							if( ema12 <= -0.135643 )
								if( tema <= 7.02951 )
									ret := -0.400000
								if( tema > 7.02951 )
									ret := -1.000000 // sell
							if( ema12 > -0.135643 )
								if( tema <= 7.06537 )
									ret := 0.526042
								if( tema > 7.06537 )
									ret := 0.226190
			if( ema12 > -0.060368 )
				if( ema1 <= 4.19954 )
					if( ema3 <= 3.99447 )
						if( tema <= 3.90272 )
							if( tema <= 3.84269 )
								ret := 1.000000 // buy
							if( tema > 3.84269 )
								ret := 0.166667
						if( tema > 3.90272 )
							ret := -1.000000 // sell
					if( ema3 > 3.99447 )
						if( ema13 <= -0.051418 )
							if( ema3 <= 4.18711 )
								if( ema12 <= -0.037887 )
									ret := 0.818182 // buy
								if( ema12 > -0.037887 )
									ret := 0.958333 // buy
							if( ema3 > 4.18711 )
								if( ema3 <= 4.23661 )
									ret := 0.000000
								if( ema3 > 4.23661 )
									ret := 0.880000 // buy
						if( ema13 > -0.051418 )
							if( ema1 <= 4.18522 )
								if( ema12 <= -0.023545 )
									ret := 0.437500
								if( ema12 > -0.023545 )
									ret := 0.888889 // buy
							if( ema1 > 4.18522 )
								ret := 0.000000
				if( ema1 > 4.19954 )
					if( ema2 <= 4.56776 )
						if( ema2 <= 4.3981 )
							if( ema2 <= 4.23786 )
								if( ema12 <= -0.029537 )
									ret := -0.750000 // sell
								if( ema12 > -0.029537 )
									ret := -1.000000 // sell
							if( ema2 > 4.23786 )
								if( ema13 <= -0.07405 )
									ret := -0.166667
								if( ema13 > -0.07405 )
									ret := 0.271186
						if( ema2 > 4.3981 )
							if( ema12 <= -0.045967 )
								if( ema12 <= -0.055881 )
									ret := -0.333333
								if( ema12 > -0.055881 )
									ret := -0.884615 // sell
							if( ema12 > -0.045967 )
								if( ema12 <= -0.019793 )
									ret := -0.190000
								if( ema12 > -0.019793 )
									ret := -1.000000 // sell
					if( ema2 > 4.56776 )
						if( ema1 <= 4.66582 )
							if( tema <= 4.57321 )
								if( tema <= 4.49906 )
									ret := 1.000000 // buy
								if( tema > 4.49906 )
									ret := 0.050000
							if( tema > 4.57321 )
								if( ema1 <= 4.62479 )
									ret := 1.000000 // buy
								if( ema1 > 4.62479 )
									ret := 0.656250
						if( ema1 > 4.66582 )
							if( tema <= 4.66933 )
								if( ema12 <= -0.039659 )
									ret := -1.000000 // sell
								if( ema12 > -0.039659 )
									ret := -0.380952
							if( tema > 4.66933 )
								if( ema1 <= 6.93983 )
									ret := 0.156786
								if( ema1 > 6.93983 )
									ret := 0.314320
		if( tema > 7.14241 )
			if( ema12 <= -0.08306 )
				if( ema2 <= 7.65303 )
					if( ema12 <= -0.098732 )
						if( ema2 <= 7.45718 )
							ret := -0.857143 // sell
						if( ema2 > 7.45718 )
							ret := -1.000000 // sell
					if( ema12 > -0.098732 )
						if( ema2 <= 7.42508 )
							ret := -0.428571
						if( ema2 > 7.42508 )
							ret := 0.666667
				if( ema2 > 7.65303 )
					if( ema2 <= 11.3627 )
						if( ema2 <= 10.3833 )
							if( ema3 <= 9.34856 )
								if( ema3 <= 9.10697 )
									ret := 0.361446
								if( ema3 > 9.10697 )
									ret := 0.824074 // buy
							if( ema3 > 9.34856 )
								if( ema2 <= 9.54055 )
									ret := -0.471910
								if( ema2 > 9.54055 )
									ret := 0.083056
						if( ema2 > 10.3833 )
							if( ema13 <= -0.154167 )
								if( ema3 <= 10.6179 )
									ret := 1.000000 // buy
								if( ema3 > 10.6179 )
									ret := 0.639216
							if( ema13 > -0.154167 )
								if( ema2 <= 10.8192 )
									ret := 0.952381 // buy
								if( ema2 > 10.8192 )
									ret := -0.419355
					if( ema2 > 11.3627 )
						if( ema3 <= 13.1991 )
							if( ema12 <= -0.190121 )
								if( tema <= 11.7297 )
									ret := 0.909091 // buy
								if( tema > 11.7297 )
									ret := 0.200000
							if( ema12 > -0.190121 )
								if( ema13 <= -0.182725 )
									ret := -0.781609 // sell
								if( ema13 > -0.182725 )
									ret := -0.131579
						if( ema3 > 13.1991 )
							if( ema12 <= -0.156878 )
								if( ema3 <= 15.5441 )
									ret := 0.090909
								if( ema3 > 15.5441 )
									ret := -1.000000 // sell
							if( ema12 > -0.156878 )
								if( ema3 <= 15.2418 )
									ret := 0.653333
								if( ema3 > 15.2418 )
									ret := 0.073529
			if( ema12 > -0.08306 )
				if( ema3 <= 7.37033 )
					if( ema12 <= -0.040852 )
						if( tema <= 7.20204 )
							if( ema1 <= 7.21056 )
								if( ema2 <= 7.26165 )
									ret := -1.000000 // sell
								if( ema2 > 7.26165 )
									ret := -0.500000
							if( ema1 > 7.21056 )
								if( ema3 <= 7.31719 )
									ret := 0.777778 // buy
								if( ema3 > 7.31719 )
									ret := -0.015625
						if( tema > 7.20204 )
							if( ema1 <= 7.2855 )
								ret := 1.000000 // buy
							if( ema1 > 7.2855 )
								ret := 0.500000
					if( ema12 > -0.040852 )
						if( ema3 <= 7.33366 )
							if( ema2 <= 7.28034 )
								if( ema2 <= 7.22513 )
									ret := 0.092593
								if( ema2 > 7.22513 )
									ret := -0.356589
							if( ema2 > 7.28034 )
								if( ema3 <= 7.30444 )
									ret := 1.000000 // buy
								if( ema3 > 7.30444 )
									ret := 0.230769
						if( ema3 > 7.33366 )
							if( tema <= 7.27818 )
								if( ema13 <= -0.06235 )
									ret := -0.592593
								if( ema13 > -0.06235 )
									ret := -0.933333 // sell
							if( tema > 7.27818 )
								if( ema2 <= 7.32873 )
									ret := 0.000000
								if( ema2 > 7.32873 )
									ret := 0.600000
				if( ema3 > 7.37033 )
					if( tema <= 10.1665 )
						if( ema1 <= 10.1759 )
							if( ema13 <= -0.149697 )
								if( ema12 <= -0.072671 )
									ret := -0.456311
								if( ema12 > -0.072671 )
									ret := 0.103448
							if( ema13 > -0.149697 )
								if( ema2 <= 9.21489 )
									ret := 0.079963
								if( ema2 > 9.21489 )
									ret := 0.223992
						if( ema1 > 10.1759 )
							if( ema13 <= -0.142605 )
								ret := 0.000000
							if( ema13 > -0.142605 )
								if( ema2 <= 10.2824 )
									ret := 0.828571 // buy
								if( ema2 > 10.2824 )
									ret := 0.375000
					if( tema > 10.1665 )
						if( ema2 <= 16.6402 )
							if( tema <= 15.1085 )
								if( ema3 <= 13.3787 )
									ret := -0.120185
								if( ema3 > 13.3787 )
									ret := 0.277273
							if( tema > 15.1085 )
								if( ema3 <= 16.0576 )
									ret := -0.766234 // sell
								if( ema3 > 16.0576 )
									ret := -0.294872
						if( ema2 > 16.6402 )
							if( ema1 <= 16.9853 )
								if( ema1 <= 16.9131 )
									ret := 0.434783
								if( ema1 > 16.9131 )
									ret := 0.923077 // buy
							if( ema1 > 16.9853 )
								if( ema1 <= 17.0076 )
									ret := 0.000000
								if( ema1 > 17.0076 )
									ret := -0.500000
	if( ema13 > -0.043937 )
		if( ema2 <= 11.0782 )
			if( ema13 <= 0.184054 )
				if( tema <= 11.1609 )
					if( ema1 <= 10.9638 )
						if( tema <= 10.407 )
							if( ema13 <= 0.072724 )
								if( tema <= 4.02081 )
									ret := 0.144942
								if( tema > 4.02081 )
									ret := 0.026790
							if( ema13 > 0.072724 )
								if( ema2 <= 7.34191 )
									ret := 0.180490
								if( ema2 > 7.34191 )
									ret := 0.019380
						if( tema > 10.407 )
							if( ema1 <= 10.5573 )
								if( ema2 <= 10.4253 )
									ret := -0.078313
								if( ema2 > 10.4253 )
									ret := -0.480159
							if( ema1 > 10.5573 )
								if( ema13 <= 0.060408 )
									ret := 0.117347
								if( ema13 > 0.060408 )
									ret := -0.363095
					if( ema1 > 10.9638 )
						if( ema12 <= -0.007617 )
							if( ema2 <= 11.0289 )
								ret := -0.500000
							if( ema2 > 11.0289 )
								ret := -1.000000 // sell
						if( ema12 > -0.007617 )
							if( ema12 <= 0.075603 )
								if( ema13 <= 0.087821 )
									ret := 0.373626
								if( ema13 > 0.087821 )
									ret := 0.846154 // buy
							if( ema12 > 0.075603 )
								if( ema13 <= 0.126364 )
									ret := -0.750000 // sell
								if( ema13 > 0.126364 )
									ret := 0.000000
				if( tema > 11.1609 )
					if( tema <= 11.172 )
						if( ema2 <= 11.0236 )
							ret := -1.000000 // sell
						if( ema2 > 11.0236 )
							ret := -0.250000
					if( tema > 11.172 )
						if( ema2 <= 11.0568 )
							ret := -1.000000 // sell
						if( ema2 > 11.0568 )
							ret := -0.750000 // sell
			if( ema13 > 0.184054 )
				if( ema12 <= 0.183232 )
					if( tema <= 7.81664 )
						if( ema3 <= 5.98453 )
							if( ema1 <= 6.09391 )
								ret := 0.428571
							if( ema1 > 6.09391 )
								ret := -1.000000 // sell
						if( ema3 > 5.98453 )
							if( ema1 <= 7.36356 )
								if( tema <= 7.14877 )
									ret := 0.702703 // buy
								if( tema > 7.14877 )
									ret := 0.243243
							if( ema1 > 7.36356 )
								if( ema3 <= 7.25814 )
									ret := 1.000000 // buy
								if( ema3 > 7.25814 )
									ret := 0.739130 // buy
					if( tema > 7.81664 )
						if( ema2 <= 7.70366 )
							if( ema12 <= 0.096777 )
								ret := -0.750000 // sell
							if( ema12 > 0.096777 )
								if( ema3 <= 7.48806 )
									ret := -0.846154 // sell
								if( ema3 > 7.48806 )
									ret := -1.000000 // sell
						if( ema2 > 7.70366 )
							if( tema <= 8.0568 )
								if( ema1 <= 7.87654 )
									ret := 0.800000 // buy
								if( ema1 > 7.87654 )
									ret := 1.000000 // buy
							if( tema > 8.0568 )
								if( ema1 <= 7.93816 )
									ret := -0.875000 // sell
								if( ema1 > 7.93816 )
									ret := 0.205333
				if( ema12 > 0.183232 )
					if( ema12 <= 0.266682 )
						if( tema <= 8.04272 )
							if( ema12 <= 0.225822 )
								ret := 1.000000 // buy
							if( ema12 > 0.225822 )
								ret := 0.750000 // buy
						if( tema > 8.04272 )
							if( ema2 <= 8.78658 )
								if( tema <= 9.129 )
									ret := 0.363636
								if( tema > 9.129 )
									ret := -1.000000 // sell
							if( ema2 > 8.78658 )
								if( ema12 <= 0.22228 )
									ret := 0.861538 // buy
								if( ema12 > 0.22228 )
									ret := 0.333333
					if( ema12 > 0.266682 )
						ret := -1.000000 // sell
		if( ema2 > 11.0782 )
			if( ema2 <= 14.4469 )
				if( ema3 <= 11.3176 )
					if( ema2 <= 11.3036 )
						if( ema2 <= 11.226 )
							if( ema1 <= 11.2069 )
								if( ema3 <= 11.1315 )
									ret := -0.584270
								if( ema3 > 11.1315 )
									ret := 0.379310
							if( ema1 > 11.2069 )
								if( ema1 <= 11.2942 )
									ret := 0.763158 // buy
								if( ema1 > 11.2942 )
									ret := -0.384615
						if( ema2 > 11.226 )
							if( ema1 <= 11.416 )
								if( ema3 <= 11.289 )
									ret := -0.891304 // sell
								if( ema3 > 11.289 )
									ret := 0.000000
							if( ema1 > 11.416 )
								ret := 1.000000 // buy
					if( ema2 > 11.3036 )
						if( ema1 <= 11.519 )
							if( ema2 <= 11.3293 )
								if( ema12 <= 0.035162 )
									ret := 1.000000 // buy
								if( ema12 > 0.035162 )
									ret := -0.250000
							if( ema2 > 11.3293 )
								ret := 1.000000 // buy
						if( ema1 > 11.519 )
							if( ema12 <= 0.235332 )
								ret := -1.000000 // sell
							if( ema12 > 0.235332 )
								ret := -0.500000
				if( ema3 > 11.3176 )
					if( ema1 <= 11.6847 )
						if( ema3 <= 11.3201 )
							ret := -0.400000
						if( ema3 > 11.3201 )
							if( ema13 <= 0.179509 )
								if( tema <= 11.3041 )
									ret := -0.750000 // sell
								if( tema > 11.3041 )
									ret := -0.984848 // sell
							if( ema13 > 0.179509 )
								if( ema12 <= 0.118084 )
									ret := -0.166667
								if( ema12 > 0.118084 )
									ret := -1.000000 // sell
					if( ema1 > 11.6847 )
						if( ema3 <= 11.7431 )
							if( ema3 <= 11.7211 )
								if( ema12 <= 0.063332 )
									ret := -0.785714 // sell
								if( ema12 > 0.063332 )
									ret := 0.750000 // buy
							if( ema3 > 11.7211 )
								if( ema12 <= 0.043458 )
									ret := 1.000000 // buy
								if( ema12 > 0.043458 )
									ret := 0.500000
						if( ema3 > 11.7431 )
							if( tema <= 13.4045 )
								if( ema2 <= 13.3891 )
									ret := -0.924528 // sell
								if( ema2 > 13.3891 )
									ret := -0.363636
							if( tema > 13.4045 )
								if( ema1 <= 14.2803 )
									ret := -0.226744
								if( ema1 > 14.2803 )
									ret := -0.772727 // sell
			if( ema2 > 14.4469 )
				if( ema1 <= 15.3187 )
					if( ema3 <= 15.1364 )
						if( ema2 <= 15.0926 )
							if( tema <= 14.4855 )
								if( ema3 <= 14.4564 )
									ret := 1.000000 // buy
								if( ema3 > 14.4564 )
									ret := 0.625000
							if( tema > 14.4855 )
								if( ema2 <= 14.6147 )
									ret := -0.846154 // sell
								if( ema2 > 14.6147 )
									ret := 0.277533
						if( ema2 > 15.0926 )
							if( tema <= 15.1494 )
								if( ema1 <= 15.1035 )
									ret := -0.333333
								if( ema1 > 15.1035 )
									ret := -0.916667 // sell
							if( tema > 15.1494 )
								if( tema <= 15.3414 )
									ret := 0.142857
								if( tema > 15.3414 )
									ret := -0.500000
					if( ema3 > 15.1364 )
						if( ema3 <= 15.2006 )
							if( ema2 <= 15.1691 )
								if( ema13 <= 0.022253 )
									ret := 0.125000
								if( ema13 > 0.022253 )
									ret := 1.000000 // buy
							if( ema2 > 15.1691 )
								if( ema3 <= 15.1647 )
									ret := 0.600000
								if( ema3 > 15.1647 )
									ret := 1.000000 // buy
						if( ema3 > 15.2006 )
							if( ema3 <= 15.2324 )
								ret := -1.000000 // sell
							if( ema3 > 15.2324 )
								ret := -0.250000
				if( ema1 > 15.3187 )
					if( ema2 <= 17.0714 )
						if( tema <= 16.8186 )
							if( ema3 <= 16.2875 )
								if( tema <= 16.0836 )
									ret := -0.620000
								if( tema > 16.0836 )
									ret := 0.096774
							if( ema3 > 16.2875 )
								if( ema2 <= 16.313 )
									ret := -1.000000 // sell
								if( ema2 > 16.313 )
									ret := -0.652174
						if( tema > 16.8186 )
							if( ema3 <= 16.8894 )
								if( ema3 <= 16.779 )
									ret := 0.000000
								if( ema3 > 16.779 )
									ret := 0.875000 // buy
							if( ema3 > 16.8894 )
								if( ema12 <= -8.5e-05 )
									ret := 0.230769
								if( ema12 > -8.5e-05 )
									ret := -0.340659
					if( ema2 > 17.0714 )
						if( tema <= 17.0532 )
							if( ema1 <= 17.0764 )
								ret := -1.000000 // sell
							if( ema1 > 17.0764 )
								ret := 0.500000
						if( tema > 17.0532 )
							if( ema3 <= 17.1003 )
								if( ema2 <= 17.1182 )
									ret := -0.896552 // sell
								if( ema2 > 17.1182 )
									ret := 0.000000
							if( ema3 > 17.1003 )
								ret := -1.000000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

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
float op_operation = decision_tree_0_DOTUSDT_15Min_a9b315ca(ema12, ema3, ema13, tema, ema1, ema2)

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


