//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Vortex_Indicator
// ID_model: FFIV_15Min_2MV0_eacc10e0 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_FFIV_15Min_2MV0_eacc10e0", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_FFIV_15Min_eacc10e0(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, VIP, VIP_VIM, VIM)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( Typical_Price <= 144.188 )
		if( MFI <= 85.806 )
			if( Raw_Money_Flow <= 155229 )
				if( VIP_VIM <= 0.309894 )
					if( VIM <= 1.00904 )
						if( Negative_Money_Flow_Sum <= 8.28879e+06 )
							ret := -0.500000
						if( Negative_Money_Flow_Sum > 8.28879e+06 )
							if( Negative_Money_Flow_Sum <= 2.11738e+07 )
								if( VIP <= 1.23819 )
									ret := 1.000000 // buy
								if( VIP > 1.23819 )
									ret := 0.750000 // buy
							if( Negative_Money_Flow_Sum > 2.11738e+07 )
								if( Negative_Money_Flow_Sum <= 2.76383e+07 )
									ret := -0.750000 // sell
								if( Negative_Money_Flow_Sum > 2.76383e+07 )
									ret := 0.451613
					if( VIM > 1.00904 )
						if( Money_Flow_Ratio <= 2.97586 )
							if( Money_Flow_Ratio <= 0.094639 )
								if( Negative_Money_Flow_Sum <= 6.68359e+07 )
									ret := -0.500000
								if( Negative_Money_Flow_Sum > 6.68359e+07 )
									ret := 0.800000 // buy
							if( Money_Flow_Ratio > 0.094639 )
								if( MFI_Low <= 29.6597 )
									ret := -0.236066
								if( MFI_Low > 29.6597 )
									ret := 0.142857
						if( Money_Flow_Ratio > 2.97586 )
							if( Typical_Price <= 119.031 )
								ret := 0.000000
							if( Typical_Price > 119.031 )
								if( VIM <= 1.07354 )
									ret := 0.166667
								if( VIM > 1.07354 )
									ret := -0.883721 // sell
				if( VIP_VIM > 0.309894 )
					if( Positive_Money_Flow <= 21190.9 )
						if( Typical_Price <= 139.761 )
							if( VIP <= 1.44436 )
								if( Positive_Money_Flow_Sum <= 4.15437e+07 )
									ret := 0.833333 // buy
								if( Positive_Money_Flow_Sum > 4.15437e+07 )
									ret := -1.000000 // sell
							if( VIP > 1.44436 )
								if( Negative_Money_Flow_Sum <= 9.3242e+06 )
									ret := -0.500000
								if( Negative_Money_Flow_Sum > 9.3242e+06 )
									ret := -0.863636 // sell
						if( Typical_Price > 139.761 )
							if( MFI <= 67.9824 )
								if( Negative_Money_Flow_Sum <= 3.15471e+07 )
									ret := 1.000000 // buy
								if( Negative_Money_Flow_Sum > 3.15471e+07 )
									ret := 0.500000
							if( MFI > 67.9824 )
								if( MFI_Low <= 59.1523 )
									ret := -0.428571
								if( MFI_Low > 59.1523 )
									ret := -1.000000 // sell
					if( Positive_Money_Flow > 21190.9 )
						if( VIP <= 1.31842 )
							ret := -0.200000
						if( VIP > 1.31842 )
							if( Negative_Money_Flow_Sum <= 926039 )
								ret := -0.250000
							if( Negative_Money_Flow_Sum > 926039 )
								if( Positive_Money_Flow <= 40096.4 )
									ret := -1.000000 // sell
								if( Positive_Money_Flow > 40096.4 )
									ret := -0.764706 // sell
			if( Raw_Money_Flow > 155229 )
				if( Negative_Money_Flow_Sum <= 2.23252e+08 )
					if( MFI_High <= -65.504 )
						if( Negative_Money_Flow_Sum <= 5.59633e+07 )
							if( MFI_Low <= -9.08247 )
								if( Negative_Money_Flow_Sum <= 3.21386e+07 )
									ret := 0.115385
								if( Negative_Money_Flow_Sum > 3.21386e+07 )
									ret := -0.520619
							if( MFI_Low > -9.08247 )
								if( VIP_VIM <= -0.195467 )
									ret := 0.018605
								if( VIP_VIM > -0.195467 )
									ret := -0.593750
						if( Negative_Money_Flow_Sum > 5.59633e+07 )
							if( Negative_Money_Flow_Sum <= 8.56839e+07 )
								if( Positive_Money_Flow_Sum <= 1.17915e+07 )
									ret := 0.204778
								if( Positive_Money_Flow_Sum > 1.17915e+07 )
									ret := -0.888889 // sell
							if( Negative_Money_Flow_Sum > 8.56839e+07 )
								if( VIM <= 1.59851 )
									ret := -0.301980
								if( VIM > 1.59851 )
									ret := 0.769231 // buy
					if( MFI_High > -65.504 )
						if( Positive_Money_Flow_Sum <= 4.74881e+07 )
							if( Raw_Money_Flow <= 1.17108e+07 )
								if( Positive_Money_Flow_Sum <= 4.35609e+07 )
									ret := 0.089206
								if( Positive_Money_Flow_Sum > 4.35609e+07 )
									ret := 0.296296
							if( Raw_Money_Flow > 1.17108e+07 )
								if( Negative_Money_Flow_Sum <= 2.41383e+07 )
									ret := 0.401028
								if( Negative_Money_Flow_Sum > 2.41383e+07 )
									ret := 0.149560
						if( Positive_Money_Flow_Sum > 4.74881e+07 )
							if( Negative_Money_Flow_Sum <= 1.14033e+08 )
								if( Positive_Money_Flow_Sum <= 6.71706e+07 )
									ret := -0.064540
								if( Positive_Money_Flow_Sum > 6.71706e+07 )
									ret := 0.129310
							if( Negative_Money_Flow_Sum > 1.14033e+08 )
								if( Positive_Money_Flow <= 1.00805e+06 )
									ret := -0.285714
								if( Positive_Money_Flow > 1.00805e+06 )
									ret := -0.794118 // sell
				if( Negative_Money_Flow_Sum > 2.23252e+08 )
					if( Negative_Money_Flow <= 1.00058e+08 )
						if( Negative_Money_Flow <= 167236 )
							if( MFI <= 3.62612 )
								ret := 1.000000 // buy
							if( MFI > 3.62612 )
								if( VIP <= 0.616257 )
									ret := 1.000000 // buy
								if( VIP > 0.616257 )
									ret := 0.428571
						if( Negative_Money_Flow > 167236 )
							if( Money_Flow_Ratio <= 0.029468 )
								ret := 0.750000 // buy
							if( Money_Flow_Ratio > 0.029468 )
								ret := 1.000000 // buy
					if( Negative_Money_Flow > 1.00058e+08 )
						ret := 0.000000
		if( MFI > 85.806 )
			if( Typical_Price <= 116.269 )
				if( VIP <= 1.23681 )
					ret := 0.000000
				if( VIP > 1.23681 )
					if( VIP_VIM <= 0.565126 )
						if( Raw_Money_Flow <= 3.37662e+06 )
							if( Typical_Price <= 111.91 )
								ret := 0.000000
							if( Typical_Price > 111.91 )
								ret := 1.000000 // buy
						if( Raw_Money_Flow > 3.37662e+06 )
							ret := 1.000000 // buy
					if( VIP_VIM > 0.565126 )
						ret := 1.000000 // buy
			if( Typical_Price > 116.269 )
				if( MFI_High <= 10.1593 )
					if( Typical_Price <= 141.179 )
						if( VIM <= 1.06898 )
							if( Positive_Money_Flow <= 2.37776e+06 )
								if( Positive_Money_Flow_Sum <= 6.86752e+07 )
									ret := -0.006897
								if( Positive_Money_Flow_Sum > 6.86752e+07 )
									ret := 0.319444
							if( Positive_Money_Flow > 2.37776e+06 )
								if( MFI_High <= 6.23635 )
									ret := -0.461538
								if( MFI_High > 6.23635 )
									ret := 0.482270
						if( VIM > 1.06898 )
							if( VIP <= 1.24352 )
								if( Raw_Money_Flow <= 3.43403e+06 )
									ret := 0.000000
								if( Raw_Money_Flow > 3.43403e+06 )
									ret := 0.714286 // buy
							if( VIP > 1.24352 )
								if( MFI_High <= 9.21899 )
									ret := 0.850000 // buy
								if( MFI_High > 9.21899 )
									ret := 0.333333
					if( Typical_Price > 141.179 )
						if( Raw_Money_Flow <= 3.10076e+06 )
							if( VIP_VIM <= 0.816564 )
								if( Positive_Money_Flow_Sum <= 8.85825e+07 )
									ret := 0.232143
								if( Positive_Money_Flow_Sum > 8.85825e+07 )
									ret := 0.727273 // buy
							if( VIP_VIM > 0.816564 )
								ret := 1.000000 // buy
						if( Raw_Money_Flow > 3.10076e+06 )
							if( VIP <= 1.27934 )
								if( Typical_Price <= 143.996 )
									ret := 1.000000 // buy
								if( Typical_Price > 143.996 )
									ret := 0.833333 // buy
							if( VIP > 1.27934 )
								if( VIM <= 0.826127 )
									ret := 0.823529 // buy
								if( VIM > 0.826127 )
									ret := 0.285714
				if( MFI_High > 10.1593 )
					if( Positive_Money_Flow <= 917915 )
						if( VIP_VIM <= 0.861563 )
							if( MFI_Low <= 72.0526 )
								if( Negative_Money_Flow_Sum <= 9.14702e+06 )
									ret := 0.266667
								if( Negative_Money_Flow_Sum > 9.14702e+06 )
									ret := -0.352941
							if( MFI_Low > 72.0526 )
								if( VIP <= 1.55083 )
									ret := 0.569106
								if( VIP > 1.55083 )
									ret := -0.444444
						if( VIP_VIM > 0.861563 )
							if( Negative_Money_Flow_Sum <= 2.16368e+06 )
								ret := 0.166667
							if( Negative_Money_Flow_Sum > 2.16368e+06 )
								if( MFI <= 94.0018 )
									ret := -0.250000
								if( MFI > 94.0018 )
									ret := -1.000000 // sell
					if( Positive_Money_Flow > 917915 )
						if( MFI_Low <= 70.4505 )
							if( Money_Flow_Ratio <= 9.24493 )
								ret := -0.500000
							if( Money_Flow_Ratio > 9.24493 )
								if( VIP <= 1.07877 )
									ret := -0.750000 // sell
								if( VIP > 1.07877 )
									ret := -1.000000 // sell
						if( MFI_Low > 70.4505 )
							if( Positive_Money_Flow_Sum <= 5.7831e+07 )
								if( VIP <= 1.33346 )
									ret := 0.515152
								if( VIP > 1.33346 )
									ret := 0.045455
							if( Positive_Money_Flow_Sum > 5.7831e+07 )
								if( Typical_Price <= 125.408 )
									ret := -0.709677 // sell
								if( Typical_Price > 125.408 )
									ret := -0.017751
	if( Typical_Price > 144.188 )
		if( Negative_Money_Flow_Sum <= 7.16722e+07 )
			if( Positive_Money_Flow_Sum <= 1.01322e+08 )
				if( Negative_Money_Flow <= 1.20076e+07 )
					if( Positive_Money_Flow_Sum <= 9.08911e+07 )
						if( Negative_Money_Flow_Sum <= 1.24633e+07 )
							if( Positive_Money_Flow_Sum <= 4.33456e+06 )
								if( MFI_High <= -21.0708 )
									ret := -0.115991
								if( MFI_High > -21.0708 )
									ret := -0.682353
							if( Positive_Money_Flow_Sum > 4.33456e+06 )
								if( Positive_Money_Flow_Sum <= 8.51537e+07 )
									ret := 0.066264
								if( Positive_Money_Flow_Sum > 8.51537e+07 )
									ret := -0.658537
						if( Negative_Money_Flow_Sum > 1.24633e+07 )
							if( Money_Flow_Ratio <= 0.225595 )
								if( VIP <= 1.095 )
									ret := 0.130023
								if( VIP > 1.095 )
									ret := -0.140187
							if( Money_Flow_Ratio > 0.225595 )
								if( Raw_Money_Flow <= 9.9394e+06 )
									ret := -0.004344
								if( Raw_Money_Flow > 9.9394e+06 )
									ret := -0.116359
					if( Positive_Money_Flow_Sum > 9.08911e+07 )
						if( Positive_Money_Flow_Sum <= 9.64207e+07 )
							if( Money_Flow_Ratio <= 6.99327 )
								if( Typical_Price <= 218.619 )
									ret := 0.726562 // buy
								if( Typical_Price > 218.619 )
									ret := -0.600000
							if( Money_Flow_Ratio > 6.99327 )
								if( VIP <= 1.29629 )
									ret := -0.909091 // sell
								if( VIP > 1.29629 )
									ret := 0.181818
						if( Positive_Money_Flow_Sum > 9.64207e+07 )
							if( VIP_VIM <= 0.705141 )
								if( Typical_Price <= 181.507 )
									ret := 0.423729
								if( Typical_Price > 181.507 )
									ret := -0.240000
							if( VIP_VIM > 0.705141 )
								if( VIP_VIM <= 0.907358 )
									ret := -0.714286 // sell
								if( VIP_VIM > 0.907358 )
									ret := -1.000000 // sell
				if( Negative_Money_Flow > 1.20076e+07 )
					if( Negative_Money_Flow <= 3.13873e+07 )
						if( Negative_Money_Flow_Sum <= 3.58033e+07 )
							if( Negative_Money_Flow <= 1.58477e+07 )
								if( Positive_Money_Flow_Sum <= 7.20712e+06 )
									ret := 0.746032 // buy
								if( Positive_Money_Flow_Sum > 7.20712e+06 )
									ret := 0.109333
							if( Negative_Money_Flow > 1.58477e+07 )
								if( VIP <= 1.06422 )
									ret := -0.311688
								if( VIP > 1.06422 )
									ret := 0.232323
						if( Negative_Money_Flow_Sum > 3.58033e+07 )
							if( MFI_High <= -28.4996 )
								if( Typical_Price <= 152.008 )
									ret := -0.092308
								if( Typical_Price > 152.008 )
									ret := 0.360197
							if( MFI_High > -28.4996 )
								if( VIP_VIM <= 0.195444 )
									ret := 0.939394 // buy
								if( VIP_VIM > 0.195444 )
									ret := 0.562500
					if( Negative_Money_Flow > 3.13873e+07 )
						if( Typical_Price <= 164.392 )
							if( VIM <= 1.22881 )
								if( VIP_VIM <= 0.118966 )
									ret := 0.666667
								if( VIP_VIM > 0.118966 )
									ret := -0.117647
							if( VIM > 1.22881 )
								ret := -0.833333 // sell
						if( Typical_Price > 164.392 )
							if( VIP_VIM <= -0.177991 )
								if( Typical_Price <= 196.738 )
									ret := 0.166667
								if( Typical_Price > 196.738 )
									ret := 1.000000 // buy
							if( VIP_VIM > -0.177991 )
								if( Raw_Money_Flow <= 4.6246e+07 )
									ret := -0.811321 // sell
								if( Raw_Money_Flow > 4.6246e+07 )
									ret := 0.250000
			if( Positive_Money_Flow_Sum > 1.01322e+08 )
				if( Positive_Money_Flow_Sum <= 3.24869e+08 )
					if( Raw_Money_Flow <= 1.8483e+06 )
						if( Positive_Money_Flow_Sum <= 1.47618e+08 )
							if( VIP <= 1.21515 )
								if( Negative_Money_Flow_Sum <= 1.75581e+07 )
									ret := 0.241379
								if( Negative_Money_Flow_Sum > 1.75581e+07 )
									ret := -0.692308
							if( VIP > 1.21515 )
								if( Positive_Money_Flow <= 14881.7 )
									ret := 0.674419
								if( Positive_Money_Flow > 14881.7 )
									ret := -0.207547
						if( Positive_Money_Flow_Sum > 1.47618e+08 )
							if( VIP_VIM <= 0.439595 )
								if( VIP <= 1.19832 )
									ret := 0.767442 // buy
								if( VIP > 1.19832 )
									ret := 0.000000
							if( VIP_VIM > 0.439595 )
								if( Negative_Money_Flow_Sum <= 1.06131e+07 )
									ret := -0.523810
								if( Negative_Money_Flow_Sum > 1.06131e+07 )
									ret := 0.750000 // buy
					if( Raw_Money_Flow > 1.8483e+06 )
						if( MFI_High <= -0.442009 )
							if( Negative_Money_Flow_Sum <= 4.37339e+07 )
								if( VIP <= 1.33557 )
									ret := 0.336066
								if( VIP > 1.33557 )
									ret := -0.761905 // sell
							if( Negative_Money_Flow_Sum > 4.37339e+07 )
								if( VIP_VIM <= -0.05341 )
									ret := 0.222222
								if( VIP_VIM > -0.05341 )
									ret := -0.736842 // sell
						if( MFI_High > -0.442009 )
							if( Negative_Money_Flow_Sum <= 1.64232e+07 )
								if( Raw_Money_Flow <= 4.25255e+06 )
									ret := -0.505495
								if( Raw_Money_Flow > 4.25255e+06 )
									ret := -0.019048
							if( Negative_Money_Flow_Sum > 1.64232e+07 )
								if( VIM <= 1.22041 )
									ret := -0.681319
								if( VIM > 1.22041 )
									ret := 0.142857
				if( Positive_Money_Flow_Sum > 3.24869e+08 )
					if( Typical_Price <= 152.047 )
						if( MFI_High <= 13.2543 )
							ret := 1.000000 // buy
						if( MFI_High > 13.2543 )
							ret := 0.750000 // buy
					if( Typical_Price > 152.047 )
						if( VIM <= 0.882149 )
							if( Negative_Money_Flow_Sum <= 1.51611e+07 )
								ret := 0.000000
							if( Negative_Money_Flow_Sum > 1.51611e+07 )
								ret := -0.500000
						if( VIM > 0.882149 )
							ret := 0.714286 // buy
		if( Negative_Money_Flow_Sum > 7.16722e+07 )
			if( Typical_Price <= 201.788 )
				if( Positive_Money_Flow_Sum <= 2.41122e+07 )
					if( Positive_Money_Flow <= 3522.13 )
						if( Typical_Price <= 171.91 )
							if( Negative_Money_Flow_Sum <= 1.33318e+08 )
								if( Negative_Money_Flow_Sum <= 1.02348e+08 )
									ret := 0.115254
								if( Negative_Money_Flow_Sum > 1.02348e+08 )
									ret := -0.275168
							if( Negative_Money_Flow_Sum > 1.33318e+08 )
								if( Typical_Price <= 170.903 )
									ret := 0.679245
								if( Typical_Price > 170.903 )
									ret := -0.750000 // sell
						if( Typical_Price > 171.91 )
							if( VIP <= 1.50027 )
								if( Money_Flow_Ratio <= 0.2613 )
									ret := 0.437659
								if( Money_Flow_Ratio > 0.2613 )
									ret := -0.500000
							if( VIP > 1.50027 )
								if( MFI_Low <= -10.9981 )
									ret := -1.000000 // sell
								if( MFI_Low > -10.9981 )
									ret := -0.250000
					if( Positive_Money_Flow > 3522.13 )
						if( Negative_Money_Flow <= 2.96483e+06 )
							if( Typical_Price <= 152.995 )
								if( Positive_Money_Flow <= 403473 )
									ret := -0.764706 // sell
								if( Positive_Money_Flow > 403473 )
									ret := 0.275862
							if( Typical_Price > 152.995 )
								if( MFI <= 18.5767 )
									ret := -0.189542
								if( MFI > 18.5767 )
									ret := -0.719298 // sell
						if( Negative_Money_Flow > 2.96483e+06 )
							if( MFI <= 13.7265 )
								ret := 1.000000 // buy
							if( MFI > 13.7265 )
								ret := 0.000000
				if( Positive_Money_Flow_Sum > 2.41122e+07 )
					if( Positive_Money_Flow_Sum <= 1.09118e+08 )
						if( Negative_Money_Flow <= 9360.82 )
							if( MFI <= 24.082 )
								if( VIP_VIM <= 0.148295 )
									ret := 0.480315
								if( VIP_VIM > 0.148295 )
									ret := -0.032258
							if( MFI > 24.082 )
								if( Negative_Money_Flow_Sum <= 2.32787e+08 )
									ret := -0.009412
								if( Negative_Money_Flow_Sum > 2.32787e+08 )
									ret := -0.733333 // sell
						if( Negative_Money_Flow > 9360.82 )
							if( MFI <= 17.1094 )
								if( Typical_Price <= 161.832 )
									ret := 0.666667
								if( Typical_Price > 161.832 )
									ret := -0.696970
							if( MFI > 17.1094 )
								if( Negative_Money_Flow_Sum <= 1.58482e+08 )
									ret := 0.336000
								if( Negative_Money_Flow_Sum > 1.58482e+08 )
									ret := 0.797101 // buy
					if( Positive_Money_Flow_Sum > 1.09118e+08 )
						if( Typical_Price <= 156.465 )
							if( VIP <= 0.91555 )
								ret := 0.000000
							if( VIP > 0.91555 )
								if( MFI <= 58.7618 )
									ret := -1.000000 // sell
								if( MFI > 58.7618 )
									ret := -0.500000
						if( Typical_Price > 156.465 )
							if( MFI_High <= -9.30288 )
								if( Typical_Price <= 192.714 )
									ret := 0.613636
								if( Typical_Price > 192.714 )
									ret := 0.954545 // buy
							if( MFI_High > -9.30288 )
								ret := -0.750000 // sell
			if( Typical_Price > 201.788 )
				if( VIP_VIM <= -0.277549 )
					if( Typical_Price <= 209.307 )
						if( MFI_Low <= -7.55709 )
							if( VIP_VIM <= -0.752902 )
								ret := 0.500000
							if( VIP_VIM > -0.752902 )
								if( VIM <= 1.32421 )
									ret := -0.772727 // sell
								if( VIM > 1.32421 )
									ret := 0.000000
						if( MFI_Low > -7.55709 )
							if( Typical_Price <= 205.439 )
								if( VIM <= 1.2475 )
									ret := 0.000000
								if( VIM > 1.2475 )
									ret := 0.937500 // buy
							if( Typical_Price > 205.439 )
								if( VIM <= 1.31612 )
									ret := 0.090909
								if( VIM > 1.31612 )
									ret := -0.666667
					if( Typical_Price > 209.307 )
						if( Typical_Price <= 225.856 )
							if( VIP_VIM <= -0.655667 )
								ret := 0.000000
							if( VIP_VIM > -0.655667 )
								if( VIP_VIM <= -0.33306 )
									ret := 0.833333 // buy
								if( VIP_VIM > -0.33306 )
									ret := 0.250000
						if( Typical_Price > 225.856 )
							if( VIP_VIM <= -0.57486 )
								ret := 0.500000
							if( VIP_VIM > -0.57486 )
								ret := 0.000000
				if( VIP_VIM > -0.277549 )
					if( VIM <= 1.15936 )
						if( MFI <= 38.6707 )
							if( Money_Flow_Ratio <= 0.156606 )
								if( Raw_Money_Flow <= 870980 )
									ret := -1.000000 // sell
								if( Raw_Money_Flow > 870980 )
									ret := -0.300000
							if( Money_Flow_Ratio > 0.156606 )
								if( Negative_Money_Flow_Sum <= 9.107e+07 )
									ret := 0.268657
								if( Negative_Money_Flow_Sum > 9.107e+07 )
									ret := -0.121622
						if( MFI > 38.6707 )
							if( VIP <= 1.21625 )
								if( Positive_Money_Flow_Sum <= 2.65332e+08 )
									ret := -0.500000
								if( Positive_Money_Flow_Sum > 2.65332e+08 )
									ret := 1.000000 // buy
							if( VIP > 1.21625 )
								if( VIP <= 1.39332 )
									ret := -1.000000 // sell
								if( VIP > 1.39332 )
									ret := -0.500000
					if( VIM > 1.15936 )
						if( VIP <= 1.24185 )
							if( Positive_Money_Flow_Sum <= 1.81849e+07 )
								if( VIP <= 1.08356 )
									ret := 0.100000
								if( VIP > 1.08356 )
									ret := -0.875000 // sell
							if( Positive_Money_Flow_Sum > 1.81849e+07 )
								if( Negative_Money_Flow_Sum <= 1.01817e+08 )
									ret := -0.333333
								if( Negative_Money_Flow_Sum > 1.01817e+08 )
									ret := -1.000000 // sell
						if( VIP > 1.24185 )
							if( Positive_Money_Flow <= 17320.4 )
								ret := -0.166667
							if( Positive_Money_Flow > 17320.4 )
								ret := 0.500000
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
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
float op_operation = decision_tree_0_FFIV_15Min_eacc10e0(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, VIP, VIP_VIM, VIM)

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


