//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Stochastic_RSI
// ID_model: AMZN_5Min_2MS0_2de3d634 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AMZN_5Min_2MS0_2de3d634", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AMZN_5Min_2de3d634(Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum, rsi1, smoothK_k, d_k, k, d, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( Positive_Money_Flow_Sum <= 1.15785e+07 )
		if( d_k <= -5.09077 )
			if( Negative_Money_Flow <= 218593 )
				if( MFI_Low <= 2.03092 )
					if( Negative_Money_Flow_Sum <= 1.35883e+07 )
						if( Raw_Money_Flow <= 470193 )
							if( Negative_Money_Flow_Sum <= 2.13859e+06 )
								if( Positive_Money_Flow <= 72392 )
									ret := 0.000000
								if( Positive_Money_Flow > 72392 )
									ret := -0.857143 // sell
							if( Negative_Money_Flow_Sum > 2.13859e+06 )
								if( Positive_Money_Flow_Sum <= 1.27599e+06 )
									ret := 0.354331
								if( Positive_Money_Flow_Sum > 1.27599e+06 )
									ret := -0.062500
						if( Raw_Money_Flow > 470193 )
							if( rsi1 <= 31.9283 )
								if( Negative_Money_Flow_Sum <= 9.96858e+06 )
									ret := 1.000000 // buy
								if( Negative_Money_Flow_Sum > 9.96858e+06 )
									ret := 0.750000 // buy
							if( rsi1 > 31.9283 )
								if( Typical_Price <= 176.277 )
									ret := 0.750000 // buy
								if( Typical_Price > 176.277 )
									ret := 0.000000
					if( Negative_Money_Flow_Sum > 1.35883e+07 )
						if( Typical_Price <= 122.975 )
							if( Positive_Money_Flow <= 460441 )
								ret := 0.500000
							if( Positive_Money_Flow > 460441 )
								ret := 1.000000 // buy
						if( Typical_Price > 122.975 )
							if( Money_Flow_Ratio <= 0.140069 )
								if( rsi1 <= 21.6608 )
									ret := 0.750000 // buy
								if( rsi1 > 21.6608 )
									ret := 0.036496
							if( Money_Flow_Ratio > 0.140069 )
								if( smoothD_d <= 17.0768 )
									ret := -0.522727
								if( smoothD_d > 17.0768 )
									ret := -0.116279
				if( MFI_Low > 2.03092 )
					if( Positive_Money_Flow <= 4.39954e+06 )
						if( k <= 72.2223 )
							if( Negative_Money_Flow_Sum <= 833710 )
								if( Positive_Money_Flow <= 42011.5 )
									ret := 0.543860
								if( Positive_Money_Flow > 42011.5 )
									ret := 0.139344
							if( Negative_Money_Flow_Sum > 833710 )
								if( rsi1 <= 26.1606 )
									ret := -0.428571
								if( rsi1 > 26.1606 )
									ret := -0.024229
						if( k > 72.2223 )
							if( Positive_Money_Flow <= 751452 )
								if( Positive_Money_Flow_Sum <= 5.94347e+06 )
									ret := -0.148918
								if( Positive_Money_Flow_Sum > 5.94347e+06 )
									ret := 0.057554
							if( Positive_Money_Flow > 751452 )
								if( rsi1 <= 58.4328 )
									ret := -0.253846
								if( rsi1 > 58.4328 )
									ret := 0.095238
					if( Positive_Money_Flow > 4.39954e+06 )
						if( MFI_High <= -14.2263 )
							if( rsi1 <= 37.9882 )
								ret := -0.250000
							if( rsi1 > 37.9882 )
								if( Positive_Money_Flow_Sum <= 1.06437e+07 )
									ret := -0.947368 // sell
								if( Positive_Money_Flow_Sum > 1.06437e+07 )
									ret := -0.500000
						if( MFI_High > -14.2263 )
							if( d_k <= -6.92202 )
								if( smoothK_k <= 44.48 )
									ret := 0.750000 // buy
								if( smoothK_k > 44.48 )
									ret := 0.000000
							if( d_k > -6.92202 )
								ret := -0.800000 // sell
			if( Negative_Money_Flow > 218593 )
				if( Raw_Money_Flow <= 833650 )
					if( MFI <= 69.4057 )
						if( Negative_Money_Flow_Sum <= 2.88386e+06 )
							if( Money_Flow_Ratio <= 1.32371 )
								if( rsi1 <= 60.0683 )
									ret := 0.036269
								if( rsi1 > 60.0683 )
									ret := 0.484848
							if( Money_Flow_Ratio > 1.32371 )
								if( Typical_Price <= 109.565 )
									ret := -0.666667
								if( Typical_Price > 109.565 )
									ret := -0.162791
						if( Negative_Money_Flow_Sum > 2.88386e+06 )
							if( Negative_Money_Flow_Sum <= 5.00625e+06 )
								if( Money_Flow_Ratio <= 0.708734 )
									ret := 0.478571
								if( Money_Flow_Ratio > 0.708734 )
									ret := 0.175182
							if( Negative_Money_Flow_Sum > 5.00625e+06 )
								if( rsi1 <= 22.8487 )
									ret := 1.000000 // buy
								if( rsi1 > 22.8487 )
									ret := 0.107744
					if( MFI > 69.4057 )
						if( Negative_Money_Flow <= 615523 )
							if( d_k <= -12.5863 )
								if( d_k <= -20.6986 )
									ret := 0.000000
								if( d_k > -20.6986 )
									ret := 0.750000 // buy
							if( d_k > -12.5863 )
								if( Positive_Money_Flow_Sum <= 5.38331e+06 )
									ret := 0.300000
								if( Positive_Money_Flow_Sum > 5.38331e+06 )
									ret := -0.066667
						if( Negative_Money_Flow > 615523 )
							if( Typical_Price <= 133.526 )
								ret := 1.000000 // buy
							if( Typical_Price > 133.526 )
								ret := 0.250000
				if( Raw_Money_Flow > 833650 )
					if( Positive_Money_Flow_Sum <= 4.31111e+06 )
						if( Negative_Money_Flow <= 980767 )
							if( MFI_High <= -43.7125 )
								if( Money_Flow_Ratio <= 0.387932 )
									ret := -0.052632
								if( Money_Flow_Ratio > 0.387932 )
									ret := -0.842105 // sell
							if( MFI_High > -43.7125 )
								if( rsi1 <= 60.9357 )
									ret := 0.300000
								if( rsi1 > 60.9357 )
									ret := 1.000000 // buy
						if( Negative_Money_Flow > 980767 )
							if( d <= 7.46637 )
								ret := -0.750000 // sell
							if( d > 7.46637 )
								if( Negative_Money_Flow <= 2.56705e+06 )
									ret := 0.252252
								if( Negative_Money_Flow > 2.56705e+06 )
									ret := 0.586207
					if( Positive_Money_Flow_Sum > 4.31111e+06 )
						if( Negative_Money_Flow_Sum <= 3.03539e+06 )
							if( d <= 82.3064 )
								if( rsi1 <= 69.916 )
									ret := 1.000000 // buy
								if( rsi1 > 69.916 )
									ret := 0.750000 // buy
							if( d > 82.3064 )
								ret := 0.000000
						if( Negative_Money_Flow_Sum > 3.03539e+06 )
							if( Negative_Money_Flow_Sum <= 6.43604e+06 )
								if( rsi1 <= 56.0666 )
									ret := -0.674419
								if( rsi1 > 56.0666 )
									ret := -0.103448
							if( Negative_Money_Flow_Sum > 6.43604e+06 )
								if( Raw_Money_Flow <= 1.68613e+06 )
									ret := 0.115789
								if( Raw_Money_Flow > 1.68613e+06 )
									ret := -0.287671
		if( d_k > -5.09077 )
			if( Negative_Money_Flow <= 1397.14 )
				if( d_k <= 0.407419 )
					if( Typical_Price <= 130.277 )
						if( d_k <= -3.01287 )
							if( Positive_Money_Flow_Sum <= 3.64945e+06 )
								if( Positive_Money_Flow <= 1.24108e+06 )
									ret := 0.071429
								if( Positive_Money_Flow > 1.24108e+06 )
									ret := -1.000000 // sell
							if( Positive_Money_Flow_Sum > 3.64945e+06 )
								if( Negative_Money_Flow_Sum <= 7.97078e+06 )
									ret := 0.562500
								if( Negative_Money_Flow_Sum > 7.97078e+06 )
									ret := 0.085714
						if( d_k > -3.01287 )
							if( Negative_Money_Flow_Sum <= 681428 )
								if( smoothK_k <= 75.8709 )
									ret := 0.785714 // buy
								if( smoothK_k > 75.8709 )
									ret := 0.074074
							if( Negative_Money_Flow_Sum > 681428 )
								if( rsi1 <= 62.0459 )
									ret := 0.045977
								if( rsi1 > 62.0459 )
									ret := -0.126050
					if( Typical_Price > 130.277 )
						if( Negative_Money_Flow_Sum <= 5.50117e+06 )
							if( Negative_Money_Flow_Sum <= 1.80607e+06 )
								if( Raw_Money_Flow <= 155384 )
									ret := 0.017123
								if( Raw_Money_Flow > 155384 )
									ret := -0.113636
							if( Negative_Money_Flow_Sum > 1.80607e+06 )
								if( d <= 68.3426 )
									ret := 0.126027
								if( d > 68.3426 )
									ret := -0.006637
						if( Negative_Money_Flow_Sum > 5.50117e+06 )
							if( Typical_Price <= 168.169 )
								if( Raw_Money_Flow <= 4.41164e+06 )
									ret := -0.197232
								if( Raw_Money_Flow > 4.41164e+06 )
									ret := 0.571429
							if( Typical_Price > 168.169 )
								if( k <= 3.36624 )
									ret := -0.379310
								if( k > 3.36624 )
									ret := 0.025714
				if( d_k > 0.407419 )
					if( Positive_Money_Flow <= 706849 )
						if( Money_Flow_Ratio <= 1.11756 )
							if( Money_Flow_Ratio <= 0.886197 )
								if( Negative_Money_Flow_Sum <= 840073 )
									ret := 0.588235
								if( Negative_Money_Flow_Sum > 840073 )
									ret := 0.074961
							if( Money_Flow_Ratio > 0.886197 )
								if( Raw_Money_Flow <= 387716 )
									ret := -0.106996
								if( Raw_Money_Flow > 387716 )
									ret := -0.333333
						if( Money_Flow_Ratio > 1.11756 )
							if( rsi1 <= 61.2408 )
								if( Positive_Money_Flow <= 219582 )
									ret := 0.070175
								if( Positive_Money_Flow > 219582 )
									ret := 0.276650
							if( rsi1 > 61.2408 )
								if( Typical_Price <= 122.008 )
									ret := 0.285714
								if( Typical_Price > 122.008 )
									ret := -0.001701
					if( Positive_Money_Flow > 706849 )
						if( Negative_Money_Flow_Sum <= 1.24707e+07 )
							if( k <= 26.674 )
								if( Positive_Money_Flow_Sum <= 8.12811e+06 )
									ret := 0.180328
								if( Positive_Money_Flow_Sum > 8.12811e+06 )
									ret := -0.428571
							if( k > 26.674 )
								if( k <= 76.8705 )
									ret := 0.345188
								if( k > 76.8705 )
									ret := 0.055901
						if( Negative_Money_Flow_Sum > 1.24707e+07 )
							if( Positive_Money_Flow <= 2.74196e+06 )
								if( MFI_High <= -38.0003 )
									ret := 0.137755
								if( MFI_High > -38.0003 )
									ret := -0.500000
							if( Positive_Money_Flow > 2.74196e+06 )
								if( rsi1 <= 56.0693 )
									ret := -0.636364
								if( rsi1 > 56.0693 )
									ret := -0.090909
			if( Negative_Money_Flow > 1397.14 )
				if( Positive_Money_Flow_Sum <= 803589 )
					if( Positive_Money_Flow <= 381.437 )
						if( k <= 8.58108 )
							if( Raw_Money_Flow <= 1.33556e+06 )
								if( Typical_Price <= 138.481 )
									ret := -0.132653
								if( Typical_Price > 138.481 )
									ret := 0.149123
							if( Raw_Money_Flow > 1.33556e+06 )
								if( Negative_Money_Flow_Sum <= 1.74737e+07 )
									ret := 0.782609 // buy
								if( Negative_Money_Flow_Sum > 1.74737e+07 )
									ret := -0.200000
						if( k > 8.58108 )
							if( Raw_Money_Flow <= 396003 )
								if( rsi1 <= 39.471 )
									ret := 0.477707
								if( rsi1 > 39.471 )
									ret := 0.289017
							if( Raw_Money_Flow > 396003 )
								if( Positive_Money_Flow_Sum <= 291840 )
									ret := -0.666667
								if( Positive_Money_Flow_Sum > 291840 )
									ret := 0.170213
					if( Positive_Money_Flow > 381.437 )
						if( smoothK_k <= 21.1016 )
							if( Negative_Money_Flow_Sum <= 1.58878e+06 )
								ret := -0.428571
							if( Negative_Money_Flow_Sum > 1.58878e+06 )
								if( Positive_Money_Flow_Sum <= 477260 )
									ret := -0.500000
								if( Positive_Money_Flow_Sum > 477260 )
									ret := 0.925926 // buy
						if( smoothK_k > 21.1016 )
							if( d_k <= 0.568137 )
								ret := 0.500000
							if( d_k > 0.568137 )
								ret := 1.000000 // buy
				if( Positive_Money_Flow_Sum > 803589 )
					if( Typical_Price <= 185.23 )
						if( MFI <= 43.3538 )
							if( Typical_Price <= 161.728 )
								if( Negative_Money_Flow_Sum <= 6.51956e+08 )
									ret := 0.051282
								if( Negative_Money_Flow_Sum > 6.51956e+08 )
									ret := 0.629630
							if( Typical_Price > 161.728 )
								if( Raw_Money_Flow <= 2.00953e+08 )
									ret := 0.167918
								if( Raw_Money_Flow > 2.00953e+08 )
									ret := 0.837209 // buy
						if( MFI > 43.3538 )
							if( Typical_Price <= 169.799 )
								if( Positive_Money_Flow_Sum <= 3.72735e+06 )
									ret := 0.165517
								if( Positive_Money_Flow_Sum > 3.72735e+06 )
									ret := 0.287081
							if( Typical_Price > 169.799 )
								if( Positive_Money_Flow_Sum <= 1.52511e+06 )
									ret := -0.207921
								if( Positive_Money_Flow_Sum > 1.52511e+06 )
									ret := 0.129450
					if( Typical_Price > 185.23 )
						if( Raw_Money_Flow <= 1.12691e+08 )
							if( Positive_Money_Flow_Sum <= 1.26947e+06 )
								if( MFI_High <= -38.1774 )
									ret := -0.054545
								if( MFI_High > -38.1774 )
									ret := -0.480000
							if( Positive_Money_Flow_Sum > 1.26947e+06 )
								if( Typical_Price <= 185.295 )
									ret := -0.666667
								if( Typical_Price > 185.295 )
									ret := 0.065332
						if( Raw_Money_Flow > 1.12691e+08 )
							if( smoothD_d <= 26.8634 )
								if( Typical_Price <= 189.395 )
									ret := -0.750000 // sell
								if( Typical_Price > 189.395 )
									ret := -1.000000 // sell
							if( smoothD_d > 26.8634 )
								ret := -0.333333
	if( Positive_Money_Flow_Sum > 1.15785e+07 )
		if( Typical_Price <= 184.935 )
			if( Raw_Money_Flow <= 3.30512e+07 )
				if( Typical_Price <= 126.334 )
					if( Negative_Money_Flow <= 404095 )
						if( k <= 23.2668 )
							if( Typical_Price <= 109.413 )
								if( rsi1 <= 50.9393 )
									ret := -0.239130
								if( rsi1 > 50.9393 )
									ret := 0.500000
							if( Typical_Price > 109.413 )
								if( Negative_Money_Flow_Sum <= 6.69614e+07 )
									ret := 0.500000
								if( Negative_Money_Flow_Sum > 6.69614e+07 )
									ret := 0.063291
						if( k > 23.2668 )
							if( Positive_Money_Flow_Sum <= 3.39594e+07 )
								if( Positive_Money_Flow_Sum <= 2.68492e+07 )
									ret := -0.077206
								if( Positive_Money_Flow_Sum > 2.68492e+07 )
									ret := -0.493671
							if( Positive_Money_Flow_Sum > 3.39594e+07 )
								if( MFI_Low <= 58.0345 )
									ret := 0.123377
								if( MFI_Low > 58.0345 )
									ret := -0.092715
					if( Negative_Money_Flow > 404095 )
						if( Negative_Money_Flow_Sum <= 3.09537e+08 )
							if( MFI <= 70.107 )
								if( rsi1 <= 68.1094 )
									ret := 0.347534
								if( rsi1 > 68.1094 )
									ret := -0.187500
							if( MFI > 70.107 )
								if( rsi1 <= 74.6068 )
									ret := -0.020690
								if( rsi1 > 74.6068 )
									ret := 0.545455
						if( Negative_Money_Flow_Sum > 3.09537e+08 )
							if( Positive_Money_Flow <= 1.28523e+07 )
								if( Money_Flow_Ratio <= 3.81884 )
									ret := -0.080460
								if( Money_Flow_Ratio > 3.81884 )
									ret := 0.294118
							if( Positive_Money_Flow > 1.28523e+07 )
								ret := 1.000000 // buy
				if( Typical_Price > 126.334 )
					if( d <= 85.6703 )
						if( Positive_Money_Flow_Sum <= 1.91275e+07 )
							if( Raw_Money_Flow <= 2.40189e+06 )
								if( rsi1 <= 49.7327 )
									ret := 0.042146
								if( rsi1 > 49.7327 )
									ret := -0.183755
							if( Raw_Money_Flow > 2.40189e+06 )
								if( d_k <= 5.24965 )
									ret := 0.149406
								if( d_k > 5.24965 )
									ret := 0.398374
						if( Positive_Money_Flow_Sum > 1.91275e+07 )
							if( Positive_Money_Flow_Sum <= 2.85562e+07 )
								if( Positive_Money_Flow <= 2.23409e+06 )
									ret := -0.112272
								if( Positive_Money_Flow > 2.23409e+06 )
									ret := -0.322314
							if( Positive_Money_Flow_Sum > 2.85562e+07 )
								if( Positive_Money_Flow_Sum <= 3.24554e+07 )
									ret := 0.182692
								if( Positive_Money_Flow_Sum > 3.24554e+07 )
									ret := -0.028389
					if( d > 85.6703 )
						if( Money_Flow_Ratio <= 5.42422 )
							if( Positive_Money_Flow_Sum <= 1.95783e+07 )
								if( Positive_Money_Flow_Sum <= 1.78637e+07 )
									ret := -0.084416
								if( Positive_Money_Flow_Sum > 1.78637e+07 )
									ret := -0.461538
							if( Positive_Money_Flow_Sum > 1.95783e+07 )
								if( MFI <= 79.413 )
									ret := 0.092913
								if( MFI > 79.413 )
									ret := -0.095808
						if( Money_Flow_Ratio > 5.42422 )
							if( MFI_High <= 12.267 )
								if( Negative_Money_Flow_Sum <= 1.88253e+06 )
									ret := -0.285714
								if( Negative_Money_Flow_Sum > 1.88253e+06 )
									ret := 0.277592
							if( MFI_High > 12.267 )
								if( Positive_Money_Flow <= 5.95004e+06 )
									ret := 0.018433
								if( Positive_Money_Flow > 5.95004e+06 )
									ret := -0.384615
			if( Raw_Money_Flow > 3.30512e+07 )
				if( Typical_Price <= 123.367 )
					if( smoothD_d <= 17.9854 )
						if( Positive_Money_Flow_Sum <= 6.37389e+08 )
							if( rsi1 <= 29.2365 )
								if( Money_Flow_Ratio <= 0.381624 )
									ret := 0.068376
								if( Money_Flow_Ratio > 0.381624 )
									ret := -0.397590
							if( rsi1 > 29.2365 )
								if( smoothD_d <= 0.691706 )
									ret := 0.654545
								if( smoothD_d > 0.691706 )
									ret := 0.079646
						if( Positive_Money_Flow_Sum > 6.37389e+08 )
							if( Typical_Price <= 108.278 )
								if( Negative_Money_Flow <= 9.28381e+07 )
									ret := 0.181818
								if( Negative_Money_Flow > 9.28381e+07 )
									ret := -0.538462
							if( Typical_Price > 108.278 )
								if( smoothK_k <= 24.0123 )
									ret := 0.661157
								if( smoothK_k > 24.0123 )
									ret := -0.400000
					if( smoothD_d > 17.9854 )
						if( Raw_Money_Flow <= 9.50409e+07 )
							if( Negative_Money_Flow_Sum <= 8.29886e+08 )
								if( d_k <= 6.97965 )
									ret := 0.014639
								if( d_k > 6.97965 )
									ret := -0.170854
							if( Negative_Money_Flow_Sum > 8.29886e+08 )
								if( Positive_Money_Flow_Sum <= 4.76853e+08 )
									ret := -0.346154
								if( Positive_Money_Flow_Sum > 4.76853e+08 )
									ret := 0.569620
						if( Raw_Money_Flow > 9.50409e+07 )
							if( MFI_Low <= 62.4347 )
								if( rsi1 <= 38.9047 )
									ret := 0.009524
								if( rsi1 > 38.9047 )
									ret := -0.377088
							if( MFI_Low > 62.4347 )
								if( rsi1 <= 77.6829 )
									ret := 0.560000
								if( rsi1 > 77.6829 )
									ret := -0.295455
				if( Typical_Price > 123.367 )
					if( Money_Flow_Ratio <= 89.2383 )
						if( Positive_Money_Flow_Sum <= 2.35811e+09 )
							if( Positive_Money_Flow_Sum <= 6.49989e+08 )
								if( MFI_High <= -22.0683 )
									ret := 0.059511
								if( MFI_High > -22.0683 )
									ret := 0.133766
							if( Positive_Money_Flow_Sum > 6.49989e+08 )
								if( k <= 95.8026 )
									ret := -0.008224
								if( k > 95.8026 )
									ret := 0.183288
						if( Positive_Money_Flow_Sum > 2.35811e+09 )
							if( Typical_Price <= 178.592 )
								if( Money_Flow_Ratio <= 5.77575 )
									ret := 0.661972
								if( Money_Flow_Ratio > 5.77575 )
									ret := -0.075269
							if( Typical_Price > 178.592 )
								if( MFI_High <= -25.0208 )
									ret := 0.750000 // buy
								if( MFI_High > -25.0208 )
									ret := -0.973684 // sell
					if( Money_Flow_Ratio > 89.2383 )
						if( Positive_Money_Flow_Sum <= 1.83931e+09 )
							if( k <= 83.9961 )
								ret := 0.000000
							if( k > 83.9961 )
								if( MFI_Low <= 79.4245 )
									ret := 0.972973 // buy
								if( MFI_Low > 79.4245 )
									ret := 0.750000 // buy
						if( Positive_Money_Flow_Sum > 1.83931e+09 )
							ret := -1.000000 // sell
		if( Typical_Price > 184.935 )
			if( Positive_Money_Flow <= 7.91958e+07 )
				if( Raw_Money_Flow <= 3.54003e+07 )
					if( rsi1 <= 71.6863 )
						if( Negative_Money_Flow_Sum <= 4.85656e+06 )
							if( Raw_Money_Flow <= 532530 )
								if( d <= 96.0578 )
									ret := 0.012500
								if( d > 96.0578 )
									ret := -0.500000
							if( Raw_Money_Flow > 532530 )
								if( MFI_High <= -0.05914 )
									ret := 0.882353 // buy
								if( MFI_High > -0.05914 )
									ret := 0.371429
						if( Negative_Money_Flow_Sum > 4.85656e+06 )
							if( rsi1 <= 71.1678 )
								if( Positive_Money_Flow_Sum <= 6.46277e+07 )
									ret := -0.141722
								if( Positive_Money_Flow_Sum > 6.46277e+07 )
									ret := -0.026634
							if( rsi1 > 71.1678 )
								if( Raw_Money_Flow <= 2.97937e+06 )
									ret := 0.000000
								if( Raw_Money_Flow > 2.97937e+06 )
									ret := 0.700000 // buy
					if( rsi1 > 71.6863 )
						if( Positive_Money_Flow_Sum <= 2.33081e+07 )
							if( Positive_Money_Flow_Sum <= 1.93972e+07 )
								if( Positive_Money_Flow <= 4.38802e+06 )
									ret := -0.166667
								if( Positive_Money_Flow > 4.38802e+06 )
									ret := 0.666667
							if( Positive_Money_Flow_Sum > 1.93972e+07 )
								if( Negative_Money_Flow_Sum <= 7.29771e+06 )
									ret := 1.000000 // buy
								if( Negative_Money_Flow_Sum > 7.29771e+06 )
									ret := 0.285714
						if( Positive_Money_Flow_Sum > 2.33081e+07 )
							if( Negative_Money_Flow_Sum <= 4.87114e+07 )
								if( Positive_Money_Flow_Sum <= 3.7221e+07 )
									ret := -0.272727
								if( Positive_Money_Flow_Sum > 3.7221e+07 )
									ret := -0.731959 // sell
							if( Negative_Money_Flow_Sum > 4.87114e+07 )
								if( Raw_Money_Flow <= 3.04285e+07 )
									ret := 0.045455
								if( Raw_Money_Flow > 3.04285e+07 )
									ret := -0.342857
				if( Raw_Money_Flow > 3.54003e+07 )
					if( k <= 4.58287 )
						if( rsi1 <= 41.7542 )
							if( Raw_Money_Flow <= 1.90349e+08 )
								if( MFI_High <= -73.988 )
									ret := -0.833333 // sell
								if( MFI_High > -73.988 )
									ret := -0.040816
							if( Raw_Money_Flow > 1.90349e+08 )
								if( Negative_Money_Flow_Sum <= 5.91308e+08 )
									ret := 1.000000 // buy
								if( Negative_Money_Flow_Sum > 5.91308e+08 )
									ret := 0.222222
						if( rsi1 > 41.7542 )
							if( smoothD_d <= 18.8893 )
								if( Negative_Money_Flow_Sum <= 9.41335e+08 )
									ret := -0.658824
								if( Negative_Money_Flow_Sum > 9.41335e+08 )
									ret := 0.700000 // buy
							if( smoothD_d > 18.8893 )
								ret := 0.600000
					if( k > 4.58287 )
						if( Negative_Money_Flow <= 7.52585e+07 )
							if( Positive_Money_Flow_Sum <= 1.29229e+09 )
								if( Negative_Money_Flow_Sum <= 1.08922e+09 )
									ret := 0.132457
								if( Negative_Money_Flow_Sum > 1.08922e+09 )
									ret := -0.477273
							if( Positive_Money_Flow_Sum > 1.29229e+09 )
								if( Negative_Money_Flow_Sum <= 6.84365e+08 )
									ret := -0.833333 // sell
								if( Negative_Money_Flow_Sum > 6.84365e+08 )
									ret := -0.142857
						if( Negative_Money_Flow > 7.52585e+07 )
							if( Raw_Money_Flow <= 1.54137e+08 )
								if( rsi1 <= 51.9593 )
									ret := -0.208075
								if( rsi1 > 51.9593 )
									ret := 0.086957
							if( Raw_Money_Flow > 1.54137e+08 )
								if( rsi1 <= 24.8893 )
									ret := 0.857143 // buy
								if( rsi1 > 24.8893 )
									ret := 0.151316
			if( Positive_Money_Flow > 7.91958e+07 )
				if( Positive_Money_Flow_Sum <= 1.48613e+09 )
					if( Negative_Money_Flow_Sum <= 1.31527e+09 )
						if( rsi1 <= 30.5215 )
							if( MFI_High <= -56.0268 )
								ret := 0.200000
							if( MFI_High > -56.0268 )
								if( Raw_Money_Flow <= 1.40778e+08 )
									ret := -0.846154 // sell
								if( Raw_Money_Flow > 1.40778e+08 )
									ret := -0.272727
						if( rsi1 > 30.5215 )
							if( MFI_High <= -33.7997 )
								if( Raw_Money_Flow <= 1.63541e+08 )
									ret := 0.290323
								if( Raw_Money_Flow > 1.63541e+08 )
									ret := -0.647059
							if( MFI_High > -33.7997 )
								if( rsi1 <= 58.3095 )
									ret := -0.333333
								if( rsi1 > 58.3095 )
									ret := -0.065147
					if( Negative_Money_Flow_Sum > 1.31527e+09 )
						if( d <= 51.6226 )
							if( rsi1 <= 21.9023 )
								ret := -0.500000
							if( rsi1 > 21.9023 )
								if( Money_Flow_Ratio <= 0.39132 )
									ret := -1.000000 // sell
								if( Money_Flow_Ratio > 0.39132 )
									ret := -0.750000 // sell
						if( d > 51.6226 )
							ret := 0.400000
				if( Positive_Money_Flow_Sum > 1.48613e+09 )
					if( Typical_Price <= 197.65 )
						if( Negative_Money_Flow_Sum <= 6.33958e+08 )
							if( MFI_Low <= 69.9173 )
								if( Raw_Money_Flow <= 1.13021e+09 )
									ret := -0.972222 // sell
								if( Raw_Money_Flow > 1.13021e+09 )
									ret := -0.500000
							if( MFI_Low > 69.9173 )
								if( Typical_Price <= 185.572 )
									ret := -1.000000 // sell
								if( Typical_Price > 185.572 )
									ret := 0.200000
						if( Negative_Money_Flow_Sum > 6.33958e+08 )
							if( rsi1 <= 76.935 )
								if( MFI <= 67.7473 )
									ret := -0.666667
								if( MFI > 67.7473 )
									ret := 0.125000
							if( rsi1 > 76.935 )
								ret := -1.000000 // sell
					if( Typical_Price > 197.65 )
						if( Typical_Price <= 198.639 )
							ret := 0.428571
						if( Typical_Price > 198.639 )
							ret := -0.500000
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
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
float op_operation = decision_tree_0_AMZN_5Min_2de3d634(Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum, rsi1, smoothK_k, d_k, k, d, smoothD_d)

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


