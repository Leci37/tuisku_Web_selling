//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Vortex_Indicator
// ID_model: GOOG_1Min_2MV0_8d55fe2e Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_GOOG_1Min_2MV0_8d55fe2e", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_GOOG_1Min_8d55fe2e(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( Positive_Money_Flow_Sum <= 1.16347e+06 )
		if( MFI <= 47.9661 )
			if( Negative_Money_Flow <= 551.396 )
				if( VIM <= 2.5808 )
					if( Negative_Money_Flow_Sum <= 2.45135e+06 )
						if( Negative_Money_Flow_Sum <= 2.03571e+06 )
							if( Positive_Money_Flow <= 482974 )
								if( Raw_Money_Flow <= 406893 )
									ret := -0.062136
								if( Raw_Money_Flow > 406893 )
									ret := 0.529412
							if( Positive_Money_Flow > 482974 )
								if( Typical_Price <= 168.313 )
									ret := -0.250000
								if( Typical_Price > 168.313 )
									ret := -0.769231 // sell
						if( Negative_Money_Flow_Sum > 2.03571e+06 )
							if( Raw_Money_Flow <= 408646 )
								if( MFI <= 23.8293 )
									ret := -0.114286
								if( MFI > 23.8293 )
									ret := 0.287037
							if( Raw_Money_Flow > 408646 )
								if( MFI_High <= -50.1445 )
									ret := 0.600000
								if( MFI_High > -50.1445 )
									ret := 1.000000 // buy
					if( Negative_Money_Flow_Sum > 2.45135e+06 )
						if( Positive_Money_Flow_Sum <= 814821 )
							if( VIP_VIM <= 0.258882 )
								if( Typical_Price <= 170.53 )
									ret := 0.287129
								if( Typical_Price > 170.53 )
									ret := -0.204082
							if( VIP_VIM > 0.258882 )
								if( MFI <= 9.04945 )
									ret := -0.250000
								if( MFI > 9.04945 )
									ret := -0.909091 // sell
						if( Positive_Money_Flow_Sum > 814821 )
							if( VIP <= 1.7053 )
								if( VIP_VIM <= -0.391374 )
									ret := -0.384615
								if( VIP_VIM > -0.391374 )
									ret := 0.032787
							if( VIP > 1.7053 )
								if( Money_Flow_Ratio <= 0.319243 )
									ret := -0.923077 // sell
								if( Money_Flow_Ratio > 0.319243 )
									ret := -0.411765
				if( VIM > 2.5808 )
					if( Raw_Money_Flow <= 104963 )
						if( Negative_Money_Flow_Sum <= 1.12441e+06 )
							if( Negative_Money_Flow_Sum <= 851688 )
								if( Negative_Money_Flow_Sum <= 723196 )
									ret := 0.179747
								if( Negative_Money_Flow_Sum > 723196 )
									ret := -0.260163
							if( Negative_Money_Flow_Sum > 851688 )
								if( MFI <= 41.2578 )
									ret := 0.383041
								if( MFI > 41.2578 )
									ret := 0.024390
						if( Negative_Money_Flow_Sum > 1.12441e+06 )
							if( MFI_High <= -34.084 )
								if( VIM <= 4.50732 )
									ret := 0.009836
								if( VIM > 4.50732 )
									ret := -0.253644
							if( MFI_High > -34.084 )
								if( Negative_Money_Flow_Sum <= 1.25472e+06 )
									ret := 0.500000
								if( Negative_Money_Flow_Sum > 1.25472e+06 )
									ret := 1.000000 // buy
					if( Raw_Money_Flow > 104963 )
						if( VIP_VIM <= 0.50381 )
							if( Typical_Price <= 159.608 )
								if( MFI_Low <= 15.5454 )
									ret := -0.351351
								if( MFI_Low > 15.5454 )
									ret := 0.421053
							if( Typical_Price > 159.608 )
								if( Negative_Money_Flow_Sum <= 700214 )
									ret := 0.627907
								if( Negative_Money_Flow_Sum > 700214 )
									ret := 0.358140
						if( VIP_VIM > 0.50381 )
							if( Positive_Money_Flow_Sum <= 878346 )
								if( Positive_Money_Flow_Sum <= 443721 )
									ret := 0.071429
								if( Positive_Money_Flow_Sum > 443721 )
									ret := -0.500000
							if( Positive_Money_Flow_Sum > 878346 )
								if( VIM <= 4.42256 )
									ret := 0.562500
								if( VIM > 4.42256 )
									ret := -0.600000
			if( Negative_Money_Flow > 551.396 )
				if( Raw_Money_Flow <= 1.09796e+06 )
					if( Raw_Money_Flow <= 46313.1 )
						if( Negative_Money_Flow_Sum <= 1.90816e+06 )
							if( Negative_Money_Flow_Sum <= 642329 )
								if( Negative_Money_Flow_Sum <= 614034 )
									ret := 0.240437
								if( Negative_Money_Flow_Sum > 614034 )
									ret := -0.541667
							if( Negative_Money_Flow_Sum > 642329 )
								if( Positive_Money_Flow_Sum <= 451920 )
									ret := 0.601974
								if( Positive_Money_Flow_Sum > 451920 )
									ret := 0.362319
						if( Negative_Money_Flow_Sum > 1.90816e+06 )
							if( Typical_Price <= 166.18 )
								if( Typical_Price <= 161.449 )
									ret := 0.000000
								if( Typical_Price > 161.449 )
									ret := -0.488372
							if( Typical_Price > 166.18 )
								if( Positive_Money_Flow_Sum <= 499168 )
									ret := 0.666667
								if( Positive_Money_Flow_Sum > 499168 )
									ret := -0.022222
					if( Raw_Money_Flow > 46313.1 )
						if( Typical_Price <= 180.883 )
							if( VIP <= 123.29 )
								if( Money_Flow_Ratio <= 0.060267 )
									ret := -0.154321
								if( Money_Flow_Ratio > 0.060267 )
									ret := 0.198898
							if( VIP > 123.29 )
								if( VIP_VIM <= -0.928571 )
									ret := 0.666667
								if( VIP_VIM > -0.928571 )
									ret := 0.956522 // buy
						if( Typical_Price > 180.883 )
							if( VIM <= 28.3092 )
								if( Positive_Money_Flow_Sum <= 523547 )
									ret := 0.298969
								if( Positive_Money_Flow_Sum > 523547 )
									ret := -0.111111
							if( VIM > 28.3092 )
								if( Positive_Money_Flow_Sum <= 438985 )
									ret := -0.375000
								if( Positive_Money_Flow_Sum > 438985 )
									ret := -1.000000 // sell
				if( Raw_Money_Flow > 1.09796e+06 )
					if( Negative_Money_Flow_Sum <= 3.70633e+06 )
						if( Raw_Money_Flow <= 1.41293e+06 )
							if( MFI_Low <= -8.03204 )
								ret := -0.250000
							if( MFI_Low > -8.03204 )
								if( MFI_Low <= 0.335214 )
									ret := 0.900000 // buy
								if( MFI_Low > 0.335214 )
									ret := 0.566667
						if( Raw_Money_Flow > 1.41293e+06 )
							if( VIM <= 1.38213 )
								if( MFI_Low <= -0.776911 )
									ret := -1.000000 // sell
								if( MFI_Low > -0.776911 )
									ret := -0.600000
							if( VIM > 1.38213 )
								if( VIP_VIM <= -0.862565 )
									ret := -0.800000 // sell
								if( VIP_VIM > -0.862565 )
									ret := 0.372093
					if( Negative_Money_Flow_Sum > 3.70633e+06 )
						if( Negative_Money_Flow_Sum <= 1.63273e+07 )
							if( Positive_Money_Flow_Sum <= 559429 )
								if( Raw_Money_Flow <= 1.32343e+06 )
									ret := -0.250000
								if( Raw_Money_Flow > 1.32343e+06 )
									ret := 0.653846
							if( Positive_Money_Flow_Sum > 559429 )
								if( Negative_Money_Flow <= 2.81874e+06 )
									ret := 0.754717 // buy
								if( Negative_Money_Flow > 2.81874e+06 )
									ret := 0.981132 // buy
						if( Negative_Money_Flow_Sum > 1.63273e+07 )
							if( Negative_Money_Flow_Sum <= 7.11539e+07 )
								if( Negative_Money_Flow_Sum <= 5.85688e+07 )
									ret := 0.320000
								if( Negative_Money_Flow_Sum > 5.85688e+07 )
									ret := -0.777778 // sell
							if( Negative_Money_Flow_Sum > 7.11539e+07 )
								if( Negative_Money_Flow <= 1.31579e+07 )
									ret := 0.933333 // buy
								if( Negative_Money_Flow > 1.31579e+07 )
									ret := 0.300000
		if( MFI > 47.9661 )
			if( Positive_Money_Flow_Sum <= 725360 )
				if( VIP <= 6.4262 )
					if( MFI_High <= -6.76054 )
						if( Raw_Money_Flow <= 59650.5 )
							if( Negative_Money_Flow_Sum <= 620219 )
								if( Positive_Money_Flow <= 134.668 )
									ret := 0.115044
								if( Positive_Money_Flow > 134.668 )
									ret := 0.435484
							if( Negative_Money_Flow_Sum > 620219 )
								if( MFI_Low <= 31.1761 )
									ret := -0.533333
								if( MFI_Low > 31.1761 )
									ret := 0.000000
						if( Raw_Money_Flow > 59650.5 )
							if( Money_Flow_Ratio <= 1.40093 )
								if( Positive_Money_Flow_Sum <= 583799 )
									ret := 0.376344
								if( Positive_Money_Flow_Sum > 583799 )
									ret := -0.070312
							if( Money_Flow_Ratio > 1.40093 )
								if( Money_Flow_Ratio <= 2.30458 )
									ret := -0.277228
								if( Money_Flow_Ratio > 2.30458 )
									ret := 0.333333
					if( MFI_High > -6.76054 )
						if( VIP_VIM <= 0.47137 )
							if( Positive_Money_Flow_Sum <= 632097 )
								ret := -0.250000
							if( Positive_Money_Flow_Sum > 632097 )
								ret := -1.000000 // sell
						if( VIP_VIM > 0.47137 )
							if( Positive_Money_Flow_Sum <= 467990 )
								ret := -0.500000
							if( Positive_Money_Flow_Sum > 467990 )
								if( MFI_High <= -5.67045 )
									ret := 0.250000
								if( MFI_High > -5.67045 )
									ret := 0.000000
				if( VIP > 6.4262 )
					if( VIP_VIM <= 1.74398 )
						if( MFI <= 63.2418 )
							if( Money_Flow_Ratio <= 1.54349 )
								if( Typical_Price <= 182.966 )
									ret := -0.233906
								if( Typical_Price > 182.966 )
									ret := -0.657895
							if( Money_Flow_Ratio > 1.54349 )
								if( VIP <= 11.3183 )
									ret := -0.352941
								if( VIP > 11.3183 )
									ret := 0.477273
						if( MFI > 63.2418 )
							if( VIM <= 6.14296 )
								if( Typical_Price <= 166.899 )
									ret := -0.222222
								if( Typical_Price > 166.899 )
									ret := 0.500000
							if( VIM > 6.14296 )
								if( Negative_Money_Flow_Sum <= 126041 )
									ret := -0.884615 // sell
								if( Negative_Money_Flow_Sum > 126041 )
									ret := -0.478261
					if( VIP_VIM > 1.74398 )
						if( VIP_VIM <= 1.87083 )
							if( Positive_Money_Flow_Sum <= 606442 )
								if( MFI <= 68.148 )
									ret := 1.000000 // buy
								if( MFI > 68.148 )
									ret := 0.500000
							if( Positive_Money_Flow_Sum > 606442 )
								if( Positive_Money_Flow <= 31951.1 )
									ret := -0.250000
								if( Positive_Money_Flow > 31951.1 )
									ret := 0.000000
						if( VIP_VIM > 1.87083 )
							if( MFI_Low <= 37.0503 )
								if( Positive_Money_Flow_Sum <= 313138 )
									ret := 0.750000 // buy
								if( Positive_Money_Flow_Sum > 313138 )
									ret := 0.045455
							if( MFI_Low > 37.0503 )
								if( VIM <= 40.8989 )
									ret := -0.113636
								if( VIM > 40.8989 )
									ret := -0.818182 // sell
			if( Positive_Money_Flow_Sum > 725360 )
				if( Negative_Money_Flow_Sum <= 316711 )
					if( Positive_Money_Flow_Sum <= 774017 )
						if( Typical_Price <= 166.401 )
							if( Raw_Money_Flow <= 36023.5 )
								if( MFI_Low <= 55.9105 )
									ret := 0.500000
								if( MFI_Low > 55.9105 )
									ret := 0.250000
							if( Raw_Money_Flow > 36023.5 )
								if( Typical_Price <= 163.207 )
									ret := -0.444444
								if( Typical_Price > 163.207 )
									ret := -0.923077 // sell
						if( Typical_Price > 166.401 )
							if( VIM <= 12.1667 )
								if( Typical_Price <= 169.588 )
									ret := -0.500000
								if( Typical_Price > 169.588 )
									ret := 0.047619
							if( VIM > 12.1667 )
								ret := 0.571429
					if( Positive_Money_Flow_Sum > 774017 )
						if( VIM <= 7.63483 )
							if( MFI_Low <= 62.38 )
								if( VIP_VIM <= 0.72998 )
									ret := 0.035088
								if( VIP_VIM > 0.72998 )
									ret := 0.531646
							if( MFI_Low > 62.38 )
								if( Typical_Price <= 175.774 )
									ret := -0.298507
								if( Typical_Price > 175.774 )
									ret := 0.461538
						if( VIM > 7.63483 )
							if( Typical_Price <= 168.426 )
								if( VIP_VIM <= 0.33161 )
									ret := 0.090909
								if( VIP_VIM > 0.33161 )
									ret := 0.769231 // buy
							if( Typical_Price > 168.426 )
								if( Raw_Money_Flow <= 156010 )
									ret := 0.391304
								if( Raw_Money_Flow > 156010 )
									ret := -0.666667
				if( Negative_Money_Flow_Sum > 316711 )
					if( Raw_Money_Flow <= 249846 )
						if( VIM <= 192.68 )
							if( Positive_Money_Flow <= 16483 )
								if( VIP_VIM <= 0.101512 )
									ret := 0.214679
								if( VIP_VIM > 0.101512 )
									ret := 0.068006
							if( Positive_Money_Flow > 16483 )
								if( MFI <= 52.5649 )
									ret := -0.205426
								if( MFI > 52.5649 )
									ret := 0.038419
						if( VIM > 192.68 )
							if( VIP_VIM <= 1.86009 )
								ret := -1.000000 // sell
							if( VIP_VIM > 1.86009 )
								ret := 0.000000
					if( Raw_Money_Flow > 249846 )
						if( VIP <= 14.1105 )
							if( VIP_VIM <= 0.162069 )
								if( Negative_Money_Flow <= 409393 )
									ret := -0.013333
								if( Negative_Money_Flow > 409393 )
									ret := 0.700000 // buy
							if( VIP_VIM > 0.162069 )
								if( VIP_VIM <= 1.13619 )
									ret := -0.328571
								if( VIP_VIM > 1.13619 )
									ret := 0.375000
						if( VIP > 14.1105 )
							if( MFI_High <= -21.1256 )
								if( Negative_Money_Flow_Sum <= 694493 )
									ret := -0.750000 // sell
								if( Negative_Money_Flow_Sum > 694493 )
									ret := -1.000000 // sell
							if( MFI_High > -21.1256 )
								ret := -0.200000
	if( Positive_Money_Flow_Sum > 1.16347e+06 )
		if( VIP_VIM <= 0.856477 )
			if( Negative_Money_Flow_Sum <= 2.06378e+08 )
				if( Typical_Price <= 187.388 )
					if( Money_Flow_Ratio <= 0.041412 )
						if( Typical_Price <= 154.137 )
							ret := -1.000000 // sell
						if( Typical_Price > 154.137 )
							if( Negative_Money_Flow_Sum <= 1.98883e+08 )
								if( Positive_Money_Flow <= 699.465 )
									ret := -0.107843
								if( Positive_Money_Flow > 699.465 )
									ret := -0.510204
							if( Negative_Money_Flow_Sum > 1.98883e+08 )
								if( Positive_Money_Flow <= 19826.8 )
									ret := 0.333333
								if( Positive_Money_Flow > 19826.8 )
									ret := 0.800000 // buy
					if( Money_Flow_Ratio > 0.041412 )
						if( Negative_Money_Flow_Sum <= 1.98921e+08 )
							if( Negative_Money_Flow_Sum <= 5.57509e+07 )
								if( Positive_Money_Flow_Sum <= 1.64025e+08 )
									ret := 0.041911
								if( Positive_Money_Flow_Sum > 1.64025e+08 )
									ret := -0.119522
							if( Negative_Money_Flow_Sum > 5.57509e+07 )
								if( Negative_Money_Flow_Sum <= 6.31709e+07 )
									ret := 0.178679
								if( Negative_Money_Flow_Sum > 6.31709e+07 )
									ret := 0.053817
						if( Negative_Money_Flow_Sum > 1.98921e+08 )
							if( VIP_VIM <= -0.557349 )
								if( MFI_Low <= 2.62332 )
									ret := -1.000000 // sell
								if( MFI_Low > 2.62332 )
									ret := -0.500000
							if( VIP_VIM > -0.557349 )
								if( Positive_Money_Flow <= 2.06691e+07 )
									ret := 0.666667
								if( Positive_Money_Flow > 2.06691e+07 )
									ret := -0.375000
				if( Typical_Price > 187.388 )
					if( Money_Flow_Ratio <= 33.786 )
						if( VIP <= 0.681406 )
							if( Typical_Price <= 187.548 )
								ret := -0.750000 // sell
							if( Typical_Price > 187.548 )
								if( Positive_Money_Flow_Sum <= 1.04248e+07 )
									ret := 0.018182
								if( Positive_Money_Flow_Sum > 1.04248e+07 )
									ret := 0.360000
						if( VIP > 0.681406 )
							if( Positive_Money_Flow_Sum <= 1.80513e+06 )
								if( Raw_Money_Flow <= 505363 )
									ret := 0.063492
								if( Raw_Money_Flow > 505363 )
									ret := 0.785714 // buy
							if( Positive_Money_Flow_Sum > 1.80513e+06 )
								if( Positive_Money_Flow_Sum <= 3.95029e+06 )
									ret := -0.465909
								if( Positive_Money_Flow_Sum > 3.95029e+06 )
									ret := -0.066268
					if( Money_Flow_Ratio > 33.786 )
						if( Negative_Money_Flow_Sum <= 1.6375e+06 )
							ret := 0.333333
						if( Negative_Money_Flow_Sum > 1.6375e+06 )
							if( Positive_Money_Flow_Sum <= 1.53034e+08 )
								ret := 1.000000 // buy
							if( Positive_Money_Flow_Sum > 1.53034e+08 )
								ret := 0.500000
			if( Negative_Money_Flow_Sum > 2.06378e+08 )
				if( Negative_Money_Flow_Sum <= 2.10052e+08 )
					if( Positive_Money_Flow_Sum <= 1.61358e+08 )
						if( Negative_Money_Flow <= 1.78197e+07 )
							if( Negative_Money_Flow_Sum <= 2.07033e+08 )
								ret := -0.750000 // sell
							if( Negative_Money_Flow_Sum > 2.07033e+08 )
								ret := -1.000000 // sell
						if( Negative_Money_Flow > 1.78197e+07 )
							if( VIM <= 1.25409 )
								ret := 0.500000
							if( VIM > 1.25409 )
								ret := -0.857143 // sell
					if( Positive_Money_Flow_Sum > 1.61358e+08 )
						ret := 0.000000
				if( Negative_Money_Flow_Sum > 2.10052e+08 )
					if( Raw_Money_Flow <= 7.88708e+07 )
						if( VIP <= 0.562006 )
							if( Typical_Price <= 163.563 )
								ret := 0.166667
							if( Typical_Price > 163.563 )
								if( Negative_Money_Flow <= 7.33583e+06 )
									ret := 0.400000
								if( Negative_Money_Flow > 7.33583e+06 )
									ret := 1.000000 // buy
						if( VIP > 0.562006 )
							if( Negative_Money_Flow_Sum <= 3.34245e+08 )
								if( MFI_Low <= -1.60778 )
									ret := -0.451883
								if( MFI_Low > -1.60778 )
									ret := -0.057803
							if( Negative_Money_Flow_Sum > 3.34245e+08 )
								if( Positive_Money_Flow <= 18063.6 )
									ret := 0.104408
								if( Positive_Money_Flow > 18063.6 )
									ret := -0.128603
					if( Raw_Money_Flow > 7.88708e+07 )
						if( Typical_Price <= 183.554 )
							if( VIP <= 0.911708 )
								if( MFI <= 19.057 )
									ret := 0.613636
								if( MFI > 19.057 )
									ret := 0.058824
							if( VIP > 0.911708 )
								if( Typical_Price <= 171.005 )
									ret := 0.238095
								if( Typical_Price > 171.005 )
									ret := -0.343750
						if( Typical_Price > 183.554 )
							if( Typical_Price <= 187.057 )
								ret := 1.000000 // buy
							if( Typical_Price > 187.057 )
								ret := 0.200000
		if( VIP_VIM > 0.856477 )
			if( Negative_Money_Flow <= 90771.2 )
				if( Negative_Money_Flow_Sum <= 5.79161e+08 )
					if( VIP <= 5.76818 )
						if( VIP_VIM <= 0.980834 )
							if( Positive_Money_Flow <= 2.42047e+07 )
								if( Positive_Money_Flow <= 101074 )
									ret := -0.250000
								if( Positive_Money_Flow > 101074 )
									ret := 0.021277
							if( Positive_Money_Flow > 2.42047e+07 )
								ret := -1.000000 // sell
						if( VIP_VIM > 0.980834 )
							if( Positive_Money_Flow_Sum <= 7.2347e+08 )
								if( Positive_Money_Flow <= 1.13462e+07 )
									ret := -0.282523
								if( Positive_Money_Flow > 1.13462e+07 )
									ret := -0.617021
							if( Positive_Money_Flow_Sum > 7.2347e+08 )
								ret := 1.000000 // buy
					if( VIP > 5.76818 )
						if( MFI <= 90.6216 )
							if( VIP_VIM <= 1.06386 )
								if( MFI <= 59.7045 )
									ret := -0.909091 // sell
								if( MFI > 59.7045 )
									ret := -0.142857
							if( VIP_VIM > 1.06386 )
								if( Positive_Money_Flow_Sum <= 2.79294e+06 )
									ret := 0.220721
								if( Positive_Money_Flow_Sum > 2.79294e+06 )
									ret := -0.692308
						if( MFI > 90.6216 )
							if( MFI <= 99.3367 )
								if( VIM <= 8.37777 )
									ret := -1.000000 // sell
								if( VIM > 8.37777 )
									ret := -0.444444
							if( MFI > 99.3367 )
								ret := 0.000000
				if( Negative_Money_Flow_Sum > 5.79161e+08 )
					ret := 1.000000 // buy
			if( Negative_Money_Flow > 90771.2 )
				if( VIP_VIM <= 1.00537 )
					if( Positive_Money_Flow <= 495308 )
						if( Typical_Price <= 163.215 )
							if( VIP <= 3.05588 )
								if( Negative_Money_Flow_Sum <= 3.38185e+07 )
									ret := -0.675000
								if( Negative_Money_Flow_Sum > 3.38185e+07 )
									ret := 0.500000
							if( VIP > 3.05588 )
								if( Typical_Price <= 156.752 )
									ret := 0.750000 // buy
								if( Typical_Price > 156.752 )
									ret := 0.000000
						if( Typical_Price > 163.215 )
							if( Positive_Money_Flow <= 143945 )
								if( Negative_Money_Flow_Sum <= 1.05366e+06 )
									ret := -0.250000
								if( Negative_Money_Flow_Sum > 1.05366e+06 )
									ret := 0.090000
							if( Positive_Money_Flow > 143945 )
								ret := -1.000000 // sell
					if( Positive_Money_Flow > 495308 )
						ret := 1.000000 // buy
				if( VIP_VIM > 1.00537 )
					if( Negative_Money_Flow_Sum <= 858997 )
						if( VIM <= 1.81149 )
							if( MFI <= 81.772 )
								if( MFI <= 66.7227 )
									ret := -0.250000
								if( MFI > 66.7227 )
									ret := -0.722222 // sell
							if( MFI > 81.772 )
								if( MFI_Low <= 63.5018 )
									ret := 0.666667
								if( MFI_Low > 63.5018 )
									ret := -0.250000
						if( VIM > 1.81149 )
							if( Negative_Money_Flow_Sum <= 425543 )
								if( Money_Flow_Ratio <= 4.15034 )
									ret := 0.142857
								if( Money_Flow_Ratio > 4.15034 )
									ret := -0.416667
							if( Negative_Money_Flow_Sum > 425543 )
								if( Positive_Money_Flow_Sum <= 1.82625e+06 )
									ret := 0.111111
								if( Positive_Money_Flow_Sum > 1.82625e+06 )
									ret := 0.800000 // buy
					if( Negative_Money_Flow_Sum > 858997 )
						if( Negative_Money_Flow <= 5.12902e+06 )
							if( VIM <= 1.76424 )
								if( VIM <= 0.91164 )
									ret := 0.571429
								if( VIM > 0.91164 )
									ret := 0.000000
							if( VIM > 1.76424 )
								if( Positive_Money_Flow_Sum <= 2.77277e+06 )
									ret := 0.812500 // buy
								if( Positive_Money_Flow_Sum > 2.77277e+06 )
									ret := 0.000000
						if( Negative_Money_Flow > 5.12902e+06 )
							if( Money_Flow_Ratio <= 0.636155 )
								ret := 1.000000 // buy
							if( Money_Flow_Ratio > 0.636155 )
								ret := 0.750000 // buy
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Money_Flow_Index 
//@version=5
//indicator title="Money Flow Index (MFI)", shorttitle="MFI", format=format.price, precision=2, timeframe="", timeframe_gaps=true)

// Input parameters
length_MFI = input.int(14, minval=1, title="MFI Length")

// Calculate the Typical Price
Typical_Price = (high + low + close) / 3

// Calculate Raw Money Flow
Raw_Money_Flow = Typical_Price * volume

// Calculate Positive and Negative Money Flow
Positive_Money_Flow = Raw_Money_Flow * (Typical_Price > Typical_Price[1] ? 1 : 0)
Negative_Money_Flow = Raw_Money_Flow * (Typical_Price < Typical_Price[1] ? 1 : 0)

// Sum of Positive and Negative Money Flow over the given length
Positive_Money_Flow_Sum = ta.sma(Positive_Money_Flow, length_MFI) * length_MFI
Negative_Money_Flow_Sum = ta.sma(Negative_Money_Flow, length_MFI) * length_MFI

// Calculate Money Flow Ratio
Money_Flow_Ratio = Positive_Money_Flow_Sum / Negative_Money_Flow_Sum

// Calculate MFI
MFI = 100 - (100 / (1 + Money_Flow_Ratio))

// Calculate MFI high and low bands
MFI_High = MFI - 80
MFI_Low = MFI - 20

// Plot the MFI
plot(MFI, color=color.blue, title="MFI")

// Plot the MFI high and low bands
hline(80, "MFI High", color=color.red, linestyle=hline.style_dashed)
hline(20, "MFI Low", color=color.green, linestyle=hline.style_dashed)
plot(MFI_High, color=color.red, title="MFI High Band")
plot(MFI_Low, color=color.green, title="MFI Low Band")


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
float op_operation = decision_tree_0_GOOG_1Min_8d55fe2e(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, VIP, VIP_VIM, VIM)

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


