//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA, L_Vortex_Indicator
// ID_model: ATOMUSDT_15Min_2TV0_d995b411 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ATOMUSDT_15Min_2TV0_d995b411", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ATOMUSDT_15Min_d995b411(ema3, tema, ema2, ema12, ema13, ema1, VIP, VIM, VIP_VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ema13 <= -0.047004 )
		if( ema2 <= 10.8266 )
			if( ema1 <= 10.6309 )
				if( ema12 <= -0.116722 )
					if( tema <= 9.49991 )
						if( ema2 <= 7.71684 )
							if( ema13 <= -0.298402 )
								if( VIP <= 0.648232 )
									ret := 0.750000 // buy
								if( VIP > 0.648232 )
									ret := 1.000000 // buy
							if( ema13 > -0.298402 )
								if( ema13 <= -0.217722 )
									ret := -0.375000
								if( ema13 > -0.217722 )
									ret := 0.538462
						if( ema2 > 7.71684 )
							if( VIP <= 0.882506 )
								if( ema3 <= 8.87215 )
									ret := 0.504762
								if( ema3 > 8.87215 )
									ret := 0.775120 // buy
							if( VIP > 0.882506 )
								ret := -0.333333
					if( tema > 9.49991 )
						if( VIP_VIM <= -0.636143 )
							if( ema1 <= 10.2648 )
								if( ema13 <= -0.282366 )
									ret := -0.787234 // sell
								if( ema13 > -0.282366 )
									ret := 0.047619
							if( ema1 > 10.2648 )
								if( tema <= 10.2795 )
									ret := 0.292683
								if( tema > 10.2795 )
									ret := -0.700000 // sell
						if( VIP_VIM > -0.636143 )
							if( ema2 <= 10.6889 )
								if( ema3 <= 10.42 )
									ret := 0.076923
								if( ema3 > 10.42 )
									ret := 0.747573 // buy
							if( ema2 > 10.6889 )
								if( VIM <= 1.27691 )
									ret := -0.611111
								if( VIM > 1.27691 )
									ret := 0.333333
				if( ema12 > -0.116722 )
					if( VIP_VIM <= -0.55665 )
						if( ema1 <= 8.01363 )
							if( ema1 <= 7.88704 )
								if( VIP <= 0.565673 )
									ret := 0.310811
								if( VIP > 0.565673 )
									ret := -0.089947
							if( ema1 > 7.88704 )
								if( VIP <= 0.663072 )
									ret := -0.400000
								if( VIP > 0.663072 )
									ret := -0.884615 // sell
						if( ema1 > 8.01363 )
							if( tema <= 8.46851 )
								if( VIP <= 0.594131 )
									ret := -0.222222
								if( VIP > 0.594131 )
									ret := 0.780000 // buy
							if( tema > 8.46851 )
								if( ema3 <= 10.6241 )
									ret := 0.109394
								if( ema3 > 10.6241 )
									ret := -0.517857
					if( VIP_VIM > -0.55665 )
						if( VIP <= 0.747337 )
							if( ema13 <= -0.164301 )
								if( VIM <= 1.27363 )
									ret := -0.250000
								if( VIM > 1.27363 )
									ret := 1.000000 // buy
							if( ema13 > -0.164301 )
								if( VIP <= 0.697728 )
									ret := -0.012987
								if( VIP > 0.697728 )
									ret := 0.400471
						if( VIP > 0.747337 )
							if( ema1 <= 3.902 )
								ret := -1.000000 // sell
							if( ema1 > 3.902 )
								if( tema <= 4.39019 )
									ret := 0.742857 // buy
								if( tema > 4.39019 )
									ret := 0.137725
			if( ema1 > 10.6309 )
				if( ema13 <= -0.055243 )
					if( VIP <= 0.712329 )
						if( VIP <= 0.681628 )
							if( ema2 <= 10.8085 )
								if( tema <= 10.5407 )
									ret := 1.000000 // buy
								if( tema > 10.5407 )
									ret := 0.388889
							if( ema2 > 10.8085 )
								ret := -0.333333
						if( VIP > 0.681628 )
							if( ema3 <= 10.8195 )
								if( ema12 <= -0.050509 )
									ret := 0.000000
								if( ema12 > -0.050509 )
									ret := 0.750000 // buy
							if( ema3 > 10.8195 )
								if( VIP_VIM <= -0.579955 )
									ret := -0.500000
								if( VIP_VIM > -0.579955 )
									ret := -1.000000 // sell
					if( VIP > 0.712329 )
						if( ema3 <= 10.7899 )
							if( ema1 <= 10.6611 )
								if( ema2 <= 10.7198 )
									ret := 0.857143 // buy
								if( ema2 > 10.7198 )
									ret := 0.250000
							if( ema1 > 10.6611 )
								if( ema1 <= 10.7234 )
									ret := -0.113208
								if( ema1 > 10.7234 )
									ret := 0.777778 // buy
						if( ema3 > 10.7899 )
							if( ema12 <= -0.09653 )
								if( VIP_VIM <= -0.321369 )
									ret := -0.636364
								if( VIP_VIM > -0.321369 )
									ret := 1.000000 // buy
							if( ema12 > -0.09653 )
								if( ema12 <= -0.044667 )
									ret := 0.903226 // buy
								if( ema12 > -0.044667 )
									ret := 0.600000
				if( ema13 > -0.055243 )
					if( tema <= 10.6805 )
						if( ema3 <= 10.716 )
							ret := 0.571429
						if( ema3 > 10.716 )
							if( ema1 <= 10.6757 )
								ret := -1.000000 // sell
							if( ema1 > 10.6757 )
								if( ema1 <= 10.7179 )
									ret := -0.230769
								if( ema1 > 10.7179 )
									ret := -0.750000 // sell
					if( tema > 10.6805 )
						if( VIP <= 0.915528 )
							if( tema <= 10.701 )
								ret := 0.600000
							if( tema > 10.701 )
								if( VIM <= 1.17263 )
									ret := -0.333333
								if( VIM > 1.17263 )
									ret := 0.250000
						if( VIP > 0.915528 )
							if( VIP_VIM <= -0.126307 )
								ret := 1.000000 // buy
							if( VIP_VIM > -0.126307 )
								if( ema13 <= -0.05149 )
									ret := -0.400000
								if( ema13 > -0.05149 )
									ret := 0.400000
		if( ema2 > 10.8266 )
			if( ema2 <= 10.8876 )
				if( tema <= 10.7378 )
					if( ema12 <= -0.060902 )
						if( tema <= 10.4973 )
							if( tema <= 10.4208 )
								ret := -0.500000
							if( tema > 10.4208 )
								ret := -1.000000 // sell
						if( tema > 10.4973 )
							if( ema13 <= -0.176732 )
								if( tema <= 10.5523 )
									ret := -0.166667
								if( tema > 10.5523 )
									ret := 0.812500 // buy
							if( ema13 > -0.176732 )
								if( ema3 <= 10.9147 )
									ret := -0.071429
								if( ema3 > 10.9147 )
									ret := -0.703704 // sell
					if( ema12 > -0.060902 )
						if( ema13 <= -0.065639 )
							if( ema13 <= -0.08549 )
								ret := 1.000000 // buy
							if( ema13 > -0.08549 )
								ret := 0.166667
						if( ema13 > -0.065639 )
							ret := 1.000000 // buy
				if( tema > 10.7378 )
					if( ema13 <= -0.090349 )
						if( VIM <= 1.2093 )
							if( ema3 <= 10.9424 )
								ret := -1.000000 // sell
							if( ema3 > 10.9424 )
								ret := -0.750000 // sell
						if( VIM > 1.2093 )
							ret := -0.500000
					if( ema13 > -0.090349 )
						if( VIP <= 0.922165 )
							if( VIP_VIM <= -0.359408 )
								if( ema13 <= -0.060859 )
									ret := 0.058824
								if( ema13 > -0.060859 )
									ret := -0.352941
							if( VIP_VIM > -0.359408 )
								if( ema12 <= -0.030637 )
									ret := -0.533333
								if( ema12 > -0.030637 )
									ret := -0.913043 // sell
						if( VIP > 0.922165 )
							if( ema3 <= 10.8792 )
								ret := 1.000000 // buy
							if( ema3 > 10.8792 )
								if( VIM <= 1.08752 )
									ret := -0.428571
								if( VIM > 1.08752 )
									ret := 0.000000
			if( ema2 > 10.8876 )
				if( ema1 <= 10.9612 )
					if( VIM <= 1.0128 )
						ret := -1.000000 // sell
					if( VIM > 1.0128 )
						if( ema13 <= -0.075067 )
							if( ema3 <= 11.0244 )
								if( ema12 <= -0.110799 )
									ret := 1.000000 // buy
								if( ema12 > -0.110799 )
									ret := -0.222798
							if( ema3 > 11.0244 )
								if( ema13 <= -0.40509 )
									ret := -0.095238
								if( ema13 > -0.40509 )
									ret := 0.638889
						if( ema13 > -0.075067 )
							if( VIM <= 1.20487 )
								if( ema13 <= -0.050307 )
									ret := 0.877698 // buy
								if( ema13 > -0.050307 )
									ret := 0.214286
							if( VIM > 1.20487 )
								if( ema2 <= 10.9872 )
									ret := 0.176471
								if( ema2 > 10.9872 )
									ret := -0.875000 // sell
				if( ema1 > 10.9612 )
					if( ema12 <= -0.043176 )
						if( ema3 <= 15.2383 )
							if( VIP_VIM <= -0.144879 )
								if( ema13 <= -0.501557 )
									ret := 0.634409
								if( ema13 > -0.501557 )
									ret := 0.142746
							if( VIP_VIM > -0.144879 )
								if( ema12 <= -0.073255 )
									ret := -0.675325
								if( ema12 > -0.073255 )
									ret := -0.010050
						if( ema3 > 15.2383 )
							if( ema3 <= 15.7339 )
								if( tema <= 15.3518 )
									ret := -0.182432
								if( tema > 15.3518 )
									ret := -0.791667 // sell
							if( ema3 > 15.7339 )
								if( ema1 <= 16.2718 )
									ret := 0.366337
								if( ema1 > 16.2718 )
									ret := -0.038261
					if( ema12 > -0.043176 )
						if( VIM <= 1.10402 )
							if( ema1 <= 11.038 )
								if( VIP_VIM <= -0.230689 )
									ret := 0.666667
								if( VIP_VIM > -0.230689 )
									ret := -0.918919 // sell
							if( ema1 > 11.038 )
								if( ema2 <= 13.6991 )
									ret := 0.177958
								if( ema2 > 13.6991 )
									ret := -0.140426
						if( VIM > 1.10402 )
							if( ema13 <= -0.078451 )
								if( ema12 <= -0.03044 )
									ret := 0.155932
								if( ema12 > -0.03044 )
									ret := -0.350000
							if( ema13 > -0.078451 )
								if( ema3 <= 14.0163 )
									ret := -0.161367
								if( ema3 > 14.0163 )
									ret := 0.092715
	if( ema13 > -0.047004 )
		if( ema3 <= 15.0159 )
			if( ema12 <= 0.218664 )
				if( ema13 <= 0.262598 )
					if( VIP_VIM <= -0.132625 )
						if( tema <= 13.0735 )
							if( ema1 <= 7.63043 )
								if( ema1 <= 4.61182 )
									ret := 0.086056
								if( ema1 > 4.61182 )
									ret := -0.061140
							if( ema1 > 7.63043 )
								if( ema1 <= 8.00993 )
									ret := 0.333333
								if( ema1 > 8.00993 )
									ret := 0.017299
						if( tema > 13.0735 )
							if( ema3 <= 15.0027 )
								if( ema12 <= 0.005793 )
									ret := -0.171271
								if( ema12 > 0.005793 )
									ret := -0.764706 // sell
							if( ema3 > 15.0027 )
								if( ema13 <= -0.025918 )
									ret := 1.000000 // buy
								if( ema13 > -0.025918 )
									ret := 0.750000 // buy
					if( VIP_VIM > -0.132625 )
						if( ema13 <= -0.016493 )
							if( VIM <= 1.0014 )
								if( ema1 <= 6.25783 )
									ret := -0.409091
								if( ema1 > 6.25783 )
									ret := 0.056827
							if( VIM > 1.0014 )
								if( ema3 <= 9.96309 )
									ret := 0.087446
								if( ema3 > 9.96309 )
									ret := 0.199900
						if( ema13 > -0.016493 )
							if( VIP <= 0.978299 )
								if( ema3 <= 11.4379 )
									ret := -0.047704
								if( ema3 > 11.4379 )
									ret := 0.091520
							if( VIP > 0.978299 )
								if( ema1 <= 12.3963 )
									ret := 0.051958
								if( ema1 > 12.3963 )
									ret := -0.018859
				if( ema13 > 0.262598 )
					if( VIP_VIM <= 0.615933 )
						if( tema <= 14.6066 )
							if( ema2 <= 14.2359 )
								if( ema13 <= 0.306704 )
									ret := -0.172727
								if( ema13 > 0.306704 )
									ret := -0.580000
							if( ema2 > 14.2359 )
								if( ema13 <= 0.29992 )
									ret := 0.250000
								if( ema13 > 0.29992 )
									ret := 1.000000 // buy
						if( tema > 14.6066 )
							if( VIM <= 0.740804 )
								ret := -0.250000
							if( VIM > 0.740804 )
								if( ema13 <= 0.266741 )
									ret := -0.500000
								if( ema13 > 0.266741 )
									ret := -0.950000 // sell
					if( VIP_VIM > 0.615933 )
						if( tema <= 11.3302 )
							if( VIP_VIM <= 0.689359 )
								if( ema13 <= 0.300175 )
									ret := 0.133333
								if( ema13 > 0.300175 )
									ret := 0.781250 // buy
							if( VIP_VIM > 0.689359 )
								if( ema13 <= 0.27099 )
									ret := -0.750000 // sell
								if( ema13 > 0.27099 )
									ret := 0.046512
						if( tema > 11.3302 )
							if( VIP_VIM <= 0.806294 )
								if( ema13 <= 0.408259 )
									ret := -0.551724
								if( ema13 > 0.408259 )
									ret := 0.750000 // buy
							if( VIP_VIM > 0.806294 )
								if( ema2 <= 12.0037 )
									ret := -0.260870
								if( ema2 > 12.0037 )
									ret := 0.653846
			if( ema12 > 0.218664 )
				if( ema3 <= 13.7889 )
					if( VIP_VIM <= 0.865497 )
						if( VIP <= 1.18734 )
							if( tema <= 10.297 )
								ret := 1.000000 // buy
							if( tema > 10.297 )
								if( ema13 <= 0.523479 )
									ret := -0.500000
								if( ema13 > 0.523479 )
									ret := -1.000000 // sell
						if( VIP > 1.18734 )
							if( ema3 <= 13.0964 )
								if( ema13 <= 0.573931 )
									ret := 0.732283 // buy
								if( ema13 > 0.573931 )
									ret := -0.142857
							if( ema3 > 13.0964 )
								if( tema <= 13.9472 )
									ret := -1.000000 // sell
								if( tema > 13.9472 )
									ret := 0.500000
					if( VIP_VIM > 0.865497 )
						if( ema13 <= 0.450878 )
							if( ema13 <= 0.39881 )
								ret := -1.000000 // sell
							if( ema13 > 0.39881 )
								if( ema12 <= 0.252835 )
									ret := 0.900000 // buy
								if( ema12 > 0.252835 )
									ret := 0.200000
						if( ema13 > 0.450878 )
							if( ema1 <= 11.6186 )
								ret := -0.250000
							if( ema1 > 11.6186 )
								ret := -1.000000 // sell
				if( ema3 > 13.7889 )
					if( VIP_VIM <= 0.513049 )
						ret := 1.000000 // buy
					if( VIP_VIM > 0.513049 )
						if( ema13 <= 0.728108 )
							if( VIM <= 0.665331 )
								ret := -0.750000 // sell
							if( VIM > 0.665331 )
								ret := -1.000000 // sell
						if( ema13 > 0.728108 )
							ret := -0.500000
		if( ema3 > 15.0159 )
			if( ema3 <= 15.1711 )
				if( tema <= 14.9842 )
					if( ema13 <= -0.037728 )
						ret := 0.000000
					if( ema13 > -0.037728 )
						ret := 1.000000 // buy
				if( tema > 14.9842 )
					if( tema <= 15.5887 )
						if( ema13 <= -0.039821 )
							ret := 0.000000
						if( ema13 > -0.039821 )
							if( VIM <= 0.802713 )
								ret := -1.000000 // sell
							if( VIM > 0.802713 )
								if( VIP_VIM <= 0.059571 )
									ret := -0.873563 // sell
								if( VIP_VIM > 0.059571 )
									ret := -0.653061
					if( tema > 15.5887 )
						if( ema12 <= 0.223376 )
							ret := 0.857143 // buy
						if( ema12 > 0.223376 )
							ret := -1.000000 // sell
			if( ema3 > 15.1711 )
				if( ema3 <= 15.566 )
					if( tema <= 15.4112 )
						if( ema12 <= 0.028733 )
							if( VIM <= 0.984328 )
								if( ema13 <= 0.025539 )
									ret := 0.863636 // buy
								if( ema13 > 0.025539 )
									ret := -0.454545
							if( VIM > 0.984328 )
								if( VIM <= 1.03358 )
									ret := -0.666667
								if( VIM > 1.03358 )
									ret := 0.187500
						if( ema12 > 0.028733 )
							ret := -1.000000 // sell
					if( tema > 15.4112 )
						if( ema2 <= 15.4349 )
							if( VIP <= 1.06579 )
								ret := 1.000000 // buy
							if( VIP > 1.06579 )
								if( VIM <= 0.842682 )
									ret := 0.827586 // buy
								if( VIM > 0.842682 )
									ret := 0.142857
						if( ema2 > 15.4349 )
							if( VIP_VIM <= 0.288688 )
								if( ema12 <= 0.010067 )
									ret := 0.500000
								if( ema12 > 0.010067 )
									ret := -0.575758
							if( VIP_VIM > 0.288688 )
								if( ema13 <= 0.306317 )
									ret := 0.641026
								if( ema13 > 0.306317 )
									ret := 0.000000
				if( ema3 > 15.566 )
					if( ema1 <= 17.2969 )
						if( ema3 <= 16.0117 )
							if( ema1 <= 15.9555 )
								if( ema13 <= 0.001784 )
									ret := 0.067416
								if( ema13 > 0.001784 )
									ret := -0.679245
							if( ema1 > 15.9555 )
								if( VIM <= 0.782966 )
									ret := -0.882353 // sell
								if( VIM > 0.782966 )
									ret := 0.439252
						if( ema3 > 16.0117 )
							if( ema3 <= 16.2209 )
								if( ema13 <= -0.016027 )
									ret := -0.297297
								if( ema13 > -0.016027 )
									ret := -0.838710 // sell
							if( ema3 > 16.2209 )
								if( ema2 <= 17.0033 )
									ret := -0.076087
								if( ema2 > 17.0033 )
									ret := -1.000000 // sell
					if( ema1 > 17.2969 )
						if( tema <= 17.9222 )
							if( ema12 <= 0.00365 )
								if( ema13 <= -0.014038 )
									ret := 0.933333 // buy
								if( ema13 > -0.014038 )
									ret := 0.642857
							if( ema12 > 0.00365 )
								if( VIP <= 1.08299 )
									ret := 0.028571
								if( VIP > 1.08299 )
									ret := 0.620690
						if( tema > 17.9222 )
							if( VIP <= 1.09807 )
								if( VIP_VIM <= -0.132575 )
									ret := 0.300000
								if( VIP_VIM > -0.132575 )
									ret := -0.494624
							if( VIP > 1.09807 )
								if( ema3 <= 20.8327 )
									ret := 0.165289
								if( ema3 > 20.8327 )
									ret := -0.666667
	
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
float op_operation = decision_tree_0_ATOMUSDT_15Min_d995b411(ema3, tema, ema2, ema12, ema13, ema1, VIP, VIM, VIP_VIM)

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


