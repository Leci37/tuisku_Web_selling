//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Triple_EMA
// ID_model: U_1Min_1T00_187d979d Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_U_1Min_1T00_187d979d", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_U_1Min_187d979d(ema2, ema1, ema12, ema3, ema13, tema)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ema12 <= -0.025349 )
		if( tema <= 15.4931 )
			if( ema12 <= -0.079351 )
				if( tema <= 14.299 )
					if( ema2 <= 14.2126 )
						if( ema3 <= 14.194 )
							if( ema2 <= 13.8381 )
								ret := 1.000000 // buy
							if( ema2 > 13.8381 )
								if( ema2 <= 13.9529 )
									ret := 0.000000
								if( ema2 > 13.9529 )
									ret := 0.888889 // buy
						if( ema3 > 14.194 )
							ret := 0.000000
					if( ema2 > 14.2126 )
						ret := 1.000000 // buy
				if( tema > 14.299 )
					if( ema12 <= -0.118061 )
						if( tema <= 14.3592 )
							ret := 0.500000
						if( tema > 14.3592 )
							ret := 1.000000 // buy
					if( ema12 > -0.118061 )
						if( ema1 <= 14.9106 )
							if( tema <= 14.3455 )
								ret := 0.600000
							if( tema > 14.3455 )
								if( ema12 <= -0.093812 )
									ret := -0.500000
								if( ema12 > -0.093812 )
									ret := -1.000000 // sell
						if( ema1 > 14.9106 )
							if( ema1 <= 15.2187 )
								if( ema3 <= 15.2002 )
									ret := 0.750000 // buy
								if( ema3 > 15.2002 )
									ret := 1.000000 // buy
							if( ema1 > 15.2187 )
								if( ema2 <= 15.505 )
									ret := -1.000000 // sell
								if( ema2 > 15.505 )
									ret := 0.666667
			if( ema12 > -0.079351 )
				if( tema <= 13.5993 )
					if( ema1 <= 13.3032 )
						ret := 1.000000 // buy
					if( ema1 > 13.3032 )
						if( ema13 <= -0.137956 )
							ret := -0.500000
						if( ema13 > -0.137956 )
							if( ema1 <= 13.3716 )
								ret := -0.750000 // sell
							if( ema1 > 13.3716 )
								ret := -1.000000 // sell
				if( tema > 13.5993 )
					if( tema <= 14.0251 )
						if( ema1 <= 13.8047 )
							if( ema13 <= -0.057648 )
								ret := 1.000000 // buy
							if( ema13 > -0.057648 )
								if( ema2 <= 13.7668 )
									ret := -0.500000
								if( ema2 > 13.7668 )
									ret := -0.800000 // sell
						if( ema1 > 13.8047 )
							if( ema13 <= -0.115078 )
								if( ema1 <= 13.9041 )
									ret := 1.000000 // buy
								if( ema1 > 13.9041 )
									ret := -0.333333
							if( ema13 > -0.115078 )
								if( ema2 <= 13.8639 )
									ret := 0.800000 // buy
								if( ema2 > 13.8639 )
									ret := 1.000000 // buy
					if( tema > 14.0251 )
						if( ema3 <= 15.55 )
							if( ema3 <= 15.496 )
								if( ema2 <= 15.2727 )
									ret := 0.152482
								if( ema2 > 15.2727 )
									ret := 0.595238
							if( ema3 > 15.496 )
								if( ema1 <= 15.4675 )
									ret := -0.727273 // sell
								if( ema1 > 15.4675 )
									ret := 0.083333
						if( ema3 > 15.55 )
							if( ema13 <= -0.081798 )
								if( tema <= 15.4583 )
									ret := 0.736842 // buy
								if( tema > 15.4583 )
									ret := -1.000000 // sell
							if( ema13 > -0.081798 )
								if( ema1 <= 15.5304 )
									ret := 0.777778 // buy
								if( ema1 > 15.5304 )
									ret := 1.000000 // buy
		if( tema > 15.4931 )
			if( ema3 <= 25.3132 )
				if( ema13 <= -0.119079 )
					if( tema <= 21.4543 )
						if( ema1 <= 17.0482 )
							if( tema <= 16.7706 )
								if( ema3 <= 16.8885 )
									ret := 0.014851
								if( ema3 > 16.8885 )
									ret := 0.804878 // buy
							if( tema > 16.7706 )
								if( tema <= 16.8835 )
									ret := -0.900000 // sell
								if( tema > 16.8835 )
									ret := -0.250000
						if( ema1 > 17.0482 )
							if( ema1 <= 20.6281 )
								if( tema <= 20.4874 )
									ret := 0.485839
								if( tema > 20.4874 )
									ret := -0.869565 // sell
							if( ema1 > 20.6281 )
								if( ema13 <= -0.171928 )
									ret := 0.941748 // buy
								if( ema13 > -0.171928 )
									ret := 0.616279
					if( tema > 21.4543 )
						if( tema <= 21.6188 )
							if( ema2 <= 21.5979 )
								ret := -1.000000 // sell
							if( ema2 > 21.5979 )
								if( ema12 <= -0.06587 )
									ret := -0.580000
								if( ema12 > -0.06587 )
									ret := 1.000000 // buy
						if( tema > 21.6188 )
							if( tema <= 24.4411 )
								if( ema12 <= -0.124569 )
									ret := -0.250000
								if( ema12 > -0.124569 )
									ret := 0.284553
							if( tema > 24.4411 )
								if( ema2 <= 24.8563 )
									ret := -0.636364
								if( ema2 > 24.8563 )
									ret := 0.200000
				if( ema13 > -0.119079 )
					if( ema13 <= -0.06648 )
						if( ema1 <= 15.9608 )
							if( ema1 <= 15.6003 )
								if( ema12 <= -0.04935 )
									ret := -0.750000 // sell
								if( ema12 > -0.04935 )
									ret := -1.000000 // sell
							if( ema1 > 15.6003 )
								if( ema3 <= 15.7242 )
									ret := 0.846154 // buy
								if( ema3 > 15.7242 )
									ret := -0.484663
						if( ema1 > 15.9608 )
							if( ema2 <= 16.2122 )
								if( ema12 <= -0.036019 )
									ret := 0.417476
								if( ema12 > -0.036019 )
									ret := 0.837209 // buy
							if( ema2 > 16.2122 )
								if( tema <= 20.6225 )
									ret := -0.038395
								if( tema > 20.6225 )
									ret := 0.172036
					if( ema13 > -0.06648 )
						if( ema12 <= -0.052634 )
							if( ema3 <= 20.4433 )
								ret := -1.000000 // sell
							if( ema3 > 20.4433 )
								if( ema2 <= 23.4757 )
									ret := 0.000000
								if( ema2 > 23.4757 )
									ret := -1.000000 // sell
						if( ema12 > -0.052634 )
							if( tema <= 16.1971 )
								if( ema12 <= -0.034156 )
									ret := 0.585034
								if( ema12 > -0.034156 )
									ret := 0.232346
							if( tema > 16.1971 )
								if( ema2 <= 24.8061 )
									ret := 0.117580
								if( ema2 > 24.8061 )
									ret := 0.586207
			if( ema3 > 25.3132 )
				if( ema13 <= -0.05482 )
					if( ema1 <= 25.3566 )
						if( tema <= 25.3064 )
							if( tema <= 25.2493 )
								if( ema13 <= -0.065957 )
									ret := 0.956522 // buy
								if( ema13 > -0.065957 )
									ret := 0.500000
							if( tema > 25.2493 )
								ret := 1.000000 // buy
						if( tema > 25.3064 )
							ret := 0.500000
					if( ema1 > 25.3566 )
						ret := 0.000000
				if( ema13 > -0.05482 )
					if( ema12 <= -0.028545 )
						ret := -1.000000 // sell
					if( ema12 > -0.028545 )
						if( ema2 <= 25.3425 )
							ret := 0.250000
						if( ema2 > 25.3425 )
							ret := -0.400000
	if( ema12 > -0.025349 )
		if( ema13 <= 0.054103 )
			if( ema12 <= 0.00376 )
				if( ema2 <= 14.2664 )
					if( ema2 <= 13.8345 )
						if( ema3 <= 13.7245 )
							if( ema1 <= 13.671 )
								ret := 0.000000
							if( ema1 > 13.671 )
								ret := 1.000000 // buy
						if( ema3 > 13.7245 )
							if( ema13 <= -0.015233 )
								if( tema <= 13.7986 )
									ret := -0.555556
								if( tema > 13.7986 )
									ret := 0.909091 // buy
							if( ema13 > -0.015233 )
								if( tema <= 13.8346 )
									ret := -1.000000 // sell
								if( tema > 13.8346 )
									ret := -0.600000
					if( ema2 > 13.8345 )
						if( ema1 <= 14.2616 )
							if( ema2 <= 13.8612 )
								if( ema3 <= 13.8403 )
									ret := 0.250000
								if( ema3 > 13.8403 )
									ret := 0.937500 // buy
							if( ema2 > 13.8612 )
								if( ema1 <= 14.0349 )
									ret := 0.076577
								if( ema1 > 14.0349 )
									ret := 0.375921
						if( ema1 > 14.2616 )
							if( tema <= 14.2738 )
								ret := 1.000000 // buy
							if( tema > 14.2738 )
								ret := 0.666667
				if( ema2 > 14.2664 )
					if( tema <= 24.2809 )
						if( tema <= 19.9957 )
							if( ema13 <= -0.036725 )
								if( tema <= 15.7578 )
									ret := 0.241692
								if( tema > 15.7578 )
									ret := -0.117353
							if( ema13 > -0.036725 )
								if( ema2 <= 18.2944 )
									ret := 0.052700
								if( ema2 > 18.2944 )
									ret := -0.060185
						if( tema > 19.9957 )
							if( ema3 <= 20.5596 )
								if( ema1 <= 20.0622 )
									ret := 0.662651
								if( ema1 > 20.0622 )
									ret := 0.230703
							if( ema3 > 20.5596 )
								if( ema12 <= -0.005764 )
									ret := 0.099847
								if( ema12 > -0.005764 )
									ret := -0.003245
					if( tema > 24.2809 )
						if( ema12 <= -0.004298 )
							if( ema2 <= 25.3743 )
								if( ema2 <= 25.209 )
									ret := -0.017500
								if( ema2 > 25.209 )
									ret := 0.219101
							if( ema2 > 25.3743 )
								if( ema3 <= 25.3933 )
									ret := -0.823529 // sell
								if( ema3 > 25.3933 )
									ret := -0.107527
						if( ema12 > -0.004298 )
							if( ema3 <= 24.4598 )
								if( tema <= 24.3924 )
									ret := -0.294118
								if( tema > 24.3924 )
									ret := -0.774194 // sell
							if( ema3 > 24.4598 )
								if( ema3 <= 24.6 )
									ret := 0.136364
								if( ema3 > 24.6 )
									ret := -0.196552
			if( ema12 > 0.00376 )
				if( tema <= 15.7006 )
					if( ema3 <= 15.4957 )
						if( ema3 <= 15.3406 )
							if( tema <= 15.2642 )
								if( ema2 <= 15.0621 )
									ret := -0.099796
								if( ema2 > 15.0621 )
									ret := 0.432432
							if( tema > 15.2642 )
								if( ema1 <= 15.2753 )
									ret := -0.604317
								if( ema1 > 15.2753 )
									ret := -0.147959
						if( ema3 > 15.3406 )
							if( ema2 <= 15.4019 )
								if( tema <= 15.3806 )
									ret := 0.840000 // buy
								if( tema > 15.3806 )
									ret := 0.420455
							if( ema2 > 15.4019 )
								if( ema12 <= 0.026885 )
									ret := -0.011173
								if( ema12 > 0.026885 )
									ret := 0.636364
					if( ema3 > 15.4957 )
						if( ema13 <= 0.020018 )
							if( ema2 <= 15.5448 )
								if( ema2 <= 15.5431 )
									ret := -0.416667
								if( ema2 > 15.5431 )
									ret := -1.000000 // sell
							if( ema2 > 15.5448 )
								if( ema1 <= 15.5714 )
									ret := 0.380000
								if( ema1 > 15.5714 )
									ret := -0.257310
						if( ema13 > 0.020018 )
							if( ema12 <= 0.010579 )
								if( ema2 <= 15.5602 )
									ret := -0.142857
								if( ema2 > 15.5602 )
									ret := -0.888889 // sell
							if( ema12 > 0.010579 )
								if( ema2 <= 15.5823 )
									ret := -0.551020
								if( ema2 > 15.5823 )
									ret := -0.020000
				if( tema > 15.7006 )
					if( ema2 <= 15.7494 )
						if( ema1 <= 15.7252 )
							if( ema2 <= 15.6646 )
								if( ema2 <= 15.6548 )
									ret := 0.583333
								if( ema2 > 15.6548 )
									ret := 1.000000 // buy
							if( ema2 > 15.6646 )
								if( ema3 <= 15.6802 )
									ret := -0.615385
								if( ema3 > 15.6802 )
									ret := 0.183333
						if( ema1 > 15.7252 )
							if( ema12 <= 0.004767 )
								ret := 0.166667
							if( ema12 > 0.004767 )
								if( ema13 <= 0.049259 )
									ret := 0.730769 // buy
								if( ema13 > 0.049259 )
									ret := 0.000000
					if( ema2 > 15.7494 )
						if( ema2 <= 19.6053 )
							if( ema2 <= 18.4749 )
								if( tema <= 18.3655 )
									ret := -0.028815
								if( tema > 18.3655 )
									ret := 0.447761
							if( ema2 > 18.4749 )
								if( ema2 <= 18.9632 )
									ret := -0.383721
								if( ema2 > 18.9632 )
									ret := -0.103825
						if( ema2 > 19.6053 )
							if( ema1 <= 24.9075 )
								if( ema1 <= 24.8324 )
									ret := 0.026631
								if( ema1 > 24.8324 )
									ret := 0.468468
							if( ema1 > 24.9075 )
								if( ema3 <= 25.461 )
									ret := -0.163594
								if( ema3 > 25.461 )
									ret := -0.736842 // sell
		if( ema13 > 0.054103 )
			if( tema <= 20.6702 )
				if( tema <= 15.9002 )
					if( ema3 <= 14.1322 )
						if( ema12 <= 0.041163 )
							if( ema13 <= 0.066317 )
								if( ema13 <= 0.062264 )
									ret := -0.818182 // sell
								if( ema13 > 0.062264 )
									ret := -1.000000 // sell
							if( ema13 > 0.066317 )
								if( ema2 <= 13.5756 )
									ret := 1.000000 // buy
								if( ema2 > 13.5756 )
									ret := 0.200000
						if( ema12 > 0.041163 )
							if( ema12 <= 0.162911 )
								if( ema1 <= 13.425 )
									ret := -1.000000 // sell
								if( ema1 > 13.425 )
									ret := 0.711268 // buy
							if( ema12 > 0.162911 )
								if( ema3 <= 13.7727 )
									ret := -1.000000 // sell
								if( ema3 > 13.7727 )
									ret := -0.111111
					if( ema3 > 14.1322 )
						if( ema2 <= 14.3949 )
							if( ema12 <= 0.066945 )
								if( ema2 <= 14.3011 )
									ret := -0.571429
								if( ema2 > 14.3011 )
									ret := -0.906250 // sell
							if( ema12 > 0.066945 )
								if( ema13 <= 0.190436 )
									ret := 1.000000 // buy
								if( ema13 > 0.190436 )
									ret := -0.764706 // sell
						if( ema2 > 14.3949 )
							if( ema2 <= 14.5532 )
								if( ema12 <= 0.027132 )
									ret := -0.111111
								if( ema12 > 0.027132 )
									ret := 0.641975
							if( ema2 > 14.5532 )
								if( ema12 <= 0.032119 )
									ret := -0.452632
								if( ema12 > 0.032119 )
									ret := -0.014742
				if( tema > 15.9002 )
					if( tema <= 16.0196 )
						if( ema2 <= 15.8598 )
							if( ema1 <= 15.8951 )
								if( ema13 <= 0.588973 )
									ret := 0.697674
								if( ema13 > 0.588973 )
									ret := -0.250000
							if( ema1 > 15.8951 )
								if( ema2 <= 15.8538 )
									ret := -0.333333
								if( ema2 > 15.8538 )
									ret := -1.000000 // sell
						if( ema2 > 15.8598 )
							if( ema2 <= 15.9247 )
								if( ema12 <= 0.034001 )
									ret := 1.000000 // buy
								if( ema12 > 0.034001 )
									ret := 0.756098 // buy
							if( ema2 > 15.9247 )
								if( ema2 <= 15.9647 )
									ret := 0.000000
								if( ema2 > 15.9647 )
									ret := 1.000000 // buy
					if( tema > 16.0196 )
						if( ema2 <= 16.0037 )
							if( ema13 <= 0.060027 )
								ret := 1.000000 // buy
							if( ema13 > 0.060027 )
								if( ema3 <= 15.9357 )
									ret := -0.190476
								if( ema3 > 15.9357 )
									ret := -0.761905 // sell
						if( ema2 > 16.0037 )
							if( tema <= 16.3301 )
								if( ema2 <= 16.1592 )
									ret := 0.314894
								if( ema2 > 16.1592 )
									ret := 0.715328 // buy
							if( tema > 16.3301 )
								if( tema <= 16.3443 )
									ret := -0.468085
								if( tema > 16.3443 )
									ret := 0.163875
			if( tema > 20.6702 )
				if( ema3 <= 20.5889 )
					if( ema13 <= 0.173329 )
						if( ema12 <= 0.075257 )
							if( ema13 <= 0.099671 )
								if( ema13 <= 0.077708 )
									ret := -0.809524 // sell
								if( ema13 > 0.077708 )
									ret := 0.400000
							if( ema13 > 0.099671 )
								if( ema3 <= 20.568 )
									ret := -0.960000 // sell
								if( ema3 > 20.568 )
									ret := -0.500000
						if( ema12 > 0.075257 )
							if( tema <= 20.7872 )
								if( ema3 <= 20.4906 )
									ret := 0.210526
								if( ema3 > 20.4906 )
									ret := -1.000000 // sell
							if( tema > 20.7872 )
								ret := 1.000000 // buy
					if( ema13 > 0.173329 )
						if( ema1 <= 20.6925 )
							if( ema12 <= 0.138768 )
								ret := -1.000000 // sell
							if( ema12 > 0.138768 )
								if( ema12 <= 0.167041 )
									ret := -0.750000 // sell
								if( ema12 > 0.167041 )
									ret := -1.000000 // sell
						if( ema1 > 20.6925 )
							ret := 0.250000
				if( ema3 > 20.5889 )
					if( ema13 <= 0.216501 )
						if( ema12 <= 0.105678 )
							if( tema <= 23.8672 )
								if( ema3 <= 22.8682 )
									ret := 0.065124
								if( ema3 > 22.8682 )
									ret := -0.182495
							if( tema > 23.8672 )
								if( tema <= 23.8882 )
									ret := 0.771429 // buy
								if( tema > 23.8882 )
									ret := 0.137380
						if( ema12 > 0.105678 )
							if( ema2 <= 23.0571 )
								if( ema3 <= 21.3613 )
									ret := 0.363636
								if( ema3 > 21.3613 )
									ret := 0.976190 // buy
							if( ema2 > 23.0571 )
								if( ema2 <= 24.429 )
									ret := -0.090909
								if( ema2 > 24.429 )
									ret := -0.833333 // sell
					if( ema13 > 0.216501 )
						if( ema1 <= 23.4553 )
							if( ema13 <= 0.297507 )
								if( ema12 <= 0.126518 )
									ret := -0.846154 // sell
								if( ema12 > 0.126518 )
									ret := -0.068182
							if( ema13 > 0.297507 )
								if( ema12 <= 0.224586 )
									ret := 0.708333 // buy
								if( ema12 > 0.224586 )
									ret := -1.000000 // sell
						if( ema1 > 23.4553 )
							if( ema1 <= 23.5259 )
								if( ema12 <= 0.110536 )
									ret := -0.333333
								if( ema12 > 0.110536 )
									ret := -0.897959 // sell
							if( ema1 > 23.5259 )
								if( tema <= 23.6762 )
									ret := 1.000000 // buy
								if( tema > 23.6762 )
									ret := -0.461538
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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
float op_operation = decision_tree_0_U_1Min_187d979d(ema2, ema1, ema12, ema3, ema13, tema)

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


