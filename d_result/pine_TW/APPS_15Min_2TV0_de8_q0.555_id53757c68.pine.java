//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA, L_Vortex_Indicator
// ID_model: APPS_15Min_2TV0_53757c68 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_APPS_15Min_2TV0_53757c68", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_APPS_15Min_53757c68(ema3, tema, ema2, ema12, ema13, ema1, VIP, VIM, VIP_VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( VIP <= 1.21526 )
		if( ema13 <= -0.008822 )
			if( ema1 <= 1.24907 )
				if( ema12 <= -0.009794 )
					if( VIP <= 0.551436 )
						ret := -0.625000
					if( VIP > 0.551436 )
						if( tema <= 0.838012 )
							if( VIM <= 1.18728 )
								ret := 0.652174
							if( VIM > 1.18728 )
								if( ema1 <= 0.655486 )
									ret := 0.692308
								if( ema1 > 0.655486 )
									ret := 1.000000 // buy
						if( tema > 0.838012 )
							if( tema <= 0.865436 )
								ret := -0.444444
							if( tema > 0.865436 )
								if( VIP <= 1.12857 )
									ret := 0.667674
								if( VIP > 1.12857 )
									ret := -0.300000
				if( ema12 > -0.009794 )
					if( ema1 <= 0.657792 )
						if( ema2 <= 0.620602 )
							ret := 0.315789
						if( ema2 > 0.620602 )
							if( ema13 <= -0.013028 )
								ret := -1.000000 // sell
							if( ema13 > -0.013028 )
								ret := -0.727273 // sell
					if( ema1 > 0.657792 )
						if( VIP <= 1.06712 )
							if( ema12 <= -0.004154 )
								if( VIP <= 0.629393 )
									ret := -0.642857
								if( VIP > 0.629393 )
									ret := 0.492727
							if( ema12 > -0.004154 )
								if( tema <= 0.950824 )
									ret := -0.894737 // sell
								if( tema > 0.950824 )
									ret := 0.178571
						if( VIP > 1.06712 )
							if( VIP <= 1.09115 )
								if( ema3 <= 1.09673 )
									ret := -0.769231 // sell
								if( ema3 > 1.09673 )
									ret := -1.000000 // sell
							if( VIP > 1.09115 )
								if( VIP <= 1.13708 )
									ret := 0.450000
								if( VIP > 1.13708 )
									ret := -0.215686
			if( ema1 > 1.24907 )
				if( ema2 <= 42.8394 )
					if( ema1 <= 39.0475 )
						if( ema1 <= 38.818 )
							if( ema12 <= -0.471538 )
								if( tema <= 21.646 )
									ret := -0.342105
								if( tema > 21.646 )
									ret := 0.538462
							if( ema12 > -0.471538 )
								if( VIP_VIM <= -0.961497 )
									ret := 0.395833
								if( VIP_VIM > -0.961497 )
									ret := 0.056151
						if( ema1 > 38.818 )
							if( ema2 <= 39.2421 )
								if( ema12 <= -0.187554 )
									ret := -1.000000 // sell
								if( ema12 > -0.187554 )
									ret := -0.785714 // sell
							if( ema2 > 39.2421 )
								ret := -0.133333
					if( ema1 > 39.0475 )
						if( VIP_VIM <= -0.315888 )
							if( ema12 <= -0.161247 )
								if( VIP_VIM <= -0.459942 )
									ret := 0.540984
								if( VIP_VIM > -0.459942 )
									ret := 0.764228 // buy
							if( ema12 > -0.161247 )
								ret := -0.142857
						if( VIP_VIM > -0.315888 )
							if( ema3 <= 42.7472 )
								if( ema3 <= 41.447 )
									ret := 0.252747
								if( ema3 > 41.447 )
									ret := -0.240642
							if( ema3 > 42.7472 )
								if( ema2 <= 42.6928 )
									ret := 0.642857
								if( ema2 > 42.6928 )
									ret := 1.000000 // buy
				if( ema2 > 42.8394 )
					if( ema2 <= 44.0167 )
						if( tema <= 42.8955 )
							if( ema13 <= -0.995879 )
								if( ema3 <= 43.7441 )
									ret := 0.500000
								if( ema3 > 43.7441 )
									ret := -0.307692
							if( ema13 > -0.995879 )
								if( ema12 <= -0.224879 )
									ret := -0.697368
								if( ema12 > -0.224879 )
									ret := -1.000000 // sell
						if( tema > 42.8955 )
							if( tema <= 43.8328 )
								if( ema12 <= -0.104107 )
									ret := -0.134328
								if( ema12 > -0.104107 )
									ret := 0.709677 // buy
							if( tema > 43.8328 )
								ret := -1.000000 // sell
					if( ema2 > 44.0167 )
						if( tema <= 88.855 )
							if( ema2 <= 89.2357 )
								if( ema2 <= 44.4655 )
									ret := 0.494737
								if( ema2 > 44.4655 )
									ret := -0.016634
							if( ema2 > 89.2357 )
								if( ema3 <= 90.307 )
									ret := 0.681818
								if( ema3 > 90.307 )
									ret := 0.975610 // buy
						if( tema > 88.855 )
							if( VIP_VIM <= -0.238695 )
								if( ema2 <= 90.8605 )
									ret := -0.333333
								if( ema2 > 90.8605 )
									ret := 0.107143
							if( VIP_VIM > -0.238695 )
								if( ema12 <= -0.426956 )
									ret := 0.437500
								if( ema12 > -0.426956 )
									ret := -0.617886
		if( ema13 > -0.008822 )
			if( ema1 <= 0.689041 )
				if( VIP_VIM <= 0.044513 )
					if( ema2 <= 0.685753 )
						if( ema2 <= 0.617212 )
							if( ema12 <= 3.7e-05 )
								ret := 0.500000
							if( ema12 > 3.7e-05 )
								ret := 0.904762 // buy
						if( ema2 > 0.617212 )
							if( ema3 <= 0.666863 )
								if( ema1 <= 0.632734 )
									ret := -0.966667 // sell
								if( ema1 > 0.632734 )
									ret := -0.666667
							if( ema3 > 0.666863 )
								if( ema12 <= 0.002073 )
									ret := 0.031088
								if( ema12 > 0.002073 )
									ret := -0.809524 // sell
					if( ema2 > 0.685753 )
						if( VIP <= 0.900774 )
							ret := 0.136364
						if( VIP > 0.900774 )
							if( VIP_VIM <= -0.046524 )
								if( VIP <= 1.0814 )
									ret := 0.982143 // buy
								if( VIP > 1.0814 )
									ret := 0.583333
							if( VIP_VIM > -0.046524 )
								if( ema1 <= 0.686945 )
									ret := -0.166667
								if( ema1 > 0.686945 )
									ret := 0.631579
				if( VIP_VIM > 0.044513 )
					if( tema <= 0.693466 )
						if( ema13 <= 0.006514 )
							if( VIP <= 1.07233 )
								if( VIM <= 0.935856 )
									ret := 0.660377
								if( VIM > 0.935856 )
									ret := 0.953125 // buy
							if( VIP > 1.07233 )
								if( ema2 <= 0.685978 )
									ret := 0.228571
								if( ema2 > 0.685978 )
									ret := 1.000000 // buy
						if( ema13 > 0.006514 )
							if( ema13 <= 0.008804 )
								if( ema2 <= 0.624498 )
									ret := -0.266667
								if( ema2 > 0.624498 )
									ret := 0.545455
							if( ema13 > 0.008804 )
								if( tema <= 0.675027 )
									ret := 0.882353 // buy
								if( tema > 0.675027 )
									ret := 0.200000
					if( tema > 0.693466 )
						ret := -0.357143
			if( ema1 > 0.689041 )
				if( ema1 <= 86.3496 )
					if( ema2 <= 0.68705 )
						if( VIP <= 1.08699 )
							ret := -1.000000 // sell
						if( VIP > 1.08699 )
							ret := -0.416667
					if( ema2 > 0.68705 )
						if( VIP <= 0.952564 )
							if( ema12 <= -0.003346 )
								if( ema3 <= 1.45208 )
									ret := 0.291990
								if( ema3 > 1.45208 )
									ret := 0.008065
							if( ema12 > -0.003346 )
								if( ema13 <= 0.199688 )
									ret := -0.207463
								if( ema13 > 0.199688 )
									ret := 0.511628
						if( VIP > 0.952564 )
							if( VIP_VIM <= -0.13695 )
								if( ema13 <= 0.001012 )
									ret := 0.034195
								if( ema13 > 0.001012 )
									ret := -0.238338
							if( VIP_VIM > -0.13695 )
								if( VIP_VIM <= 0.478269 )
									ret := 0.024129
								if( VIP_VIM > 0.478269 )
									ret := -0.345550
				if( ema1 > 86.3496 )
					if( ema13 <= 1.46791 )
						if( ema12 <= 0.044629 )
							if( VIP_VIM <= -0.279837 )
								ret := 0.437500
							if( VIP_VIM > -0.279837 )
								if( VIP_VIM <= -0.117725 )
									ret := -0.533333
								if( VIP_VIM > -0.117725 )
									ret := -0.043478
						if( ema12 > 0.044629 )
							if( ema2 <= 87.1265 )
								if( VIM <= 1.02086 )
									ret := 0.090909
								if( VIM > 1.02086 )
									ret := -0.766667 // sell
							if( ema2 > 87.1265 )
								if( ema3 <= 92.9553 )
									ret := -0.687500
								if( ema3 > 92.9553 )
									ret := 0.000000
					if( ema13 > 1.46791 )
						if( ema3 <= 86.5009 )
							ret := -0.187500
						if( ema3 > 86.5009 )
							if( ema3 <= 87.5655 )
								ret := 0.916667 // buy
							if( ema3 > 87.5655 )
								ret := 0.117647
	if( VIP > 1.21526 )
		if( ema12 <= -0.000888 )
			if( VIP_VIM <= -0.345091 )
				if( ema12 <= -0.184138 )
					if( tema <= 53.1826 )
						if( ema3 <= 20.1946 )
							if( ema1 <= 17.708 )
								if( VIP_VIM <= -0.772349 )
									ret := 0.571429
								if( VIP_VIM > -0.772349 )
									ret := -0.333333
							if( ema1 > 17.708 )
								ret := -1.000000 // sell
						if( ema3 > 20.1946 )
							if( ema13 <= -0.814451 )
								if( ema12 <= -0.554324 )
									ret := 1.000000 // buy
								if( ema12 > -0.554324 )
									ret := 0.777778 // buy
							if( ema13 > -0.814451 )
								if( VIP <= 1.30243 )
									ret := 0.666667
								if( VIP > 1.30243 )
									ret := 0.297030
					if( tema > 53.1826 )
						if( tema <= 61.1769 )
							if( VIM <= 2.33564 )
								ret := -0.904762 // sell
							if( VIM > 2.33564 )
								if( VIP_VIM <= -0.632542 )
									ret := -0.571429
								if( VIP_VIM > -0.632542 )
									ret := -0.090909
						if( tema > 61.1769 )
							if( ema3 <= 78.2118 )
								if( ema12 <= -0.374514 )
									ret := 0.119048
								if( ema12 > -0.374514 )
									ret := 0.695652
							if( ema3 > 78.2118 )
								if( ema1 <= 82.083 )
									ret := -0.869565 // sell
								if( ema1 > 82.083 )
									ret := 0.400000
				if( ema12 > -0.184138 )
					if( ema1 <= 1.86958 )
						if( VIP_VIM <= -0.5034 )
							if( VIP <= 1.5065 )
								if( ema12 <= -0.011475 )
									ret := 0.605634
								if( ema12 > -0.011475 )
									ret := 0.897436 // buy
							if( VIP > 1.5065 )
								if( ema12 <= -0.009304 )
									ret := -0.071429
								if( ema12 > -0.009304 )
									ret := -0.416667
						if( VIP_VIM > -0.5034 )
							if( ema1 <= 0.971453 )
								ret := 0.600000
							if( ema1 > 0.971453 )
								if( ema13 <= -0.017919 )
									ret := -0.629630
								if( ema13 > -0.017919 )
									ret := 0.111111
					if( ema1 > 1.86958 )
						if( ema2 <= 2.29288 )
							if( ema2 <= 2.01641 )
								if( VIM <= 1.9412 )
									ret := -0.954545 // sell
								if( VIM > 1.9412 )
									ret := -0.711538 // sell
							if( ema2 > 2.01641 )
								if( ema2 <= 2.14479 )
									ret := -0.100000
								if( ema2 > 2.14479 )
									ret := -0.722222 // sell
						if( ema2 > 2.29288 )
							if( VIP_VIM <= -0.6746 )
								if( ema1 <= 10.5748 )
									ret := -0.163265
								if( ema1 > 10.5748 )
									ret := 0.220833
							if( VIP_VIM > -0.6746 )
								if( tema <= 5.83615 )
									ret := -0.022654
								if( tema > 5.83615 )
									ret := -0.320526
			if( VIP_VIM > -0.345091 )
				if( ema3 <= 5.50239 )
					if( VIM <= 2.62866 )
						if( ema3 <= 4.88399 )
							if( ema3 <= 4.56614 )
								if( ema1 <= 0.690389 )
									ret := 0.765957 // buy
								if( ema1 > 0.690389 )
									ret := 0.247563
							if( ema3 > 4.56614 )
								if( ema2 <= 4.78883 )
									ret := -0.720930 // sell
								if( ema2 > 4.78883 )
									ret := 0.000000
						if( ema3 > 4.88399 )
							if( ema13 <= -0.003962 )
								if( ema12 <= -0.011674 )
									ret := 0.859756 // buy
								if( ema12 > -0.011674 )
									ret := 0.164179
							if( ema13 > -0.003962 )
								ret := -0.480000
					if( VIM > 2.62866 )
						if( VIP <= 4.14749 )
							if( ema3 <= 4.3686 )
								if( tema <= 2.78344 )
									ret := -0.607843
								if( tema > 2.78344 )
									ret := -0.125000
							if( ema3 > 4.3686 )
								if( ema1 <= 5.207 )
									ret := 0.666667
								if( ema1 > 5.207 )
									ret := 0.000000
						if( VIP > 4.14749 )
							if( ema1 <= 4.44833 )
								ret := -0.562500
							if( ema1 > 4.44833 )
								ret := -1.000000 // sell
				if( ema3 > 5.50239 )
					if( ema1 <= 7.06165 )
						if( ema2 <= 6.9335 )
							if( ema13 <= -0.030732 )
								if( ema3 <= 5.62156 )
									ret := 0.866667 // buy
								if( ema3 > 5.62156 )
									ret := -0.388889
							if( ema13 > -0.030732 )
								if( ema1 <= 5.57919 )
									ret := -0.640000
								if( ema1 > 5.57919 )
									ret := 0.204380
						if( ema2 > 6.9335 )
							if( VIP <= 1.37974 )
								ret := -0.733333 // sell
							if( VIP > 1.37974 )
								ret := -1.000000 // sell
					if( ema1 > 7.06165 )
						if( VIP <= 1.7374 )
							if( ema12 <= -0.750237 )
								if( ema1 <= 85.8533 )
									ret := 1.000000 // buy
								if( ema1 > 85.8533 )
									ret := 0.272727
							if( ema12 > -0.750237 )
								if( VIP <= 1.72669 )
									ret := 0.000800
								if( VIP > 1.72669 )
									ret := -0.685714
						if( VIP > 1.7374 )
							if( ema3 <= 9.03279 )
								if( tema <= 8.5176 )
									ret := 0.379310
								if( tema > 8.5176 )
									ret := 0.983607 // buy
							if( ema3 > 9.03279 )
								if( VIP_VIM <= 0.242006 )
									ret := 0.048429
								if( VIP_VIM > 0.242006 )
									ret := 0.370370
		if( ema12 > -0.000888 )
			if( ema1 <= 0.771778 )
				if( ema13 <= 0.005538 )
					if( VIP <= 1.2405 )
						ret := 0.785714 // buy
					if( VIP > 1.2405 )
						if( ema1 <= 0.690798 )
							if( VIP <= 1.34785 )
								ret := 0.000000
							if( VIP > 1.34785 )
								ret := 0.636364
						if( ema1 > 0.690798 )
							if( tema <= 0.706662 )
								if( VIP <= 1.30093 )
									ret := -0.900000 // sell
								if( VIP > 1.30093 )
									ret := -0.115942
							if( tema > 0.706662 )
								if( ema12 <= 0.000146 )
									ret := -0.230769
								if( ema12 > 0.000146 )
									ret := -1.000000 // sell
				if( ema13 > 0.005538 )
					if( ema12 <= 0.011714 )
						if( ema3 <= 0.70306 )
							if( ema13 <= 0.010527 )
								ret := -0.588235
							if( ema13 > 0.010527 )
								if( VIP_VIM <= 0.45305 )
									ret := -0.714286 // sell
								if( VIP_VIM > 0.45305 )
									ret := -1.000000 // sell
						if( ema3 > 0.70306 )
							if( ema13 <= 0.011628 )
								ret := -1.000000 // sell
							if( ema13 > 0.011628 )
								ret := -0.875000 // sell
					if( ema12 > 0.011714 )
						if( ema1 <= 0.711792 )
							ret := -1.000000 // sell
						if( ema1 > 0.711792 )
							ret := -0.900000 // sell
			if( ema1 > 0.771778 )
				if( tema <= 12.947 )
					if( VIM <= 1.40023 )
						if( ema3 <= 6.84473 )
							if( tema <= 6.54654 )
								if( ema3 <= 6.31726 )
									ret := -0.052912
								if( ema3 > 6.31726 )
									ret := -0.628205
							if( tema > 6.54654 )
								if( ema12 <= 0.031558 )
									ret := 0.600000
								if( ema12 > 0.031558 )
									ret := 0.137755
						if( ema3 > 6.84473 )
							if( ema2 <= 7.17123 )
								if( ema2 <= 6.94517 )
									ret := 0.073171
								if( ema2 > 6.94517 )
									ret := -0.538462
							if( ema2 > 7.17123 )
								if( ema12 <= 0.080908 )
									ret := -0.144444
								if( ema12 > 0.080908 )
									ret := 0.113636
					if( VIM > 1.40023 )
						if( ema2 <= 0.918199 )
							if( VIP <= 1.97869 )
								if( ema3 <= 0.901774 )
									ret := 0.648148
								if( ema3 > 0.901774 )
									ret := 0.238095
							if( VIP > 1.97869 )
								ret := -0.250000
						if( ema2 > 0.918199 )
							if( ema13 <= 0.012414 )
								if( tema <= 1.27552 )
									ret := -0.601810
								if( tema > 1.27552 )
									ret := -0.116556
							if( ema13 > 0.012414 )
								if( VIM <= 3.91727 )
									ret := -0.343423
								if( VIM > 3.91727 )
									ret := 0.138211
				if( tema > 12.947 )
					if( ema1 <= 12.8804 )
						if( ema12 <= 0.198178 )
							if( ema12 <= 0.115466 )
								ret := 0.909091 // buy
							if( ema12 > 0.115466 )
								ret := 1.000000 // buy
						if( ema12 > 0.198178 )
							ret := 0.642857
					if( ema1 > 12.8804 )
						if( ema3 <= 59.6001 )
							if( tema <= 59.181 )
								if( ema1 <= 57.6411 )
									ret := -0.064256
								if( ema1 > 57.6411 )
									ret := 0.651685
							if( tema > 59.181 )
								if( tema <= 59.6504 )
									ret := -0.673077
								if( tema > 59.6504 )
									ret := -0.194631
						if( ema3 > 59.6001 )
							if( ema13 <= 1.8272 )
								if( ema3 <= 84.6748 )
									ret := 0.081900
								if( ema3 > 84.6748 )
									ret := -0.211488
							if( ema13 > 1.8272 )
								if( VIM <= 0.781052 )
									ret := -0.125561
								if( VIM > 0.781052 )
									ret := -0.653333
	
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
float op_operation = decision_tree_0_APPS_15Min_53757c68(ema3, tema, ema2, ema12, ema13, ema1, VIP, VIM, VIP_VIM)

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


